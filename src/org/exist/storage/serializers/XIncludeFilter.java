package org.exist.storage.serializers;

import java.io.StringReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

import org.apache.log4j.Logger;
import org.exist.dom.DocumentImpl;
import org.exist.dom.DocumentSet;
import org.exist.dom.NodeProxy;
import org.exist.dom.NodeSet;
import org.exist.dom.XMLUtil;
import org.exist.parser.XPathLexer2;
import org.exist.parser.XPathParser2;
import org.exist.parser.XPathTreeParser2;
import org.exist.security.PermissionDeniedException;
import org.exist.xpath.PathExpr;
import org.exist.xpath.StaticContext;
import org.exist.xpath.XPathException;
import org.exist.xpath.value.Sequence;
import org.exist.xpath.value.Type;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

import antlr.RecognitionException;
import antlr.TokenStreamException;
import antlr.collections.AST;

/**
 * Used to filter the SAX stream generated by the
 * serializer for XInclude statements. 
 */
public class XIncludeFilter implements ContentHandler {

	private final static Logger LOG = Logger.getLogger(XIncludeFilter.class);

	public final static String XINCLUDE_NS = "http://www.w3.org/2001/XInclude";

	private ContentHandler contentHandler;
	private Serializer serializer;
	private DocumentImpl document = null;
	private HashMap namespaces = new HashMap(10);

	public XIncludeFilter(Serializer serializer, ContentHandler contentHandler) {
		this.contentHandler = contentHandler;
		this.serializer = serializer;
	}

	public XIncludeFilter(Serializer serializer) {
		this(serializer, null);
	}

	public void setContentHandler(ContentHandler handler) {
		this.contentHandler = handler;
	}

	public ContentHandler getContentHandler() {
		return contentHandler;
	}

	public void setDocument(DocumentImpl doc) {
		document = doc;
	}

	/**
	 * @see org.xml.sax.ContentHandler#characters(char, int, int)
	 */
	public void characters(char[] ch, int start, int length) throws SAXException {
		contentHandler.characters(ch, start, length);
	}

	/**
	 * @see org.xml.sax.ContentHandler#endDocument()
	 */
	public void endDocument() throws SAXException {
		contentHandler.endDocument();
	}

	/**
	 * @see org.xml.sax.ContentHandler#endElement(java.lang.String, java.lang.String, java.lang.String)
	 */
	public void endElement(String namespaceURI, String localName, String qName)
		throws SAXException {
		if (namespaceURI != null && (!namespaceURI.equals(XINCLUDE_NS)))
			contentHandler.endElement(namespaceURI, localName, qName);
	}

	/**
	 * @see org.xml.sax.ContentHandler#endPrefixMapping(java.lang.String)
	 */
	public void endPrefixMapping(String prefix) throws SAXException {
		namespaces.remove(prefix);
		contentHandler.endPrefixMapping(prefix);
	}

	/**
	 * @see org.xml.sax.ContentHandler#ignorableWhitespace(char, int, int)
	 */
	public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {
		contentHandler.ignorableWhitespace(ch, start, length);
	}

	/**
	 * @see org.xml.sax.ContentHandler#processingInstruction(java.lang.String, java.lang.String)
	 */
	public void processingInstruction(String target, String data) throws SAXException {
		contentHandler.processingInstruction(target, data);
	}

	/**
	 * @see org.xml.sax.ContentHandler#setDocumentLocator(org.xml.sax.Locator)
	 */
	public void setDocumentLocator(Locator locator) {
		contentHandler.setDocumentLocator(locator);
	}

	/**
	 * @see org.xml.sax.ContentHandler#skippedEntity(java.lang.String)
	 */
	public void skippedEntity(String name) throws SAXException {
		contentHandler.skippedEntity(name);
	}

	/**
	 * @see org.xml.sax.ContentHandler#startDocument()
	 */
	public void startDocument() throws SAXException {
		contentHandler.startDocument();
	}

	/**
	 * @see org.xml.sax.ContentHandler#startElement(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes)
	 */
	public void startElement(String namespaceURI, String localName, String qName, Attributes atts)
		throws SAXException {
		if (namespaceURI != null && namespaceURI.equals(XINCLUDE_NS)) {
			LOG.debug("found xinclude element");
			if (localName.equals("include")) {
				LOG.debug("processing include ...");
				processXInclude(atts);
			}
		} else {
			contentHandler.startElement(namespaceURI, localName, qName, atts);
		}
	}

	protected void processXInclude(Attributes atts) throws SAXException {
		// save some settings
		DocumentImpl prevDoc = document;
		boolean createContainerElements = serializer.createContainerElements;
		serializer.createContainerElements = false;

		// parse the href attribute
		String href = atts.getValue("href");
		if (href != null) {
			LOG.debug("found href=\"" + href + "\"");
			String xpointer = null;
			String docName = href;
			// try to find xpointer part
			int p = href.indexOf('#');
			if (-1 < p) {
				docName = href.substring(0, p);
				xpointer = XMLUtil.decodeAttrMarkup(href.substring(p + 1));
				LOG.debug("found xpointer: " + xpointer);
			}
			// if docName has no collection specified, assume
			// current collection 
			p = docName.lastIndexOf('/');
			if (p < 0)
				docName = document.getCollection().getName() + '/' + docName;
			// retrieve the document
			LOG.debug("loading " + docName);
			DocumentImpl doc = null;
			try {
				doc = (DocumentImpl) serializer.broker.getDocument(docName);
			} catch (PermissionDeniedException e) {
				LOG.warn("permission denied", e);
				throw new SAXException(e);
			}
			/* if document has not been found and xpointer is
			 * null, throw an exception. If xpointer != null
			 * we retry below and interpret docName as
			 * a collection.
			 */
			if (doc == null && xpointer == null)
				throw new SAXException("document " + docName + " not found");
			if (xpointer == null)
				// no xpointer found - just serialize the doc
				serializer.serializeToSAX(doc, false);
			else {
				// process the xpointer
				try {
					// build input document set
					DocumentSet docs = new DocumentSet();
					if (doc == null) {
						// try to read documents from the collection
						// specified by docName
						docs = serializer.broker.getDocumentsByCollection(docName, docs);
						// give up
						if (docs == null)
							throw new SAXException(
								"no document or collection " + "called " + docName);
					} else {
						docs.add(doc);
					}
					StaticContext context = new StaticContext(serializer.broker);
					xpointer = checkNamespaces(context, xpointer);
					Map.Entry entry;
					for(Iterator i = namespaces.entrySet().iterator(); i.hasNext(); ) {
						entry = (Map.Entry)i.next();
						context.declareNamespace((String)entry.getKey(), (String)entry.getValue());
					}
					XPathLexer2 lexer = new XPathLexer2(new StringReader(xpointer));
					XPathParser2 parser = new XPathParser2(lexer);
					XPathTreeParser2 treeParser = new XPathTreeParser2(context);
					parser.xpointer();
					if (parser.foundErrors()) {
						throw new SAXException(parser.getErrorMessage());
					}

					AST ast = parser.getAST();
					LOG.debug("generated AST: " + ast.toStringTree());

					PathExpr expr = new PathExpr(context);
					treeParser.xpointer(ast, expr);
					if (treeParser.foundErrors()) {
						throw new SAXException(treeParser.getErrorMessage());
					}
					LOG.info("xpointer query: " + expr.pprint());
					long start = System.currentTimeMillis();
					Sequence seq = expr.eval(docs, null, null);
					switch (seq.getItemType()) {
						case Type.NODE :
							NodeSet set = (NodeSet) seq;
							LOG.info("xpointer found: " + set.getLength());

							NodeProxy proxy;
							for (Iterator i = set.iterator(); i.hasNext();) {
								proxy = (NodeProxy) i.next();
								serializer.serializeToSAX(proxy, false);
							}
							break;
						default :
							String val;
							for (int i = 0; i < seq.getLength(); i++) {
								val = seq.itemAt(i).getStringValue();
								characters(val.toCharArray(), 0, val.length());
							}
							break;
					}

				} catch (RecognitionException e) {
					LOG.warn("xpointer error", e);
					throw new SAXException(e);
				} catch (TokenStreamException e) {
					LOG.warn("xpointer error", e);
					throw new SAXException(e);
				} catch (PermissionDeniedException e) {
					LOG.warn("xpointer error", e);
					throw new SAXException(e);
				} catch (XPathException e) {
					throw new SAXException(e);
				}
			}
		}
		// restore settings
		document = prevDoc;
		serializer.createContainerElements = createContainerElements;
	}

	/**
	 * @see org.xml.sax.ContentHandler#startPrefixMapping(java.lang.String, java.lang.String)
	 */
	public void startPrefixMapping(String prefix, String uri) throws SAXException {
		namespaces.put(prefix, uri);
		contentHandler.startPrefixMapping(prefix, uri);
	}

	/**
	 * Process xmlns() schema. We process these here, because namespace mappings should
	 * already been known when parsing the xpointer() expression.
	 * 
	 * @param context
	 * @param xpointer
	 * @return
	 * @throws XPathException
	 */
	private String checkNamespaces(StaticContext context, String xpointer) throws XPathException {
		int p0 = -1;
		while((p0 = xpointer.indexOf("xmlns(")) > -1) {
			if(p0 < 0)
				return xpointer;
			int p1 = xpointer.indexOf(')', p0 + 6);
			if(p1 < 0)
				throw new XPathException("expected ) for xmlns()");
			String mapping = xpointer.substring(p0 + 6, p1);
			xpointer = xpointer.substring(0, p0) + xpointer.substring(p1 + 1);
			StringTokenizer tok = new StringTokenizer(mapping, "= \t\n");
			if(tok.countTokens() < 2)
				throw new XPathException("expected prefix=namespace mapping in " + mapping);
			String prefix = tok.nextToken();
			String namespaceURI = tok.nextToken();
			System.out.println(prefix + " == " + namespaceURI);
			context.declareNamespace(prefix, namespaceURI);
		}
		return xpointer;
	}
}
