// $ANTLR 2.7.2: "XPathParser2.g" -> "XPathParser2.java"$

	package org.exist.parser;

	import antlr.debug.misc.*;
	import java.io.StringReader;
	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Iterator;
	import java.util.Stack;
	import org.exist.storage.BrokerPool;
	import org.exist.storage.DBBroker;
	import org.exist.storage.analysis.Tokenizer;
	import org.exist.EXistException;
	import org.exist.dom.DocumentSet;
	import org.exist.dom.DocumentImpl;
	import org.exist.dom.QName;
	import org.exist.security.PermissionDeniedException;
	import org.exist.security.User;
	import org.exist.xpath.*;
	import org.exist.xpath.value.*;
	import org.exist.xpath.functions.*;

import antlr.TokenBuffer;
import antlr.TokenStreamException;
import antlr.TokenStreamIOException;
import antlr.ANTLRException;
import antlr.LLkParser;
import antlr.Token;
import antlr.TokenStream;
import antlr.RecognitionException;
import antlr.NoViableAltException;
import antlr.MismatchedTokenException;
import antlr.SemanticException;
import antlr.ParserSharedInputState;
import antlr.collections.impl.BitSet;
import antlr.collections.AST;
import java.util.Hashtable;
import antlr.ASTFactory;
import antlr.ASTPair;
import antlr.collections.impl.ASTArray;

public class XPathParser2 extends antlr.LLkParser       implements XPathParser2TokenTypes
 {

	protected ArrayList exceptions= new ArrayList(2);
	protected boolean foundError= false;
	protected Stack globalStack = new Stack();
	protected Stack elementStack = new Stack();
	protected XPathLexer2 lexer;

	public XPathParser2(XPathLexer2 lexer, boolean dummy) {
		this((TokenStream) lexer);
		this.lexer= lexer;
	}

	public boolean foundErrors() {
		return foundError;
	}

	public String getErrorMessage() {
		StringBuffer buf= new StringBuffer();
		for (Iterator i= exceptions.iterator(); i.hasNext();) {
			buf.append(((Exception) i.next()).toString());
			buf.append('\n');
		}
		return buf.toString();
	}

	protected void handleException(Exception e) {
		foundError= true;
		exceptions.add(e);
	}

protected XPathParser2(TokenBuffer tokenBuf, int k) {
  super(tokenBuf,k);
  tokenNames = _tokenNames;
  buildTokenTypeASTClassMap();
  astFactory = new ASTFactory(getTokenTypeToASTClassMap());
}

public XPathParser2(TokenBuffer tokenBuf) {
  this(tokenBuf,1);
}

protected XPathParser2(TokenStream lexer, int k) {
  super(lexer,k);
  tokenNames = _tokenNames;
  buildTokenTypeASTClassMap();
  astFactory = new ASTFactory(getTokenTypeToASTClassMap());
}

public XPathParser2(TokenStream lexer) {
  this(lexer,1);
}

public XPathParser2(ParserSharedInputState state) {
  super(state,1);
  tokenNames = _tokenNames;
  buildTokenTypeASTClassMap();
  astFactory = new ASTFactory(getTokenTypeToASTClassMap());
}

	public final void imaginaryTokenDefinitions() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST imaginaryTokenDefinitions_AST = null;
		
		AST tmp79_AST = null;
		tmp79_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp79_AST);
		match(QNAME);
		AST tmp80_AST = null;
		tmp80_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp80_AST);
		match(PREDICATE);
		AST tmp81_AST = null;
		tmp81_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp81_AST);
		match(FLWOR);
		AST tmp82_AST = null;
		tmp82_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp82_AST);
		match(PARENTHESIZED);
		AST tmp83_AST = null;
		tmp83_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp83_AST);
		match(ABSOLUTE_SLASH);
		AST tmp84_AST = null;
		tmp84_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp84_AST);
		match(ABSOLUTE_DSLASH);
		AST tmp85_AST = null;
		tmp85_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp85_AST);
		match(WILDCARD);
		AST tmp86_AST = null;
		tmp86_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp86_AST);
		match(PREFIX_WILDCARD);
		AST tmp87_AST = null;
		tmp87_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp87_AST);
		match(FUNCTION);
		AST tmp88_AST = null;
		tmp88_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp88_AST);
		match(UNARY_MINUS);
		AST tmp89_AST = null;
		tmp89_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp89_AST);
		match(UNARY_PLUS);
		AST tmp90_AST = null;
		tmp90_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp90_AST);
		match(XPOINTER);
		AST tmp91_AST = null;
		tmp91_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp91_AST);
		match(XPOINTER_ID);
		AST tmp92_AST = null;
		tmp92_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp92_AST);
		match(VARIABLE_REF);
		AST tmp93_AST = null;
		tmp93_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp93_AST);
		match(VARIABLE_BINDING);
		AST tmp94_AST = null;
		tmp94_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp94_AST);
		match(ELEMENT);
		AST tmp95_AST = null;
		tmp95_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp95_AST);
		match(ATTRIBUTE);
		AST tmp96_AST = null;
		tmp96_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp96_AST);
		match(TEXT);
		AST tmp97_AST = null;
		tmp97_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp97_AST);
		match(VERSION_DECL);
		AST tmp98_AST = null;
		tmp98_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp98_AST);
		match(NAMESPACE_DECL);
		AST tmp99_AST = null;
		tmp99_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp99_AST);
		match(DEF_NAMESPACE_DECL);
		AST tmp100_AST = null;
		tmp100_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp100_AST);
		match(DEF_FUNCTION_NS_DECL);
		AST tmp101_AST = null;
		tmp101_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp101_AST);
		match(GLOBAL_VAR);
		AST tmp102_AST = null;
		tmp102_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp102_AST);
		match(FUNCTION_DECL);
		AST tmp103_AST = null;
		tmp103_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp103_AST);
		match(PROLOG);
		AST tmp104_AST = null;
		tmp104_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp104_AST);
		match(ATOMIC_TYPE);
		AST tmp105_AST = null;
		tmp105_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp105_AST);
		match(MODULE);
		AST tmp106_AST = null;
		tmp106_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp106_AST);
		match(ORDER_BY);
		imaginaryTokenDefinitions_AST = (AST)currentAST.root;
		returnAST = imaginaryTokenDefinitions_AST;
	}
	
	public final void xpointer() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST xpointer_AST = null;
		AST ex_AST = null;
		Token  nc = null;
		AST nc_AST = null;
		
		switch ( LA(1)) {
		case LITERAL_xpointer:
		{
			AST tmp107_AST = null;
			tmp107_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp107_AST);
			match(LITERAL_xpointer);
			match(LPAREN);
			expr();
			ex_AST = (AST)returnAST;
			astFactory.addASTChild(currentAST, returnAST);
			match(RPAREN);
			if ( inputState.guessing==0 ) {
				xpointer_AST = (AST)currentAST.root;
				xpointer_AST= (AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(XPOINTER,"xpointer")).add(ex_AST));
				currentAST.root = xpointer_AST;
				currentAST.child = xpointer_AST!=null &&xpointer_AST.getFirstChild()!=null ?
					xpointer_AST.getFirstChild() : xpointer_AST;
				currentAST.advanceChildToEnd();
			}
			xpointer_AST = (AST)currentAST.root;
			break;
		}
		case NCNAME:
		{
			nc = LT(1);
			nc_AST = astFactory.create(nc);
			astFactory.addASTChild(currentAST, nc_AST);
			match(NCNAME);
			if ( inputState.guessing==0 ) {
				xpointer_AST = (AST)currentAST.root;
				xpointer_AST= (AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(XPOINTER_ID,"id")).add(nc_AST));
				currentAST.root = xpointer_AST;
				currentAST.child = xpointer_AST!=null &&xpointer_AST.getFirstChild()!=null ?
					xpointer_AST.getFirstChild() : xpointer_AST;
				currentAST.advanceChildToEnd();
			}
			xpointer_AST = (AST)currentAST.root;
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		returnAST = xpointer_AST;
	}
	
	public final void expr() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST expr_AST = null;
		
		exprSingle();
		astFactory.addASTChild(currentAST, returnAST);
		{
		_loop52:
		do {
			if ((LA(1)==COMMA)) {
				AST tmp110_AST = null;
				tmp110_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp110_AST);
				match(COMMA);
				exprSingle();
				astFactory.addASTChild(currentAST, returnAST);
			}
			else {
				break _loop52;
			}
			
		} while (true);
		}
		expr_AST = (AST)currentAST.root;
		returnAST = expr_AST;
	}
	
	public final void xpath() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST xpath_AST = null;
		
		try {      // for error handling
			{
			switch ( LA(1)) {
			case LPAREN:
			case NCNAME:
			case LITERAL_xquery:
			case LITERAL_version:
			case LITERAL_declare:
			case LITERAL_namespace:
			case LITERAL_default:
			case LITERAL_function:
			case LITERAL_variable:
			case STRING_LITERAL:
			case LITERAL_element:
			case DOLLAR:
			case LITERAL_empty:
			case STAR:
			case PLUS:
			case LITERAL_item:
			case LITERAL_for:
			case LITERAL_let:
			case LITERAL_if:
			case LITERAL_then:
			case LITERAL_else:
			case LITERAL_or:
			case LITERAL_and:
			case LT:
			case MINUS:
			case LITERAL_div:
			case LITERAL_mod:
			case SLASH:
			case DSLASH:
			case LITERAL_text:
			case LITERAL_node:
			case SELF:
			case XML_COMMENT:
			case AT:
			case PARENT:
			case LITERAL_child:
			case LITERAL_self:
			case LITERAL_attribute:
			case LITERAL_descendant:
			case 100:
			case 101:
			case LITERAL_parent:
			case LITERAL_ancestor:
			case 104:
			case 105:
			case DOUBLE_LITERAL:
			case DECIMAL_LITERAL:
			case INTEGER_LITERAL:
			case LITERAL_comment:
			case 110:
			case 111:
			case XML_PI:
			case LITERAL_document:
			case LITERAL_collection:
			{
				module();
				astFactory.addASTChild(currentAST, returnAST);
				break;
			}
			case EOF:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			AST tmp111_AST = null;
			tmp111_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp111_AST);
			match(Token.EOF_TYPE);
			xpath_AST = (AST)currentAST.root;
		}
		catch (RecognitionException e) {
			if (inputState.guessing==0) {
				handleException(e);
			} else {
				throw e;
			}
		}
		returnAST = xpath_AST;
	}
	
	public final void module() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST module_AST = null;
		
		mainModule();
		astFactory.addASTChild(currentAST, returnAST);
		module_AST = (AST)currentAST.root;
		returnAST = module_AST;
	}
	
	public final void mainModule() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST mainModule_AST = null;
		
		prolog();
		astFactory.addASTChild(currentAST, returnAST);
		queryBody();
		astFactory.addASTChild(currentAST, returnAST);
		mainModule_AST = (AST)currentAST.root;
		returnAST = mainModule_AST;
	}
	
	public final void prolog() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST prolog_AST = null;
		AST v_AST = null;
		AST nd_AST = null;
		AST dnd_AST = null;
		AST fd_AST = null;
		
		{
		boolean synPredMatched10 = false;
		if (((LA(1)==LITERAL_xquery))) {
			int _m10 = mark();
			synPredMatched10 = true;
			inputState.guessing++;
			try {
				{
				match(LITERAL_xquery);
				match(LITERAL_version);
				}
			}
			catch (RecognitionException pe) {
				synPredMatched10 = false;
			}
			rewind(_m10);
			inputState.guessing--;
		}
		if ( synPredMatched10 ) {
			version();
			v_AST = (AST)returnAST;
			astFactory.addASTChild(currentAST, returnAST);
			match(SEMICOLON);
		}
		else if ((_tokenSet_0.member(LA(1)))) {
		}
		else {
			throw new NoViableAltException(LT(1), getFilename());
		}
		
		}
		{
		_loop21:
		do {
			if ((LA(1)==LITERAL_declare)) {
				{
				boolean synPredMatched14 = false;
				if (((LA(1)==LITERAL_declare))) {
					int _m14 = mark();
					synPredMatched14 = true;
					inputState.guessing++;
					try {
						{
						match(LITERAL_declare);
						match(LITERAL_namespace);
						}
					}
					catch (RecognitionException pe) {
						synPredMatched14 = false;
					}
					rewind(_m14);
					inputState.guessing--;
				}
				if ( synPredMatched14 ) {
					namespaceDecl();
					nd_AST = (AST)returnAST;
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					boolean synPredMatched16 = false;
					if (((LA(1)==LITERAL_declare))) {
						int _m16 = mark();
						synPredMatched16 = true;
						inputState.guessing++;
						try {
							{
							match(LITERAL_declare);
							match(LITERAL_default);
							}
						}
						catch (RecognitionException pe) {
							synPredMatched16 = false;
						}
						rewind(_m16);
						inputState.guessing--;
					}
					if ( synPredMatched16 ) {
						defaultNamespaceDecl();
						dnd_AST = (AST)returnAST;
						astFactory.addASTChild(currentAST, returnAST);
					}
					else {
						boolean synPredMatched18 = false;
						if (((LA(1)==LITERAL_declare))) {
							int _m18 = mark();
							synPredMatched18 = true;
							inputState.guessing++;
							try {
								{
								match(LITERAL_declare);
								match(LITERAL_function);
								}
							}
							catch (RecognitionException pe) {
								synPredMatched18 = false;
							}
							rewind(_m18);
							inputState.guessing--;
						}
						if ( synPredMatched18 ) {
							functionDecl();
							fd_AST = (AST)returnAST;
							astFactory.addASTChild(currentAST, returnAST);
						}
						else {
							boolean synPredMatched20 = false;
							if (((LA(1)==LITERAL_declare))) {
								int _m20 = mark();
								synPredMatched20 = true;
								inputState.guessing++;
								try {
									{
									match(LITERAL_declare);
									match(LITERAL_variable);
									}
								}
								catch (RecognitionException pe) {
									synPredMatched20 = false;
								}
								rewind(_m20);
								inputState.guessing--;
							}
							if ( synPredMatched20 ) {
								varDecl();
								astFactory.addASTChild(currentAST, returnAST);
							}
							else {
								throw new NoViableAltException(LT(1), getFilename());
							}
							}}}
							}
							match(SEMICOLON);
						}
						else {
							break _loop21;
						}
						
					} while (true);
					}
					prolog_AST = (AST)currentAST.root;
					returnAST = prolog_AST;
				}
				
	public final void queryBody() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST queryBody_AST = null;
		
		expr();
		astFactory.addASTChild(currentAST, returnAST);
		queryBody_AST = (AST)currentAST.root;
		returnAST = queryBody_AST;
	}
	
	public final void version() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST version_AST = null;
		Token  v = null;
		AST v_AST = null;
		
		AST tmp114_AST = null;
		tmp114_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp114_AST);
		match(LITERAL_xquery);
		AST tmp115_AST = null;
		tmp115_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp115_AST);
		match(LITERAL_version);
		v = LT(1);
		v_AST = astFactory.create(v);
		astFactory.addASTChild(currentAST, v_AST);
		match(STRING_LITERAL);
		if ( inputState.guessing==0 ) {
			version_AST = (AST)currentAST.root;
			
					version_AST = (AST)astFactory.make( (new ASTArray(1)).add(astFactory.create(VERSION_DECL,v.getText())));
				
			currentAST.root = version_AST;
			currentAST.child = version_AST!=null &&version_AST.getFirstChild()!=null ?
				version_AST.getFirstChild() : version_AST;
			currentAST.advanceChildToEnd();
		}
		version_AST = (AST)currentAST.root;
		returnAST = version_AST;
	}
	
	public final void namespaceDecl() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST namespaceDecl_AST = null;
		Token  prefix = null;
		AST prefix_AST = null;
		Token  uri = null;
		AST uri_AST = null;
		
		AST tmp116_AST = null;
		tmp116_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp116_AST);
		match(LITERAL_declare);
		AST tmp117_AST = null;
		tmp117_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp117_AST);
		match(LITERAL_namespace);
		prefix = LT(1);
		prefix_AST = astFactory.create(prefix);
		astFactory.addASTChild(currentAST, prefix_AST);
		match(NCNAME);
		match(EQ);
		uri = LT(1);
		uri_AST = astFactory.create(uri);
		astFactory.addASTChild(currentAST, uri_AST);
		match(STRING_LITERAL);
		if ( inputState.guessing==0 ) {
			namespaceDecl_AST = (AST)currentAST.root;
			
					namespaceDecl_AST = (AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(NAMESPACE_DECL,prefix.getText())).add(uri_AST));
				
			currentAST.root = namespaceDecl_AST;
			currentAST.child = namespaceDecl_AST!=null &&namespaceDecl_AST.getFirstChild()!=null ?
				namespaceDecl_AST.getFirstChild() : namespaceDecl_AST;
			currentAST.advanceChildToEnd();
		}
		namespaceDecl_AST = (AST)currentAST.root;
		returnAST = namespaceDecl_AST;
	}
	
	public final void defaultNamespaceDecl() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST defaultNamespaceDecl_AST = null;
		Token  defu = null;
		AST defu_AST = null;
		Token  deff = null;
		AST deff_AST = null;
		
		AST tmp119_AST = null;
		tmp119_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp119_AST);
		match(LITERAL_declare);
		AST tmp120_AST = null;
		tmp120_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp120_AST);
		match(LITERAL_default);
		{
		switch ( LA(1)) {
		case LITERAL_element:
		{
			AST tmp121_AST = null;
			tmp121_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp121_AST);
			match(LITERAL_element);
			AST tmp122_AST = null;
			tmp122_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp122_AST);
			match(LITERAL_namespace);
			defu = LT(1);
			defu_AST = astFactory.create(defu);
			astFactory.addASTChild(currentAST, defu_AST);
			match(STRING_LITERAL);
			if ( inputState.guessing==0 ) {
				defaultNamespaceDecl_AST = (AST)currentAST.root;
				
							defaultNamespaceDecl_AST = (AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(DEF_NAMESPACE_DECL,"defaultNamespaceDecl")).add(defu_AST));
						
				currentAST.root = defaultNamespaceDecl_AST;
				currentAST.child = defaultNamespaceDecl_AST!=null &&defaultNamespaceDecl_AST.getFirstChild()!=null ?
					defaultNamespaceDecl_AST.getFirstChild() : defaultNamespaceDecl_AST;
				currentAST.advanceChildToEnd();
			}
			break;
		}
		case LITERAL_function:
		{
			AST tmp123_AST = null;
			tmp123_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp123_AST);
			match(LITERAL_function);
			AST tmp124_AST = null;
			tmp124_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp124_AST);
			match(LITERAL_namespace);
			deff = LT(1);
			deff_AST = astFactory.create(deff);
			astFactory.addASTChild(currentAST, deff_AST);
			match(STRING_LITERAL);
			if ( inputState.guessing==0 ) {
				defaultNamespaceDecl_AST = (AST)currentAST.root;
				
							defaultNamespaceDecl_AST = (AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(DEF_FUNCTION_NS_DECL,"defaultFunctionNSDecl")).add(deff_AST));
						
				currentAST.root = defaultNamespaceDecl_AST;
				currentAST.child = defaultNamespaceDecl_AST!=null &&defaultNamespaceDecl_AST.getFirstChild()!=null ?
					defaultNamespaceDecl_AST.getFirstChild() : defaultNamespaceDecl_AST;
				currentAST.advanceChildToEnd();
			}
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		defaultNamespaceDecl_AST = (AST)currentAST.root;
		returnAST = defaultNamespaceDecl_AST;
	}
	
	public final void functionDecl() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST functionDecl_AST = null;
		String name = null;
		
		match(LITERAL_declare);
		match(LITERAL_function);
		name=qName();
		match(LPAREN);
		{
		switch ( LA(1)) {
		case DOLLAR:
		{
			paramList();
			astFactory.addASTChild(currentAST, returnAST);
			break;
		}
		case RPAREN:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		match(RPAREN);
		{
		switch ( LA(1)) {
		case LITERAL_as:
		{
			returnType();
			astFactory.addASTChild(currentAST, returnAST);
			break;
		}
		case LCURLY:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		functionBody();
		astFactory.addASTChild(currentAST, returnAST);
		if ( inputState.guessing==0 ) {
			functionDecl_AST = (AST)currentAST.root;
			
					functionDecl_AST = (AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(FUNCTION_DECL,name)).add(functionDecl_AST));
				
			currentAST.root = functionDecl_AST;
			currentAST.child = functionDecl_AST!=null &&functionDecl_AST.getFirstChild()!=null ?
				functionDecl_AST.getFirstChild() : functionDecl_AST;
			currentAST.advanceChildToEnd();
		}
		functionDecl_AST = (AST)currentAST.root;
		returnAST = functionDecl_AST;
	}
	
	public final void varDecl() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST varDecl_AST = null;
		AST ex_AST = null;
		String varName = null;
		
		AST tmp129_AST = null;
		tmp129_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp129_AST);
		match(LITERAL_declare);
		AST tmp130_AST = null;
		tmp130_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp130_AST);
		match(LITERAL_variable);
		match(DOLLAR);
		varName=qName();
		astFactory.addASTChild(currentAST, returnAST);
		AST tmp132_AST = null;
		tmp132_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp132_AST);
		match(LCURLY);
		expr();
		ex_AST = (AST)returnAST;
		astFactory.addASTChild(currentAST, returnAST);
		AST tmp133_AST = null;
		tmp133_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp133_AST);
		match(RCURLY);
		if ( inputState.guessing==0 ) {
			varDecl_AST = (AST)currentAST.root;
			
					varDecl_AST = (AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(GLOBAL_VAR,varName)).add(ex_AST));
				
			currentAST.root = varDecl_AST;
			currentAST.child = varDecl_AST!=null &&varDecl_AST.getFirstChild()!=null ?
				varDecl_AST.getFirstChild() : varDecl_AST;
			currentAST.advanceChildToEnd();
		}
		varDecl_AST = (AST)currentAST.root;
		returnAST = varDecl_AST;
	}
	
	public final String  qName() throws RecognitionException, TokenStreamException {
		String name;
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST qName_AST = null;
		
			name= null;
			String name2;
		
		
		boolean synPredMatched170 = false;
		if (((_tokenSet_1.member(LA(1))))) {
			int _m170 = mark();
			synPredMatched170 = true;
			inputState.guessing++;
			try {
				{
				ncnameOrKeyword();
				match(COLON);
				ncnameOrKeyword();
				}
			}
			catch (RecognitionException pe) {
				synPredMatched170 = false;
			}
			rewind(_m170);
			inputState.guessing--;
		}
		if ( synPredMatched170 ) {
			name=ncnameOrKeyword();
			astFactory.addASTChild(currentAST, returnAST);
			AST tmp134_AST = null;
			tmp134_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp134_AST);
			match(COLON);
			name2=ncnameOrKeyword();
			astFactory.addASTChild(currentAST, returnAST);
			if ( inputState.guessing==0 ) {
				name= name + ':' + name2;
			}
			qName_AST = (AST)currentAST.root;
		}
		else if ((_tokenSet_1.member(LA(1)))) {
			name=ncnameOrKeyword();
			astFactory.addASTChild(currentAST, returnAST);
			qName_AST = (AST)currentAST.root;
		}
		else {
			throw new NoViableAltException(LT(1), getFilename());
		}
		
		returnAST = qName_AST;
		return name;
	}
	
	public final void paramList() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST paramList_AST = null;
		AST p1_AST = null;
		
		param();
		astFactory.addASTChild(currentAST, returnAST);
		{
		_loop34:
		do {
			if ((LA(1)==COMMA)) {
				match(COMMA);
				param();
				p1_AST = (AST)returnAST;
				astFactory.addASTChild(currentAST, returnAST);
			}
			else {
				break _loop34;
			}
			
		} while (true);
		}
		paramList_AST = (AST)currentAST.root;
		returnAST = paramList_AST;
	}
	
	public final void returnType() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST returnType_AST = null;
		
		AST tmp136_AST = null;
		tmp136_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp136_AST);
		match(LITERAL_as);
		sequenceType();
		astFactory.addASTChild(currentAST, returnAST);
		returnType_AST = (AST)currentAST.root;
		returnAST = returnType_AST;
	}
	
	public final void functionBody() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST functionBody_AST = null;
		AST e_AST = null;
		
		AST tmp137_AST = null;
		tmp137_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp137_AST);
		match(LCURLY);
		expr();
		e_AST = (AST)returnAST;
		astFactory.addASTChild(currentAST, returnAST);
		match(RCURLY);
		functionBody_AST = (AST)currentAST.root;
		returnAST = functionBody_AST;
	}
	
	public final void sequenceType() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST sequenceType_AST = null;
		
		boolean synPredMatched40 = false;
		if (((LA(1)==LITERAL_empty))) {
			int _m40 = mark();
			synPredMatched40 = true;
			inputState.guessing++;
			try {
				{
				match(LITERAL_empty);
				match(LPAREN);
				}
			}
			catch (RecognitionException pe) {
				synPredMatched40 = false;
			}
			rewind(_m40);
			inputState.guessing--;
		}
		if ( synPredMatched40 ) {
			AST tmp139_AST = null;
			tmp139_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp139_AST);
			match(LITERAL_empty);
			match(LPAREN);
			match(RPAREN);
			sequenceType_AST = (AST)currentAST.root;
		}
		else if ((_tokenSet_2.member(LA(1)))) {
			itemType();
			astFactory.addASTChild(currentAST, returnAST);
			{
			switch ( LA(1)) {
			case QUESTION:
			case STAR:
			case PLUS:
			{
				occurrenceIndicator();
				astFactory.addASTChild(currentAST, returnAST);
				break;
			}
			case RPAREN:
			case LCURLY:
			case COMMA:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			sequenceType_AST = (AST)currentAST.root;
		}
		else {
			throw new NoViableAltException(LT(1), getFilename());
		}
		
		returnAST = sequenceType_AST;
	}
	
	public final void param() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST param_AST = null;
		AST t_AST = null;
		String varName = null;
		
		match(DOLLAR);
		varName=qName();
		astFactory.addASTChild(currentAST, returnAST);
		{
		switch ( LA(1)) {
		case LITERAL_as:
		{
			typeDeclaration();
			t_AST = (AST)returnAST;
			astFactory.addASTChild(currentAST, returnAST);
			break;
		}
		case RPAREN:
		case COMMA:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		if ( inputState.guessing==0 ) {
			param_AST = (AST)currentAST.root;
			
					param_AST = (AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(VARIABLE_BINDING,varName)).add(t_AST));
				
			currentAST.root = param_AST;
			currentAST.child = param_AST!=null &&param_AST.getFirstChild()!=null ?
				param_AST.getFirstChild() : param_AST;
			currentAST.advanceChildToEnd();
		}
		param_AST = (AST)currentAST.root;
		returnAST = param_AST;
	}
	
	public final void typeDeclaration() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST typeDeclaration_AST = null;
		
		AST tmp143_AST = null;
		tmp143_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp143_AST);
		match(LITERAL_as);
		sequenceType();
		astFactory.addASTChild(currentAST, returnAST);
		typeDeclaration_AST = (AST)currentAST.root;
		returnAST = typeDeclaration_AST;
	}
	
	public final void itemType() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST itemType_AST = null;
		
		boolean synPredMatched45 = false;
		if (((LA(1)==LITERAL_item))) {
			int _m45 = mark();
			synPredMatched45 = true;
			inputState.guessing++;
			try {
				{
				match(LITERAL_item);
				match(LPAREN);
				}
			}
			catch (RecognitionException pe) {
				synPredMatched45 = false;
			}
			rewind(_m45);
			inputState.guessing--;
		}
		if ( synPredMatched45 ) {
			AST tmp144_AST = null;
			tmp144_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp144_AST);
			match(LITERAL_item);
			match(LPAREN);
			match(RPAREN);
			itemType_AST = (AST)currentAST.root;
		}
		else {
			boolean synPredMatched47 = false;
			if (((_tokenSet_3.member(LA(1))))) {
				int _m47 = mark();
				synPredMatched47 = true;
				inputState.guessing++;
				try {
					{
					matchNot(EOF);
					match(LPAREN);
					}
				}
				catch (RecognitionException pe) {
					synPredMatched47 = false;
				}
				rewind(_m47);
				inputState.guessing--;
			}
			if ( synPredMatched47 ) {
				kindTest();
				astFactory.addASTChild(currentAST, returnAST);
				itemType_AST = (AST)currentAST.root;
			}
			else if ((_tokenSet_1.member(LA(1)))) {
				atomicType();
				astFactory.addASTChild(currentAST, returnAST);
				itemType_AST = (AST)currentAST.root;
			}
			else {
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			returnAST = itemType_AST;
		}
		
	public final void occurrenceIndicator() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST occurrenceIndicator_AST = null;
		
		switch ( LA(1)) {
		case QUESTION:
		{
			AST tmp147_AST = null;
			tmp147_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp147_AST);
			match(QUESTION);
			occurrenceIndicator_AST = (AST)currentAST.root;
			break;
		}
		case STAR:
		{
			AST tmp148_AST = null;
			tmp148_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp148_AST);
			match(STAR);
			occurrenceIndicator_AST = (AST)currentAST.root;
			break;
		}
		case PLUS:
		{
			AST tmp149_AST = null;
			tmp149_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp149_AST);
			match(PLUS);
			occurrenceIndicator_AST = (AST)currentAST.root;
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		returnAST = occurrenceIndicator_AST;
	}
	
	public final void kindTest() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST kindTest_AST = null;
		
		switch ( LA(1)) {
		case LITERAL_text:
		{
			textTest();
			astFactory.addASTChild(currentAST, returnAST);
			kindTest_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_node:
		{
			anyKindTest();
			astFactory.addASTChild(currentAST, returnAST);
			kindTest_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_element:
		{
			elementTest();
			astFactory.addASTChild(currentAST, returnAST);
			kindTest_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_attribute:
		{
			attributeTest();
			astFactory.addASTChild(currentAST, returnAST);
			kindTest_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_comment:
		{
			commentTest();
			astFactory.addASTChild(currentAST, returnAST);
			kindTest_AST = (AST)currentAST.root;
			break;
		}
		case 110:
		{
			piTest();
			astFactory.addASTChild(currentAST, returnAST);
			kindTest_AST = (AST)currentAST.root;
			break;
		}
		case 111:
		{
			documentTest();
			astFactory.addASTChild(currentAST, returnAST);
			kindTest_AST = (AST)currentAST.root;
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		returnAST = kindTest_AST;
	}
	
	public final void atomicType() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST atomicType_AST = null;
		String name = null;
		
		name=qName();
		astFactory.addASTChild(currentAST, returnAST);
		if ( inputState.guessing==0 ) {
			atomicType_AST = (AST)currentAST.root;
			
					atomicType_AST = astFactory.create(ATOMIC_TYPE,name);
				
			currentAST.root = atomicType_AST;
			currentAST.child = atomicType_AST!=null &&atomicType_AST.getFirstChild()!=null ?
				atomicType_AST.getFirstChild() : atomicType_AST;
			currentAST.advanceChildToEnd();
		}
		atomicType_AST = (AST)currentAST.root;
		returnAST = atomicType_AST;
	}
	
	public final void exprSingle() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST exprSingle_AST = null;
		
		boolean synPredMatched56 = false;
		if (((LA(1)==LITERAL_for||LA(1)==LITERAL_let))) {
			int _m56 = mark();
			synPredMatched56 = true;
			inputState.guessing++;
			try {
				{
				{
				switch ( LA(1)) {
				case LITERAL_for:
				{
					match(LITERAL_for);
					break;
				}
				case LITERAL_let:
				{
					match(LITERAL_let);
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				match(DOLLAR);
				}
			}
			catch (RecognitionException pe) {
				synPredMatched56 = false;
			}
			rewind(_m56);
			inputState.guessing--;
		}
		if ( synPredMatched56 ) {
			flworExpr();
			astFactory.addASTChild(currentAST, returnAST);
			exprSingle_AST = (AST)currentAST.root;
		}
		else {
			boolean synPredMatched58 = false;
			if (((LA(1)==LITERAL_if))) {
				int _m58 = mark();
				synPredMatched58 = true;
				inputState.guessing++;
				try {
					{
					match(LITERAL_if);
					match(LPAREN);
					}
				}
				catch (RecognitionException pe) {
					synPredMatched58 = false;
				}
				rewind(_m58);
				inputState.guessing--;
			}
			if ( synPredMatched58 ) {
				ifExpr();
				astFactory.addASTChild(currentAST, returnAST);
				exprSingle_AST = (AST)currentAST.root;
			}
			else if ((_tokenSet_4.member(LA(1)))) {
				orExpr();
				astFactory.addASTChild(currentAST, returnAST);
				exprSingle_AST = (AST)currentAST.root;
			}
			else {
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			returnAST = exprSingle_AST;
		}
		
	public final void flworExpr() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST flworExpr_AST = null;
		
		{
		int _cnt61=0;
		_loop61:
		do {
			switch ( LA(1)) {
			case LITERAL_for:
			{
				forClause();
				astFactory.addASTChild(currentAST, returnAST);
				break;
			}
			case LITERAL_let:
			{
				letClause();
				astFactory.addASTChild(currentAST, returnAST);
				break;
			}
			default:
			{
				if ( _cnt61>=1 ) { break _loop61; } else {throw new NoViableAltException(LT(1), getFilename());}
			}
			}
			_cnt61++;
		} while (true);
		}
		{
		switch ( LA(1)) {
		case LITERAL_where:
		{
			AST tmp150_AST = null;
			tmp150_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp150_AST);
			match(LITERAL_where);
			expr();
			astFactory.addASTChild(currentAST, returnAST);
			break;
		}
		case LITERAL_return:
		case LITERAL_order:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		{
		switch ( LA(1)) {
		case LITERAL_order:
		{
			orderByClause();
			astFactory.addASTChild(currentAST, returnAST);
			break;
		}
		case LITERAL_return:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		AST tmp151_AST = null;
		tmp151_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp151_AST);
		match(LITERAL_return);
		exprSingle();
		astFactory.addASTChild(currentAST, returnAST);
		flworExpr_AST = (AST)currentAST.root;
		returnAST = flworExpr_AST;
	}
	
	public final void ifExpr() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST ifExpr_AST = null;
		
		AST tmp152_AST = null;
		tmp152_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp152_AST);
		match(LITERAL_if);
		match(LPAREN);
		expr();
		astFactory.addASTChild(currentAST, returnAST);
		match(RPAREN);
		match(LITERAL_then);
		exprSingle();
		astFactory.addASTChild(currentAST, returnAST);
		match(LITERAL_else);
		exprSingle();
		astFactory.addASTChild(currentAST, returnAST);
		ifExpr_AST = (AST)currentAST.root;
		returnAST = ifExpr_AST;
	}
	
	public final void orExpr() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST orExpr_AST = null;
		
		andExpr();
		astFactory.addASTChild(currentAST, returnAST);
		{
		_loop84:
		do {
			if ((LA(1)==LITERAL_or)) {
				AST tmp157_AST = null;
				tmp157_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp157_AST);
				match(LITERAL_or);
				andExpr();
				astFactory.addASTChild(currentAST, returnAST);
			}
			else {
				break _loop84;
			}
			
		} while (true);
		}
		orExpr_AST = (AST)currentAST.root;
		returnAST = orExpr_AST;
	}
	
	public final void forClause() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST forClause_AST = null;
		
		AST tmp158_AST = null;
		tmp158_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp158_AST);
		match(LITERAL_for);
		inVarBinding();
		astFactory.addASTChild(currentAST, returnAST);
		{
		_loop66:
		do {
			if ((LA(1)==COMMA)) {
				match(COMMA);
				inVarBinding();
				astFactory.addASTChild(currentAST, returnAST);
			}
			else {
				break _loop66;
			}
			
		} while (true);
		}
		forClause_AST = (AST)currentAST.root;
		returnAST = forClause_AST;
	}
	
	public final void letClause() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST letClause_AST = null;
		
		AST tmp160_AST = null;
		tmp160_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp160_AST);
		match(LITERAL_let);
		letVarBinding();
		astFactory.addASTChild(currentAST, returnAST);
		{
		_loop69:
		do {
			if ((LA(1)==COMMA)) {
				match(COMMA);
				letVarBinding();
				astFactory.addASTChild(currentAST, returnAST);
			}
			else {
				break _loop69;
			}
			
		} while (true);
		}
		letClause_AST = (AST)currentAST.root;
		returnAST = letClause_AST;
	}
	
	public final void orderByClause() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST orderByClause_AST = null;
		
		match(LITERAL_order);
		match(LITERAL_by);
		orderSpecList();
		astFactory.addASTChild(currentAST, returnAST);
		if ( inputState.guessing==0 ) {
			orderByClause_AST = (AST)currentAST.root;
			
					orderByClause_AST = (AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(ORDER_BY,"order by")).add(orderByClause_AST));
				
			currentAST.root = orderByClause_AST;
			currentAST.child = orderByClause_AST!=null &&orderByClause_AST.getFirstChild()!=null ?
				orderByClause_AST.getFirstChild() : orderByClause_AST;
			currentAST.advanceChildToEnd();
		}
		orderByClause_AST = (AST)currentAST.root;
		returnAST = orderByClause_AST;
	}
	
	public final void inVarBinding() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST inVarBinding_AST = null;
		AST expr_AST = null;
		String varName;
		
		match(DOLLAR);
		varName=qName();
		astFactory.addASTChild(currentAST, returnAST);
		AST tmp165_AST = null;
		tmp165_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp165_AST);
		match(LITERAL_in);
		exprSingle();
		expr_AST = (AST)returnAST;
		astFactory.addASTChild(currentAST, returnAST);
		if ( inputState.guessing==0 ) {
			inVarBinding_AST = (AST)currentAST.root;
			inVarBinding_AST= (AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(VARIABLE_BINDING,varName)).add(expr_AST));
			currentAST.root = inVarBinding_AST;
			currentAST.child = inVarBinding_AST!=null &&inVarBinding_AST.getFirstChild()!=null ?
				inVarBinding_AST.getFirstChild() : inVarBinding_AST;
			currentAST.advanceChildToEnd();
		}
		inVarBinding_AST = (AST)currentAST.root;
		returnAST = inVarBinding_AST;
	}
	
	public final void letVarBinding() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST letVarBinding_AST = null;
		AST expr_AST = null;
		String varName;
		
		match(DOLLAR);
		varName=qName();
		astFactory.addASTChild(currentAST, returnAST);
		match(COLON);
		match(EQ);
		exprSingle();
		expr_AST = (AST)returnAST;
		astFactory.addASTChild(currentAST, returnAST);
		if ( inputState.guessing==0 ) {
			letVarBinding_AST = (AST)currentAST.root;
			letVarBinding_AST= (AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(VARIABLE_BINDING,varName)).add(expr_AST));
			currentAST.root = letVarBinding_AST;
			currentAST.child = letVarBinding_AST!=null &&letVarBinding_AST.getFirstChild()!=null ?
				letVarBinding_AST.getFirstChild() : letVarBinding_AST;
			currentAST.advanceChildToEnd();
		}
		letVarBinding_AST = (AST)currentAST.root;
		returnAST = letVarBinding_AST;
	}
	
	public final void orderSpecList() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST orderSpecList_AST = null;
		
		orderSpec();
		astFactory.addASTChild(currentAST, returnAST);
		{
		_loop75:
		do {
			if ((LA(1)==COMMA)) {
				match(COMMA);
				orderSpec();
				astFactory.addASTChild(currentAST, returnAST);
			}
			else {
				break _loop75;
			}
			
		} while (true);
		}
		orderSpecList_AST = (AST)currentAST.root;
		returnAST = orderSpecList_AST;
	}
	
	public final void orderSpec() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST orderSpec_AST = null;
		
		exprSingle();
		astFactory.addASTChild(currentAST, returnAST);
		orderModifier();
		astFactory.addASTChild(currentAST, returnAST);
		orderSpec_AST = (AST)currentAST.root;
		returnAST = orderSpec_AST;
	}
	
	public final void orderModifier() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST orderModifier_AST = null;
		
		{
		switch ( LA(1)) {
		case LITERAL_ascending:
		{
			AST tmp170_AST = null;
			tmp170_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp170_AST);
			match(LITERAL_ascending);
			break;
		}
		case LITERAL_descending:
		{
			AST tmp171_AST = null;
			tmp171_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp171_AST);
			match(LITERAL_descending);
			break;
		}
		case COMMA:
		case LITERAL_empty:
		case LITERAL_return:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		{
		switch ( LA(1)) {
		case LITERAL_empty:
		{
			AST tmp172_AST = null;
			tmp172_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp172_AST);
			match(LITERAL_empty);
			{
			switch ( LA(1)) {
			case LITERAL_greatest:
			{
				AST tmp173_AST = null;
				tmp173_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp173_AST);
				match(LITERAL_greatest);
				break;
			}
			case LITERAL_least:
			{
				AST tmp174_AST = null;
				tmp174_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp174_AST);
				match(LITERAL_least);
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			break;
		}
		case COMMA:
		case LITERAL_return:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		orderModifier_AST = (AST)currentAST.root;
		returnAST = orderModifier_AST;
	}
	
	public final void andExpr() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST andExpr_AST = null;
		
		comparisonExpr();
		astFactory.addASTChild(currentAST, returnAST);
		{
		_loop87:
		do {
			if ((LA(1)==LITERAL_and)) {
				AST tmp175_AST = null;
				tmp175_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp175_AST);
				match(LITERAL_and);
				comparisonExpr();
				astFactory.addASTChild(currentAST, returnAST);
			}
			else {
				break _loop87;
			}
			
		} while (true);
		}
		andExpr_AST = (AST)currentAST.root;
		returnAST = andExpr_AST;
	}
	
	public final void comparisonExpr() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST comparisonExpr_AST = null;
		
		rangeExpr();
		astFactory.addASTChild(currentAST, returnAST);
		{
		switch ( LA(1)) {
		case EQ:
		case NEQ:
		case GT:
		case GTEQ:
		case LT:
		case LTEQ:
		{
			{
			{
			switch ( LA(1)) {
			case EQ:
			{
				AST tmp176_AST = null;
				tmp176_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp176_AST);
				match(EQ);
				break;
			}
			case NEQ:
			{
				AST tmp177_AST = null;
				tmp177_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp177_AST);
				match(NEQ);
				break;
			}
			case GT:
			{
				AST tmp178_AST = null;
				tmp178_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp178_AST);
				match(GT);
				break;
			}
			case GTEQ:
			{
				AST tmp179_AST = null;
				tmp179_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp179_AST);
				match(GTEQ);
				break;
			}
			case LT:
			{
				AST tmp180_AST = null;
				tmp180_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp180_AST);
				match(LT);
				break;
			}
			case LTEQ:
			{
				AST tmp181_AST = null;
				tmp181_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp181_AST);
				match(LTEQ);
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			rangeExpr();
			astFactory.addASTChild(currentAST, returnAST);
			}
			break;
		}
		case ANDEQ:
		case OREQ:
		{
			{
			{
			switch ( LA(1)) {
			case ANDEQ:
			{
				AST tmp182_AST = null;
				tmp182_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp182_AST);
				match(ANDEQ);
				break;
			}
			case OREQ:
			{
				AST tmp183_AST = null;
				tmp183_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp183_AST);
				match(OREQ);
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			rangeExpr();
			astFactory.addASTChild(currentAST, returnAST);
			}
			break;
		}
		case EOF:
		case RPAREN:
		case RCURLY:
		case COMMA:
		case LITERAL_empty:
		case LITERAL_for:
		case LITERAL_let:
		case LITERAL_where:
		case LITERAL_return:
		case LITERAL_order:
		case LITERAL_ascending:
		case LITERAL_descending:
		case LITERAL_else:
		case LITERAL_or:
		case LITERAL_and:
		case RPPAREN:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		comparisonExpr_AST = (AST)currentAST.root;
		returnAST = comparisonExpr_AST;
	}
	
	public final void rangeExpr() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST rangeExpr_AST = null;
		
		additiveExpr();
		astFactory.addASTChild(currentAST, returnAST);
		{
		switch ( LA(1)) {
		case LITERAL_to:
		{
			AST tmp184_AST = null;
			tmp184_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp184_AST);
			match(LITERAL_to);
			additiveExpr();
			astFactory.addASTChild(currentAST, returnAST);
			break;
		}
		case EOF:
		case RPAREN:
		case EQ:
		case RCURLY:
		case COMMA:
		case LITERAL_empty:
		case LITERAL_for:
		case LITERAL_let:
		case LITERAL_where:
		case LITERAL_return:
		case LITERAL_order:
		case LITERAL_ascending:
		case LITERAL_descending:
		case LITERAL_else:
		case LITERAL_or:
		case LITERAL_and:
		case NEQ:
		case GT:
		case GTEQ:
		case LT:
		case LTEQ:
		case ANDEQ:
		case OREQ:
		case RPPAREN:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		rangeExpr_AST = (AST)currentAST.root;
		returnAST = rangeExpr_AST;
	}
	
	public final void additiveExpr() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST additiveExpr_AST = null;
		
		multiplicativeExpr();
		astFactory.addASTChild(currentAST, returnAST);
		{
		_loop99:
		do {
			if ((LA(1)==PLUS||LA(1)==MINUS)) {
				{
				switch ( LA(1)) {
				case PLUS:
				{
					AST tmp185_AST = null;
					tmp185_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp185_AST);
					match(PLUS);
					break;
				}
				case MINUS:
				{
					AST tmp186_AST = null;
					tmp186_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp186_AST);
					match(MINUS);
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				multiplicativeExpr();
				astFactory.addASTChild(currentAST, returnAST);
			}
			else {
				break _loop99;
			}
			
		} while (true);
		}
		additiveExpr_AST = (AST)currentAST.root;
		returnAST = additiveExpr_AST;
	}
	
	public final void multiplicativeExpr() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST multiplicativeExpr_AST = null;
		
		unaryExpr();
		astFactory.addASTChild(currentAST, returnAST);
		{
		_loop103:
		do {
			if ((LA(1)==STAR||LA(1)==LITERAL_div||LA(1)==LITERAL_mod)) {
				{
				switch ( LA(1)) {
				case STAR:
				{
					AST tmp187_AST = null;
					tmp187_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp187_AST);
					match(STAR);
					break;
				}
				case LITERAL_div:
				{
					AST tmp188_AST = null;
					tmp188_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp188_AST);
					match(LITERAL_div);
					break;
				}
				case LITERAL_mod:
				{
					AST tmp189_AST = null;
					tmp189_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp189_AST);
					match(LITERAL_mod);
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				unaryExpr();
				astFactory.addASTChild(currentAST, returnAST);
			}
			else {
				break _loop103;
			}
			
		} while (true);
		}
		multiplicativeExpr_AST = (AST)currentAST.root;
		returnAST = multiplicativeExpr_AST;
	}
	
	public final void unaryExpr() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST unaryExpr_AST = null;
		AST expr_AST = null;
		AST expr2_AST = null;
		
		switch ( LA(1)) {
		case MINUS:
		{
			AST tmp190_AST = null;
			tmp190_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp190_AST);
			match(MINUS);
			unionExpr();
			expr_AST = (AST)returnAST;
			astFactory.addASTChild(currentAST, returnAST);
			if ( inputState.guessing==0 ) {
				unaryExpr_AST = (AST)currentAST.root;
				unaryExpr_AST= (AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(UNARY_MINUS,"-")).add(expr_AST));
				currentAST.root = unaryExpr_AST;
				currentAST.child = unaryExpr_AST!=null &&unaryExpr_AST.getFirstChild()!=null ?
					unaryExpr_AST.getFirstChild() : unaryExpr_AST;
				currentAST.advanceChildToEnd();
			}
			unaryExpr_AST = (AST)currentAST.root;
			break;
		}
		case PLUS:
		{
			AST tmp191_AST = null;
			tmp191_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp191_AST);
			match(PLUS);
			unionExpr();
			expr2_AST = (AST)returnAST;
			astFactory.addASTChild(currentAST, returnAST);
			if ( inputState.guessing==0 ) {
				unaryExpr_AST = (AST)currentAST.root;
				unaryExpr_AST= (AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(UNARY_PLUS,"+")).add(expr2_AST));
				currentAST.root = unaryExpr_AST;
				currentAST.child = unaryExpr_AST!=null &&unaryExpr_AST.getFirstChild()!=null ?
					unaryExpr_AST.getFirstChild() : unaryExpr_AST;
				currentAST.advanceChildToEnd();
			}
			unaryExpr_AST = (AST)currentAST.root;
			break;
		}
		case LPAREN:
		case NCNAME:
		case LITERAL_xquery:
		case LITERAL_version:
		case LITERAL_namespace:
		case LITERAL_default:
		case LITERAL_function:
		case LITERAL_variable:
		case STRING_LITERAL:
		case LITERAL_element:
		case DOLLAR:
		case LITERAL_empty:
		case STAR:
		case LITERAL_item:
		case LITERAL_for:
		case LITERAL_let:
		case LITERAL_if:
		case LITERAL_then:
		case LITERAL_else:
		case LITERAL_or:
		case LITERAL_and:
		case LT:
		case LITERAL_div:
		case LITERAL_mod:
		case SLASH:
		case DSLASH:
		case LITERAL_text:
		case LITERAL_node:
		case SELF:
		case XML_COMMENT:
		case AT:
		case PARENT:
		case LITERAL_child:
		case LITERAL_self:
		case LITERAL_attribute:
		case LITERAL_descendant:
		case 100:
		case 101:
		case LITERAL_parent:
		case LITERAL_ancestor:
		case 104:
		case 105:
		case DOUBLE_LITERAL:
		case DECIMAL_LITERAL:
		case INTEGER_LITERAL:
		case LITERAL_comment:
		case 110:
		case 111:
		case XML_PI:
		case LITERAL_document:
		case LITERAL_collection:
		{
			unionExpr();
			astFactory.addASTChild(currentAST, returnAST);
			unaryExpr_AST = (AST)currentAST.root;
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		returnAST = unaryExpr_AST;
	}
	
	public final void unionExpr() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST unionExpr_AST = null;
		
		pathExpr();
		astFactory.addASTChild(currentAST, returnAST);
		{
		switch ( LA(1)) {
		case UNION:
		{
			AST tmp192_AST = null;
			tmp192_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp192_AST);
			match(UNION);
			pathExpr();
			astFactory.addASTChild(currentAST, returnAST);
			break;
		}
		case EOF:
		case RPAREN:
		case EQ:
		case RCURLY:
		case COMMA:
		case LITERAL_empty:
		case STAR:
		case PLUS:
		case LITERAL_for:
		case LITERAL_let:
		case LITERAL_where:
		case LITERAL_return:
		case LITERAL_order:
		case LITERAL_ascending:
		case LITERAL_descending:
		case LITERAL_else:
		case LITERAL_or:
		case LITERAL_and:
		case NEQ:
		case GT:
		case GTEQ:
		case LT:
		case LTEQ:
		case ANDEQ:
		case OREQ:
		case LITERAL_to:
		case MINUS:
		case LITERAL_div:
		case LITERAL_mod:
		case RPPAREN:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		unionExpr_AST = (AST)currentAST.root;
		returnAST = unionExpr_AST;
	}
	
	public final void pathExpr() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST pathExpr_AST = null;
		AST relPath_AST = null;
		AST relPath2_AST = null;
		
		switch ( LA(1)) {
		case LPAREN:
		case NCNAME:
		case LITERAL_xquery:
		case LITERAL_version:
		case LITERAL_namespace:
		case LITERAL_default:
		case LITERAL_function:
		case LITERAL_variable:
		case STRING_LITERAL:
		case LITERAL_element:
		case DOLLAR:
		case LITERAL_empty:
		case STAR:
		case LITERAL_item:
		case LITERAL_for:
		case LITERAL_let:
		case LITERAL_if:
		case LITERAL_then:
		case LITERAL_else:
		case LITERAL_or:
		case LITERAL_and:
		case LT:
		case LITERAL_div:
		case LITERAL_mod:
		case LITERAL_text:
		case LITERAL_node:
		case SELF:
		case XML_COMMENT:
		case AT:
		case PARENT:
		case LITERAL_child:
		case LITERAL_self:
		case LITERAL_attribute:
		case LITERAL_descendant:
		case 100:
		case 101:
		case LITERAL_parent:
		case LITERAL_ancestor:
		case 104:
		case 105:
		case DOUBLE_LITERAL:
		case DECIMAL_LITERAL:
		case INTEGER_LITERAL:
		case LITERAL_comment:
		case 110:
		case 111:
		case XML_PI:
		case LITERAL_document:
		case LITERAL_collection:
		{
			relativePathExpr();
			astFactory.addASTChild(currentAST, returnAST);
			pathExpr_AST = (AST)currentAST.root;
			break;
		}
		case DSLASH:
		{
			AST tmp193_AST = null;
			tmp193_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp193_AST);
			match(DSLASH);
			relativePathExpr();
			relPath2_AST = (AST)returnAST;
			astFactory.addASTChild(currentAST, returnAST);
			if ( inputState.guessing==0 ) {
				pathExpr_AST = (AST)currentAST.root;
				pathExpr_AST= (AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(ABSOLUTE_DSLASH,"AbsoluteSlashSlash")).add(relPath2_AST));
				currentAST.root = pathExpr_AST;
				currentAST.child = pathExpr_AST!=null &&pathExpr_AST.getFirstChild()!=null ?
					pathExpr_AST.getFirstChild() : pathExpr_AST;
				currentAST.advanceChildToEnd();
			}
			pathExpr_AST = (AST)currentAST.root;
			break;
		}
		default:
			boolean synPredMatched109 = false;
			if (((LA(1)==SLASH))) {
				int _m109 = mark();
				synPredMatched109 = true;
				inputState.guessing++;
				try {
					{
					match(SLASH);
					relativePathExpr();
					}
				}
				catch (RecognitionException pe) {
					synPredMatched109 = false;
				}
				rewind(_m109);
				inputState.guessing--;
			}
			if ( synPredMatched109 ) {
				AST tmp194_AST = null;
				tmp194_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp194_AST);
				match(SLASH);
				relativePathExpr();
				relPath_AST = (AST)returnAST;
				astFactory.addASTChild(currentAST, returnAST);
				if ( inputState.guessing==0 ) {
					pathExpr_AST = (AST)currentAST.root;
					pathExpr_AST= (AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(ABSOLUTE_SLASH,"AbsoluteSlash")).add(relPath_AST));
					currentAST.root = pathExpr_AST;
					currentAST.child = pathExpr_AST!=null &&pathExpr_AST.getFirstChild()!=null ?
						pathExpr_AST.getFirstChild() : pathExpr_AST;
					currentAST.advanceChildToEnd();
				}
				pathExpr_AST = (AST)currentAST.root;
			}
			else if ((LA(1)==SLASH)) {
				AST tmp195_AST = null;
				tmp195_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp195_AST);
				match(SLASH);
				if ( inputState.guessing==0 ) {
					pathExpr_AST = (AST)currentAST.root;
					pathExpr_AST= astFactory.create(ABSOLUTE_SLASH,"AbsoluteSlash");
					currentAST.root = pathExpr_AST;
					currentAST.child = pathExpr_AST!=null &&pathExpr_AST.getFirstChild()!=null ?
						pathExpr_AST.getFirstChild() : pathExpr_AST;
					currentAST.advanceChildToEnd();
				}
				pathExpr_AST = (AST)currentAST.root;
			}
		else {
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		returnAST = pathExpr_AST;
	}
	
	public final void relativePathExpr() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST relativePathExpr_AST = null;
		
		stepExpr();
		astFactory.addASTChild(currentAST, returnAST);
		{
		_loop113:
		do {
			if ((LA(1)==SLASH||LA(1)==DSLASH)) {
				{
				switch ( LA(1)) {
				case SLASH:
				{
					AST tmp196_AST = null;
					tmp196_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp196_AST);
					match(SLASH);
					break;
				}
				case DSLASH:
				{
					AST tmp197_AST = null;
					tmp197_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp197_AST);
					match(DSLASH);
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				stepExpr();
				astFactory.addASTChild(currentAST, returnAST);
			}
			else {
				break _loop113;
			}
			
		} while (true);
		}
		relativePathExpr_AST = (AST)currentAST.root;
		returnAST = relativePathExpr_AST;
	}
	
	public final void stepExpr() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST stepExpr_AST = null;
		
		boolean synPredMatched117 = false;
		if (((_tokenSet_5.member(LA(1))))) {
			int _m117 = mark();
			synPredMatched117 = true;
			inputState.guessing++;
			try {
				{
				{
				switch ( LA(1)) {
				case LITERAL_text:
				{
					match(LITERAL_text);
					break;
				}
				case LITERAL_node:
				{
					match(LITERAL_node);
					break;
				}
				case LITERAL_element:
				{
					match(LITERAL_element);
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				match(LPAREN);
				}
			}
			catch (RecognitionException pe) {
				synPredMatched117 = false;
			}
			rewind(_m117);
			inputState.guessing--;
		}
		if ( synPredMatched117 ) {
			axisStep();
			astFactory.addASTChild(currentAST, returnAST);
			stepExpr_AST = (AST)currentAST.root;
		}
		else {
			boolean synPredMatched120 = false;
			if (((_tokenSet_6.member(LA(1))))) {
				int _m120 = mark();
				synPredMatched120 = true;
				inputState.guessing++;
				try {
					{
					switch ( LA(1)) {
					case DOLLAR:
					{
						match(DOLLAR);
						break;
					}
					case NCNAME:
					case LITERAL_xquery:
					case LITERAL_version:
					case LITERAL_namespace:
					case LITERAL_default:
					case LITERAL_function:
					case LITERAL_variable:
					case LITERAL_empty:
					case LITERAL_item:
					case LITERAL_for:
					case LITERAL_let:
					case LITERAL_if:
					case LITERAL_then:
					case LITERAL_else:
					case LITERAL_or:
					case LITERAL_and:
					case LITERAL_div:
					case LITERAL_mod:
					case LITERAL_text:
					case LITERAL_node:
					case LITERAL_child:
					case LITERAL_self:
					case LITERAL_attribute:
					case LITERAL_descendant:
					case 100:
					case 101:
					case LITERAL_parent:
					case LITERAL_ancestor:
					case 104:
					case 105:
					case LITERAL_comment:
					case LITERAL_document:
					case LITERAL_collection:
					{
						{
						qName();
						match(LPAREN);
						}
						break;
					}
					case SELF:
					{
						match(SELF);
						break;
					}
					case LPAREN:
					{
						match(LPAREN);
						break;
					}
					case STRING_LITERAL:
					case DOUBLE_LITERAL:
					case DECIMAL_LITERAL:
					case INTEGER_LITERAL:
					{
						literal();
						break;
					}
					case XML_COMMENT:
					{
						match(XML_COMMENT);
						break;
					}
					case LT:
					{
						match(LT);
						break;
					}
					default:
					{
						throw new NoViableAltException(LT(1), getFilename());
					}
					}
					}
				}
				catch (RecognitionException pe) {
					synPredMatched120 = false;
				}
				rewind(_m120);
				inputState.guessing--;
			}
			if ( synPredMatched120 ) {
				filterStep();
				astFactory.addASTChild(currentAST, returnAST);
				stepExpr_AST = (AST)currentAST.root;
			}
			else if ((_tokenSet_5.member(LA(1)))) {
				axisStep();
				astFactory.addASTChild(currentAST, returnAST);
				stepExpr_AST = (AST)currentAST.root;
			}
			else {
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			returnAST = stepExpr_AST;
		}
		
	public final void axisStep() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST axisStep_AST = null;
		
		{
		forwardOrReverseStep();
		astFactory.addASTChild(currentAST, returnAST);
		}
		predicates();
		astFactory.addASTChild(currentAST, returnAST);
		axisStep_AST = (AST)currentAST.root;
		returnAST = axisStep_AST;
	}
	
	public final void literal() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST literal_AST = null;
		
		switch ( LA(1)) {
		case STRING_LITERAL:
		{
			AST tmp198_AST = null;
			tmp198_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp198_AST);
			match(STRING_LITERAL);
			literal_AST = (AST)currentAST.root;
			break;
		}
		case DOUBLE_LITERAL:
		case DECIMAL_LITERAL:
		case INTEGER_LITERAL:
		{
			numericLiteral();
			astFactory.addASTChild(currentAST, returnAST);
			literal_AST = (AST)currentAST.root;
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		returnAST = literal_AST;
	}
	
	public final void filterStep() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST filterStep_AST = null;
		
		primaryExpr();
		astFactory.addASTChild(currentAST, returnAST);
		predicates();
		astFactory.addASTChild(currentAST, returnAST);
		filterStep_AST = (AST)currentAST.root;
		returnAST = filterStep_AST;
	}
	
	public final void forwardOrReverseStep() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST forwardOrReverseStep_AST = null;
		
		boolean synPredMatched129 = false;
		if ((((LA(1) >= LITERAL_child && LA(1) <= 101)))) {
			int _m129 = mark();
			synPredMatched129 = true;
			inputState.guessing++;
			try {
				{
				forwardAxisSpecifier();
				match(COLON);
				}
			}
			catch (RecognitionException pe) {
				synPredMatched129 = false;
			}
			rewind(_m129);
			inputState.guessing--;
		}
		if ( synPredMatched129 ) {
			forwardAxis();
			astFactory.addASTChild(currentAST, returnAST);
			nodeTest();
			astFactory.addASTChild(currentAST, returnAST);
			forwardOrReverseStep_AST = (AST)currentAST.root;
		}
		else {
			boolean synPredMatched131 = false;
			if ((((LA(1) >= LITERAL_parent && LA(1) <= 105)))) {
				int _m131 = mark();
				synPredMatched131 = true;
				inputState.guessing++;
				try {
					{
					reverseAxisSpecifier();
					match(COLON);
					}
				}
				catch (RecognitionException pe) {
					synPredMatched131 = false;
				}
				rewind(_m131);
				inputState.guessing--;
			}
			if ( synPredMatched131 ) {
				reverseAxis();
				astFactory.addASTChild(currentAST, returnAST);
				nodeTest();
				astFactory.addASTChild(currentAST, returnAST);
				forwardOrReverseStep_AST = (AST)currentAST.root;
			}
			else if ((_tokenSet_5.member(LA(1)))) {
				abbrevStep();
				astFactory.addASTChild(currentAST, returnAST);
				forwardOrReverseStep_AST = (AST)currentAST.root;
			}
			else {
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			returnAST = forwardOrReverseStep_AST;
		}
		
	public final void predicates() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST predicates_AST = null;
		
		{
		_loop125:
		do {
			if ((LA(1)==LPPAREN)) {
				predicate();
				astFactory.addASTChild(currentAST, returnAST);
			}
			else {
				break _loop125;
			}
			
		} while (true);
		}
		predicates_AST = (AST)currentAST.root;
		returnAST = predicates_AST;
	}
	
	public final void predicate() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST predicate_AST = null;
		AST predExpr_AST = null;
		
		match(LPPAREN);
		expr();
		predExpr_AST = (AST)returnAST;
		astFactory.addASTChild(currentAST, returnAST);
		match(RPPAREN);
		if ( inputState.guessing==0 ) {
			predicate_AST = (AST)currentAST.root;
			predicate_AST= (AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(PREDICATE,"Pred")).add(predExpr_AST));
			currentAST.root = predicate_AST;
			currentAST.child = predicate_AST!=null &&predicate_AST.getFirstChild()!=null ?
				predicate_AST.getFirstChild() : predicate_AST;
			currentAST.advanceChildToEnd();
		}
		predicate_AST = (AST)currentAST.root;
		returnAST = predicate_AST;
	}
	
	public final void forwardAxisSpecifier() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST forwardAxisSpecifier_AST = null;
		
		switch ( LA(1)) {
		case LITERAL_child:
		{
			AST tmp201_AST = null;
			tmp201_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp201_AST);
			match(LITERAL_child);
			forwardAxisSpecifier_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_self:
		{
			AST tmp202_AST = null;
			tmp202_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp202_AST);
			match(LITERAL_self);
			forwardAxisSpecifier_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_attribute:
		{
			AST tmp203_AST = null;
			tmp203_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp203_AST);
			match(LITERAL_attribute);
			forwardAxisSpecifier_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_descendant:
		{
			AST tmp204_AST = null;
			tmp204_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp204_AST);
			match(LITERAL_descendant);
			forwardAxisSpecifier_AST = (AST)currentAST.root;
			break;
		}
		case 100:
		{
			AST tmp205_AST = null;
			tmp205_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp205_AST);
			match(100);
			forwardAxisSpecifier_AST = (AST)currentAST.root;
			break;
		}
		case 101:
		{
			AST tmp206_AST = null;
			tmp206_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp206_AST);
			match(101);
			forwardAxisSpecifier_AST = (AST)currentAST.root;
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		returnAST = forwardAxisSpecifier_AST;
	}
	
	public final void forwardAxis() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST forwardAxis_AST = null;
		
		forwardAxisSpecifier();
		astFactory.addASTChild(currentAST, returnAST);
		match(COLON);
		match(COLON);
		forwardAxis_AST = (AST)currentAST.root;
		returnAST = forwardAxis_AST;
	}
	
	public final void nodeTest() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST nodeTest_AST = null;
		
		boolean synPredMatched140 = false;
		if (((_tokenSet_3.member(LA(1))))) {
			int _m140 = mark();
			synPredMatched140 = true;
			inputState.guessing++;
			try {
				{
				matchNot(EOF);
				match(LPAREN);
				}
			}
			catch (RecognitionException pe) {
				synPredMatched140 = false;
			}
			rewind(_m140);
			inputState.guessing--;
		}
		if ( synPredMatched140 ) {
			kindTest();
			astFactory.addASTChild(currentAST, returnAST);
			nodeTest_AST = (AST)currentAST.root;
		}
		else if ((_tokenSet_7.member(LA(1)))) {
			nameTest();
			astFactory.addASTChild(currentAST, returnAST);
			nodeTest_AST = (AST)currentAST.root;
		}
		else {
			throw new NoViableAltException(LT(1), getFilename());
		}
		
		returnAST = nodeTest_AST;
	}
	
	public final void reverseAxisSpecifier() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST reverseAxisSpecifier_AST = null;
		
		switch ( LA(1)) {
		case LITERAL_parent:
		{
			AST tmp209_AST = null;
			tmp209_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp209_AST);
			match(LITERAL_parent);
			reverseAxisSpecifier_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_ancestor:
		{
			AST tmp210_AST = null;
			tmp210_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp210_AST);
			match(LITERAL_ancestor);
			reverseAxisSpecifier_AST = (AST)currentAST.root;
			break;
		}
		case 104:
		{
			AST tmp211_AST = null;
			tmp211_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp211_AST);
			match(104);
			reverseAxisSpecifier_AST = (AST)currentAST.root;
			break;
		}
		case 105:
		{
			AST tmp212_AST = null;
			tmp212_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp212_AST);
			match(105);
			reverseAxisSpecifier_AST = (AST)currentAST.root;
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		returnAST = reverseAxisSpecifier_AST;
	}
	
	public final void reverseAxis() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST reverseAxis_AST = null;
		
		reverseAxisSpecifier();
		astFactory.addASTChild(currentAST, returnAST);
		match(COLON);
		match(COLON);
		reverseAxis_AST = (AST)currentAST.root;
		returnAST = reverseAxis_AST;
	}
	
	public final void abbrevStep() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST abbrevStep_AST = null;
		
		switch ( LA(1)) {
		case NCNAME:
		case LITERAL_xquery:
		case LITERAL_version:
		case LITERAL_namespace:
		case LITERAL_default:
		case LITERAL_function:
		case LITERAL_variable:
		case LITERAL_element:
		case LITERAL_empty:
		case STAR:
		case LITERAL_item:
		case LITERAL_for:
		case LITERAL_let:
		case LITERAL_if:
		case LITERAL_then:
		case LITERAL_else:
		case LITERAL_or:
		case LITERAL_and:
		case LITERAL_div:
		case LITERAL_mod:
		case LITERAL_text:
		case LITERAL_node:
		case AT:
		case LITERAL_child:
		case LITERAL_self:
		case LITERAL_attribute:
		case LITERAL_descendant:
		case 100:
		case 101:
		case LITERAL_parent:
		case LITERAL_ancestor:
		case 104:
		case 105:
		case LITERAL_comment:
		case 110:
		case 111:
		case LITERAL_document:
		case LITERAL_collection:
		{
			{
			switch ( LA(1)) {
			case AT:
			{
				AST tmp215_AST = null;
				tmp215_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp215_AST);
				match(AT);
				break;
			}
			case NCNAME:
			case LITERAL_xquery:
			case LITERAL_version:
			case LITERAL_namespace:
			case LITERAL_default:
			case LITERAL_function:
			case LITERAL_variable:
			case LITERAL_element:
			case LITERAL_empty:
			case STAR:
			case LITERAL_item:
			case LITERAL_for:
			case LITERAL_let:
			case LITERAL_if:
			case LITERAL_then:
			case LITERAL_else:
			case LITERAL_or:
			case LITERAL_and:
			case LITERAL_div:
			case LITERAL_mod:
			case LITERAL_text:
			case LITERAL_node:
			case LITERAL_child:
			case LITERAL_self:
			case LITERAL_attribute:
			case LITERAL_descendant:
			case 100:
			case 101:
			case LITERAL_parent:
			case LITERAL_ancestor:
			case 104:
			case 105:
			case LITERAL_comment:
			case 110:
			case 111:
			case LITERAL_document:
			case LITERAL_collection:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			nodeTest();
			astFactory.addASTChild(currentAST, returnAST);
			abbrevStep_AST = (AST)currentAST.root;
			break;
		}
		case PARENT:
		{
			AST tmp216_AST = null;
			tmp216_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp216_AST);
			match(PARENT);
			abbrevStep_AST = (AST)currentAST.root;
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		returnAST = abbrevStep_AST;
	}
	
	public final void nameTest() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST nameTest_AST = null;
		String name= null;
		
		boolean synPredMatched144 = false;
		if (((LA(1)==NCNAME||LA(1)==STAR))) {
			int _m144 = mark();
			synPredMatched144 = true;
			inputState.guessing++;
			try {
				{
				switch ( LA(1)) {
				case NCNAME:
				{
					{
					match(NCNAME);
					match(COLON);
					match(STAR);
					}
					break;
				}
				case STAR:
				{
					match(STAR);
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
			}
			catch (RecognitionException pe) {
				synPredMatched144 = false;
			}
			rewind(_m144);
			inputState.guessing--;
		}
		if ( synPredMatched144 ) {
			wildcard();
			astFactory.addASTChild(currentAST, returnAST);
			nameTest_AST = (AST)currentAST.root;
		}
		else if ((_tokenSet_1.member(LA(1)))) {
			name=qName();
			astFactory.addASTChild(currentAST, returnAST);
			if ( inputState.guessing==0 ) {
				nameTest_AST = (AST)currentAST.root;
				nameTest_AST= astFactory.create(QNAME,name);
				currentAST.root = nameTest_AST;
				currentAST.child = nameTest_AST!=null &&nameTest_AST.getFirstChild()!=null ?
					nameTest_AST.getFirstChild() : nameTest_AST;
				currentAST.advanceChildToEnd();
			}
			nameTest_AST = (AST)currentAST.root;
		}
		else {
			throw new NoViableAltException(LT(1), getFilename());
		}
		
		returnAST = nameTest_AST;
	}
	
	public final void wildcard() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST wildcard_AST = null;
		Token  nc1 = null;
		AST nc1_AST = null;
		Token  nc2 = null;
		AST nc2_AST = null;
		
		boolean synPredMatched147 = false;
		if (((LA(1)==STAR))) {
			int _m147 = mark();
			synPredMatched147 = true;
			inputState.guessing++;
			try {
				{
				match(STAR);
				match(COLON);
				}
			}
			catch (RecognitionException pe) {
				synPredMatched147 = false;
			}
			rewind(_m147);
			inputState.guessing--;
		}
		if ( synPredMatched147 ) {
			match(STAR);
			match(COLON);
			nc1 = LT(1);
			nc1_AST = astFactory.create(nc1);
			astFactory.addASTChild(currentAST, nc1_AST);
			match(NCNAME);
			if ( inputState.guessing==0 ) {
				wildcard_AST = (AST)currentAST.root;
				wildcard_AST= (AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(PREFIX_WILDCARD,"*")).add(nc1_AST));
				currentAST.root = wildcard_AST;
				currentAST.child = wildcard_AST!=null &&wildcard_AST.getFirstChild()!=null ?
					wildcard_AST.getFirstChild() : wildcard_AST;
				currentAST.advanceChildToEnd();
			}
			wildcard_AST = (AST)currentAST.root;
		}
		else if ((LA(1)==NCNAME)) {
			nc2 = LT(1);
			nc2_AST = astFactory.create(nc2);
			astFactory.addASTChild(currentAST, nc2_AST);
			match(NCNAME);
			match(COLON);
			match(STAR);
			if ( inputState.guessing==0 ) {
				wildcard_AST = (AST)currentAST.root;
				wildcard_AST= (AST)astFactory.make( (new ASTArray(2)).add(nc2_AST).add(astFactory.create(WILDCARD,"*")));
				currentAST.root = wildcard_AST;
				currentAST.child = wildcard_AST!=null &&wildcard_AST.getFirstChild()!=null ?
					wildcard_AST.getFirstChild() : wildcard_AST;
				currentAST.advanceChildToEnd();
			}
			wildcard_AST = (AST)currentAST.root;
		}
		else if ((LA(1)==STAR)) {
			AST tmp221_AST = null;
			tmp221_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp221_AST);
			match(STAR);
			if ( inputState.guessing==0 ) {
				wildcard_AST = (AST)currentAST.root;
				
						// make this distinct from multiplication
						wildcard_AST= astFactory.create(WILDCARD,"*");
					
				currentAST.root = wildcard_AST;
				currentAST.child = wildcard_AST!=null &&wildcard_AST.getFirstChild()!=null ?
					wildcard_AST.getFirstChild() : wildcard_AST;
				currentAST.advanceChildToEnd();
			}
			wildcard_AST = (AST)currentAST.root;
		}
		else {
			throw new NoViableAltException(LT(1), getFilename());
		}
		
		returnAST = wildcard_AST;
	}
	
	public final void primaryExpr() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST primaryExpr_AST = null;
		String varName= null;
		
		switch ( LA(1)) {
		case NCNAME:
		case LITERAL_xquery:
		case LITERAL_version:
		case LITERAL_namespace:
		case LITERAL_default:
		case LITERAL_function:
		case LITERAL_variable:
		case LITERAL_empty:
		case LITERAL_item:
		case LITERAL_for:
		case LITERAL_let:
		case LITERAL_if:
		case LITERAL_then:
		case LITERAL_else:
		case LITERAL_or:
		case LITERAL_and:
		case LITERAL_div:
		case LITERAL_mod:
		case LITERAL_text:
		case LITERAL_node:
		case LITERAL_child:
		case LITERAL_self:
		case LITERAL_attribute:
		case LITERAL_descendant:
		case 100:
		case 101:
		case LITERAL_parent:
		case LITERAL_ancestor:
		case 104:
		case 105:
		case LITERAL_comment:
		case LITERAL_document:
		case LITERAL_collection:
		{
			functionCall();
			astFactory.addASTChild(currentAST, returnAST);
			primaryExpr_AST = (AST)currentAST.root;
			break;
		}
		case SELF:
		{
			contextItemExpr();
			astFactory.addASTChild(currentAST, returnAST);
			primaryExpr_AST = (AST)currentAST.root;
			break;
		}
		case LPAREN:
		{
			parenthesizedExpr();
			astFactory.addASTChild(currentAST, returnAST);
			primaryExpr_AST = (AST)currentAST.root;
			break;
		}
		case DOLLAR:
		{
			match(DOLLAR);
			varName=qName();
			astFactory.addASTChild(currentAST, returnAST);
			if ( inputState.guessing==0 ) {
				primaryExpr_AST = (AST)currentAST.root;
				primaryExpr_AST= astFactory.create(VARIABLE_REF,varName);
				currentAST.root = primaryExpr_AST;
				currentAST.child = primaryExpr_AST!=null &&primaryExpr_AST.getFirstChild()!=null ?
					primaryExpr_AST.getFirstChild() : primaryExpr_AST;
				currentAST.advanceChildToEnd();
			}
			primaryExpr_AST = (AST)currentAST.root;
			break;
		}
		case LT:
		case XML_COMMENT:
		case XML_PI:
		{
			constructor();
			astFactory.addASTChild(currentAST, returnAST);
			primaryExpr_AST = (AST)currentAST.root;
			break;
		}
		case STRING_LITERAL:
		case DOUBLE_LITERAL:
		case DECIMAL_LITERAL:
		case INTEGER_LITERAL:
		{
			literal();
			astFactory.addASTChild(currentAST, returnAST);
			primaryExpr_AST = (AST)currentAST.root;
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		returnAST = primaryExpr_AST;
	}
	
	public final void functionCall() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST functionCall_AST = null;
		AST params_AST = null;
		String fnName= null;
		
		fnName=qName();
		astFactory.addASTChild(currentAST, returnAST);
		match(LPAREN);
		if ( inputState.guessing==0 ) {
			functionCall_AST = (AST)currentAST.root;
			functionCall_AST= astFactory.create(FUNCTION,fnName);
			currentAST.root = functionCall_AST;
			currentAST.child = functionCall_AST!=null &&functionCall_AST.getFirstChild()!=null ?
				functionCall_AST.getFirstChild() : functionCall_AST;
			currentAST.advanceChildToEnd();
		}
		{
		switch ( LA(1)) {
		case LPAREN:
		case NCNAME:
		case LITERAL_xquery:
		case LITERAL_version:
		case LITERAL_namespace:
		case LITERAL_default:
		case LITERAL_function:
		case LITERAL_variable:
		case STRING_LITERAL:
		case LITERAL_element:
		case DOLLAR:
		case LITERAL_empty:
		case STAR:
		case PLUS:
		case LITERAL_item:
		case LITERAL_for:
		case LITERAL_let:
		case LITERAL_if:
		case LITERAL_then:
		case LITERAL_else:
		case LITERAL_or:
		case LITERAL_and:
		case LT:
		case MINUS:
		case LITERAL_div:
		case LITERAL_mod:
		case SLASH:
		case DSLASH:
		case LITERAL_text:
		case LITERAL_node:
		case SELF:
		case XML_COMMENT:
		case AT:
		case PARENT:
		case LITERAL_child:
		case LITERAL_self:
		case LITERAL_attribute:
		case LITERAL_descendant:
		case 100:
		case 101:
		case LITERAL_parent:
		case LITERAL_ancestor:
		case 104:
		case 105:
		case DOUBLE_LITERAL:
		case DECIMAL_LITERAL:
		case INTEGER_LITERAL:
		case LITERAL_comment:
		case 110:
		case 111:
		case XML_PI:
		case LITERAL_document:
		case LITERAL_collection:
		{
			functionParameters();
			params_AST = (AST)returnAST;
			astFactory.addASTChild(currentAST, returnAST);
			if ( inputState.guessing==0 ) {
				functionCall_AST = (AST)currentAST.root;
				functionCall_AST= (AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(FUNCTION,fnName)).add(params_AST));
				currentAST.root = functionCall_AST;
				currentAST.child = functionCall_AST!=null &&functionCall_AST.getFirstChild()!=null ?
					functionCall_AST.getFirstChild() : functionCall_AST;
				currentAST.advanceChildToEnd();
			}
			break;
		}
		case RPAREN:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		match(RPAREN);
		functionCall_AST = (AST)currentAST.root;
		returnAST = functionCall_AST;
	}
	
	public final void contextItemExpr() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST contextItemExpr_AST = null;
		
		AST tmp225_AST = null;
		tmp225_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp225_AST);
		match(SELF);
		contextItemExpr_AST = (AST)currentAST.root;
		returnAST = contextItemExpr_AST;
	}
	
	public final void parenthesizedExpr() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST parenthesizedExpr_AST = null;
		AST e_AST = null;
		
		match(LPAREN);
		{
		switch ( LA(1)) {
		case LPAREN:
		case NCNAME:
		case LITERAL_xquery:
		case LITERAL_version:
		case LITERAL_namespace:
		case LITERAL_default:
		case LITERAL_function:
		case LITERAL_variable:
		case STRING_LITERAL:
		case LITERAL_element:
		case DOLLAR:
		case LITERAL_empty:
		case STAR:
		case PLUS:
		case LITERAL_item:
		case LITERAL_for:
		case LITERAL_let:
		case LITERAL_if:
		case LITERAL_then:
		case LITERAL_else:
		case LITERAL_or:
		case LITERAL_and:
		case LT:
		case MINUS:
		case LITERAL_div:
		case LITERAL_mod:
		case SLASH:
		case DSLASH:
		case LITERAL_text:
		case LITERAL_node:
		case SELF:
		case XML_COMMENT:
		case AT:
		case PARENT:
		case LITERAL_child:
		case LITERAL_self:
		case LITERAL_attribute:
		case LITERAL_descendant:
		case 100:
		case 101:
		case LITERAL_parent:
		case LITERAL_ancestor:
		case 104:
		case 105:
		case DOUBLE_LITERAL:
		case DECIMAL_LITERAL:
		case INTEGER_LITERAL:
		case LITERAL_comment:
		case 110:
		case 111:
		case XML_PI:
		case LITERAL_document:
		case LITERAL_collection:
		{
			expr();
			e_AST = (AST)returnAST;
			astFactory.addASTChild(currentAST, returnAST);
			break;
		}
		case RPAREN:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		match(RPAREN);
		if ( inputState.guessing==0 ) {
			parenthesizedExpr_AST = (AST)currentAST.root;
			parenthesizedExpr_AST= (AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(PARENTHESIZED,"Parenthesized")).add(e_AST));
			currentAST.root = parenthesizedExpr_AST;
			currentAST.child = parenthesizedExpr_AST!=null &&parenthesizedExpr_AST.getFirstChild()!=null ?
				parenthesizedExpr_AST.getFirstChild() : parenthesizedExpr_AST;
			currentAST.advanceChildToEnd();
		}
		parenthesizedExpr_AST = (AST)currentAST.root;
		returnAST = parenthesizedExpr_AST;
	}
	
	public final void constructor() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST constructor_AST = null;
		
		switch ( LA(1)) {
		case LT:
		{
			elementConstructor();
			astFactory.addASTChild(currentAST, returnAST);
			constructor_AST = (AST)currentAST.root;
			break;
		}
		case XML_COMMENT:
		{
			xmlComment();
			astFactory.addASTChild(currentAST, returnAST);
			constructor_AST = (AST)currentAST.root;
			break;
		}
		case XML_PI:
		{
			xmlPI();
			astFactory.addASTChild(currentAST, returnAST);
			constructor_AST = (AST)currentAST.root;
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		returnAST = constructor_AST;
	}
	
	public final void numericLiteral() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST numericLiteral_AST = null;
		
		switch ( LA(1)) {
		case DOUBLE_LITERAL:
		{
			AST tmp228_AST = null;
			tmp228_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp228_AST);
			match(DOUBLE_LITERAL);
			numericLiteral_AST = (AST)currentAST.root;
			break;
		}
		case DECIMAL_LITERAL:
		{
			AST tmp229_AST = null;
			tmp229_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp229_AST);
			match(DECIMAL_LITERAL);
			numericLiteral_AST = (AST)currentAST.root;
			break;
		}
		case INTEGER_LITERAL:
		{
			AST tmp230_AST = null;
			tmp230_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp230_AST);
			match(INTEGER_LITERAL);
			numericLiteral_AST = (AST)currentAST.root;
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		returnAST = numericLiteral_AST;
	}
	
	public final void functionParameters() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST functionParameters_AST = null;
		
		exprSingle();
		astFactory.addASTChild(currentAST, returnAST);
		{
		_loop158:
		do {
			if ((LA(1)==COMMA)) {
				match(COMMA);
				exprSingle();
				astFactory.addASTChild(currentAST, returnAST);
			}
			else {
				break _loop158;
			}
			
		} while (true);
		}
		functionParameters_AST = (AST)currentAST.root;
		returnAST = functionParameters_AST;
	}
	
	public final void textTest() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST textTest_AST = null;
		
		AST tmp232_AST = null;
		tmp232_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp232_AST);
		match(LITERAL_text);
		match(LPAREN);
		match(RPAREN);
		textTest_AST = (AST)currentAST.root;
		returnAST = textTest_AST;
	}
	
	public final void anyKindTest() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST anyKindTest_AST = null;
		
		AST tmp235_AST = null;
		tmp235_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp235_AST);
		match(LITERAL_node);
		match(LPAREN);
		match(RPAREN);
		anyKindTest_AST = (AST)currentAST.root;
		returnAST = anyKindTest_AST;
	}
	
	public final void elementTest() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST elementTest_AST = null;
		
		AST tmp238_AST = null;
		tmp238_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp238_AST);
		match(LITERAL_element);
		match(LPAREN);
		match(RPAREN);
		elementTest_AST = (AST)currentAST.root;
		returnAST = elementTest_AST;
	}
	
	public final void attributeTest() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST attributeTest_AST = null;
		
		AST tmp241_AST = null;
		tmp241_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp241_AST);
		match(LITERAL_attribute);
		match(LPAREN);
		match(RPAREN);
		attributeTest_AST = (AST)currentAST.root;
		returnAST = attributeTest_AST;
	}
	
	public final void commentTest() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST commentTest_AST = null;
		
		AST tmp244_AST = null;
		tmp244_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp244_AST);
		match(LITERAL_comment);
		match(LPAREN);
		match(RPAREN);
		commentTest_AST = (AST)currentAST.root;
		returnAST = commentTest_AST;
	}
	
	public final void piTest() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST piTest_AST = null;
		
		AST tmp247_AST = null;
		tmp247_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp247_AST);
		match(110);
		match(LPAREN);
		match(RPAREN);
		piTest_AST = (AST)currentAST.root;
		returnAST = piTest_AST;
	}
	
	public final void documentTest() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST documentTest_AST = null;
		
		AST tmp250_AST = null;
		tmp250_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp250_AST);
		match(111);
		match(LPAREN);
		match(RPAREN);
		documentTest_AST = (AST)currentAST.root;
		returnAST = documentTest_AST;
	}
	
	public final String  ncnameOrKeyword() throws RecognitionException, TokenStreamException {
		String name;
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST ncnameOrKeyword_AST = null;
		Token  n1 = null;
		AST n1_AST = null;
		name= null;
		
		switch ( LA(1)) {
		case NCNAME:
		{
			n1 = LT(1);
			n1_AST = astFactory.create(n1);
			astFactory.addASTChild(currentAST, n1_AST);
			match(NCNAME);
			if ( inputState.guessing==0 ) {
				name= n1.getText();
			}
			ncnameOrKeyword_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_xquery:
		case LITERAL_version:
		case LITERAL_namespace:
		case LITERAL_default:
		case LITERAL_function:
		case LITERAL_variable:
		case LITERAL_empty:
		case LITERAL_item:
		case LITERAL_for:
		case LITERAL_let:
		case LITERAL_if:
		case LITERAL_then:
		case LITERAL_else:
		case LITERAL_or:
		case LITERAL_and:
		case LITERAL_div:
		case LITERAL_mod:
		case LITERAL_text:
		case LITERAL_node:
		case LITERAL_child:
		case LITERAL_self:
		case LITERAL_attribute:
		case LITERAL_descendant:
		case 100:
		case 101:
		case LITERAL_parent:
		case LITERAL_ancestor:
		case 104:
		case 105:
		case LITERAL_comment:
		case LITERAL_document:
		case LITERAL_collection:
		{
			name=reservedKeywords();
			astFactory.addASTChild(currentAST, returnAST);
			ncnameOrKeyword_AST = (AST)currentAST.root;
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		returnAST = ncnameOrKeyword_AST;
		return name;
	}
	
	public final void elementConstructor() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST elementConstructor_AST = null;
		
			String name = null;
			lexer.wsExplicit = true;
		
		
		boolean synPredMatched174 = false;
		if (((LA(1)==LT))) {
			int _m174 = mark();
			synPredMatched174 = true;
			inputState.guessing++;
			try {
				{
				match(LT);
				qName();
				match(WS);
				}
			}
			catch (RecognitionException pe) {
				synPredMatched174 = false;
			}
			rewind(_m174);
			inputState.guessing--;
		}
		if ( synPredMatched174 ) {
			elementWithAttributes();
			astFactory.addASTChild(currentAST, returnAST);
			elementConstructor_AST = (AST)currentAST.root;
		}
		else if ((LA(1)==LT)) {
			elementWithoutAttributes();
			astFactory.addASTChild(currentAST, returnAST);
			elementConstructor_AST = (AST)currentAST.root;
		}
		else {
			throw new NoViableAltException(LT(1), getFilename());
		}
		
		returnAST = elementConstructor_AST;
	}
	
	public final void xmlComment() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST xmlComment_AST = null;
		
		AST tmp253_AST = null;
		tmp253_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp253_AST);
		match(XML_COMMENT);
		match(XML_COMMENT_END);
		xmlComment_AST = (AST)currentAST.root;
		returnAST = xmlComment_AST;
	}
	
	public final void xmlPI() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST xmlPI_AST = null;
		
		AST tmp255_AST = null;
		tmp255_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp255_AST);
		match(XML_PI);
		match(XML_PI_END);
		xmlPI_AST = (AST)currentAST.root;
		returnAST = xmlPI_AST;
	}
	
	public final void elementWithAttributes() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST elementWithAttributes_AST = null;
		AST attrs_AST = null;
		AST content_AST = null;
		String name= null;
		
		match(LT);
		name=qName();
		astFactory.addASTChild(currentAST, returnAST);
		attributeList();
		attrs_AST = (AST)returnAST;
		astFactory.addASTChild(currentAST, returnAST);
		{
		switch ( LA(1)) {
		case SLASH:
		{
			{
			match(SLASH);
			match(GT);
			if ( inputState.guessing==0 ) {
				elementWithAttributes_AST = (AST)currentAST.root;
				
								if(!elementStack.isEmpty())
									lexer.inElementContent = true;
								lexer.wsExplicit = false;
								elementWithAttributes_AST= (AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(ELEMENT,name)).add(attrs_AST)); 
							
				currentAST.root = elementWithAttributes_AST;
				currentAST.child = elementWithAttributes_AST!=null &&elementWithAttributes_AST.getFirstChild()!=null ?
					elementWithAttributes_AST.getFirstChild() : elementWithAttributes_AST;
				currentAST.advanceChildToEnd();
			}
			}
			break;
		}
		case GT:
		{
			{
			match(GT);
			if ( inputState.guessing==0 ) {
				
								elementStack.push(name);
								lexer.inElementContent= true;
								lexer.wsExplicit = false;
							
			}
			mixedElementContent();
			content_AST = (AST)returnAST;
			astFactory.addASTChild(currentAST, returnAST);
			match(END_TAG_START);
			name=qName();
			match(GT);
			if ( inputState.guessing==0 ) {
				elementWithAttributes_AST = (AST)currentAST.root;
				
								if(elementStack.isEmpty())
									throw new RecognitionException("found wrong closing tag: " + name);
								String prev = (String)elementStack.pop();
								if(!prev.equals(name))
									throw new RecognitionException("found closing tag: " + name +
										"; expected: " + prev);
								elementWithAttributes_AST= (AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(ELEMENT,name)).add(attrs_AST));
								if(!elementStack.isEmpty()) {
									lexer.inElementContent = true;
									lexer.wsExplicit = false;
								}
							
				currentAST.root = elementWithAttributes_AST;
				currentAST.child = elementWithAttributes_AST!=null &&elementWithAttributes_AST.getFirstChild()!=null ?
					elementWithAttributes_AST.getFirstChild() : elementWithAttributes_AST;
				currentAST.advanceChildToEnd();
			}
			}
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		elementWithAttributes_AST = (AST)currentAST.root;
		returnAST = elementWithAttributes_AST;
	}
	
	public final void elementWithoutAttributes() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST elementWithoutAttributes_AST = null;
		AST content_AST = null;
		String name= null;
		
		AST tmp263_AST = null;
		tmp263_AST = astFactory.create(LT(1));
		astFactory.addASTChild(currentAST, tmp263_AST);
		match(LT);
		name=qName();
		astFactory.addASTChild(currentAST, returnAST);
		{
		switch ( LA(1)) {
		case SLASH:
		{
			{
			match(SLASH);
			match(GT);
			if ( inputState.guessing==0 ) {
				elementWithoutAttributes_AST = (AST)currentAST.root;
				
								lexer.wsExplicit = false;
								if(!elementStack.isEmpty())
									lexer.inElementContent = true;
								elementWithoutAttributes_AST= astFactory.create(ELEMENT,name);
							
				currentAST.root = elementWithoutAttributes_AST;
				currentAST.child = elementWithoutAttributes_AST!=null &&elementWithoutAttributes_AST.getFirstChild()!=null ?
					elementWithoutAttributes_AST.getFirstChild() : elementWithoutAttributes_AST;
				currentAST.advanceChildToEnd();
			}
			}
			break;
		}
		case GT:
		{
			{
			match(GT);
			if ( inputState.guessing==0 ) {
				
								elementStack.push(name);
								lexer.inElementContent= true;
								lexer.wsExplicit = false;
							
			}
			mixedElementContent();
			content_AST = (AST)returnAST;
			astFactory.addASTChild(currentAST, returnAST);
			match(END_TAG_START);
			name=qName();
			match(GT);
			if ( inputState.guessing==0 ) {
				elementWithoutAttributes_AST = (AST)currentAST.root;
				
								if(elementStack.isEmpty())
									throw new RecognitionException("found wrong closing tag: " + name);
								String prev = (String)elementStack.pop();
								if(!prev.equals(name))
									throw new RecognitionException("found closing tag: " + name +
										"; expected: " + prev);
								elementWithoutAttributes_AST= (AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(ELEMENT,name)).add(content_AST));
								if(!elementStack.isEmpty()) {
									lexer.inElementContent = true;
									lexer.wsExplicit = false;
								}
							
				currentAST.root = elementWithoutAttributes_AST;
				currentAST.child = elementWithoutAttributes_AST!=null &&elementWithoutAttributes_AST.getFirstChild()!=null ?
					elementWithoutAttributes_AST.getFirstChild() : elementWithoutAttributes_AST;
				currentAST.advanceChildToEnd();
			}
			}
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		elementWithoutAttributes_AST = (AST)currentAST.root;
		returnAST = elementWithoutAttributes_AST;
	}
	
	public final void mixedElementContent() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST mixedElementContent_AST = null;
		
		{
		_loop192:
		do {
			if ((_tokenSet_8.member(LA(1)))) {
				elementContent();
				astFactory.addASTChild(currentAST, returnAST);
			}
			else {
				break _loop192;
			}
			
		} while (true);
		}
		mixedElementContent_AST = (AST)currentAST.root;
		returnAST = mixedElementContent_AST;
	}
	
	public final void attributeList() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST attributeList_AST = null;
		
		{
		int _cnt185=0;
		_loop185:
		do {
			if ((LA(1)==WS)) {
				attributeDef();
				astFactory.addASTChild(currentAST, returnAST);
			}
			else {
				if ( _cnt185>=1 ) { break _loop185; } else {throw new NoViableAltException(LT(1), getFilename());}
			}
			
			_cnt185++;
		} while (true);
		}
		attributeList_AST = (AST)currentAST.root;
		returnAST = attributeList_AST;
	}
	
	public final void attributeDef() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST attributeDef_AST = null;
		AST value_AST = null;
		
			String name= null;
			lexer.parseStringLiterals= false;
		
		
		match(WS);
		name=qName();
		match(EQ);
		match(QUOT);
		if ( inputState.guessing==0 ) {
			lexer.inAttributeContent= true;
		}
		attributeValue();
		value_AST = (AST)returnAST;
		astFactory.addASTChild(currentAST, returnAST);
		if ( inputState.guessing==0 ) {
			lexer.inAttributeContent= false;
		}
		match(QUOT);
		if ( inputState.guessing==0 ) {
			lexer.parseStringLiterals= true;
		}
		if ( inputState.guessing==0 ) {
			attributeDef_AST = (AST)currentAST.root;
			attributeDef_AST= (AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(ATTRIBUTE,name)).add(value_AST));
			currentAST.root = attributeDef_AST;
			currentAST.child = attributeDef_AST!=null &&attributeDef_AST.getFirstChild()!=null ?
				attributeDef_AST.getFirstChild() : attributeDef_AST;
			currentAST.advanceChildToEnd();
		}
		attributeDef_AST = (AST)currentAST.root;
		returnAST = attributeDef_AST;
	}
	
	public final void attributeValue() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST attributeValue_AST = null;
		
		{
		int _cnt189=0;
		_loop189:
		do {
			switch ( LA(1)) {
			case ATTRIBUTE_CONTENT:
			{
				AST tmp273_AST = null;
				tmp273_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp273_AST);
				match(ATTRIBUTE_CONTENT);
				break;
			}
			case LCURLY:
			{
				attributeEnclosedExpr();
				astFactory.addASTChild(currentAST, returnAST);
				break;
			}
			default:
			{
				if ( _cnt189>=1 ) { break _loop189; } else {throw new NoViableAltException(LT(1), getFilename());}
			}
			}
			_cnt189++;
		} while (true);
		}
		attributeValue_AST = (AST)currentAST.root;
		returnAST = attributeValue_AST;
	}
	
	public final void attributeEnclosedExpr() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST attributeEnclosedExpr_AST = null;
		
		AST tmp274_AST = null;
		tmp274_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp274_AST);
		match(LCURLY);
		if ( inputState.guessing==0 ) {
			
					lexer.inAttributeContent= false;
					lexer.wsExplicit= false;
				
		}
		expr();
		astFactory.addASTChild(currentAST, returnAST);
		match(RCURLY);
		if ( inputState.guessing==0 ) {
			
					lexer.inAttributeContent= true;
					lexer.wsExplicit= true;
				
		}
		attributeEnclosedExpr_AST = (AST)currentAST.root;
		returnAST = attributeEnclosedExpr_AST;
	}
	
	public final void elementContent() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST elementContent_AST = null;
		Token  content = null;
		AST content_AST = null;
		
		switch ( LA(1)) {
		case LT:
		{
			elementConstructor();
			astFactory.addASTChild(currentAST, returnAST);
			elementContent_AST = (AST)currentAST.root;
			break;
		}
		case ELEMENT_CONTENT:
		{
			content = LT(1);
			content_AST = astFactory.create(content);
			astFactory.addASTChild(currentAST, content_AST);
			match(ELEMENT_CONTENT);
			if ( inputState.guessing==0 ) {
				elementContent_AST = (AST)currentAST.root;
				elementContent_AST= astFactory.create(TEXT,content.getText());
				currentAST.root = elementContent_AST;
				currentAST.child = elementContent_AST!=null &&elementContent_AST.getFirstChild()!=null ?
					elementContent_AST.getFirstChild() : elementContent_AST;
				currentAST.advanceChildToEnd();
			}
			elementContent_AST = (AST)currentAST.root;
			break;
		}
		case XML_COMMENT:
		{
			xmlComment();
			astFactory.addASTChild(currentAST, returnAST);
			elementContent_AST = (AST)currentAST.root;
			break;
		}
		case XML_PI:
		{
			xmlPI();
			astFactory.addASTChild(currentAST, returnAST);
			elementContent_AST = (AST)currentAST.root;
			break;
		}
		case LCURLY:
		{
			enclosedExpr();
			astFactory.addASTChild(currentAST, returnAST);
			elementContent_AST = (AST)currentAST.root;
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		returnAST = elementContent_AST;
	}
	
	public final void enclosedExpr() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST enclosedExpr_AST = null;
		
		AST tmp276_AST = null;
		tmp276_AST = astFactory.create(LT(1));
		astFactory.makeASTRoot(currentAST, tmp276_AST);
		match(LCURLY);
		if ( inputState.guessing==0 ) {
			
					globalStack.push(elementStack);
					elementStack = new Stack();
					lexer.inElementContent= false;
					lexer.wsExplicit= false;
				
		}
		expr();
		astFactory.addASTChild(currentAST, returnAST);
		match(RCURLY);
		if ( inputState.guessing==0 ) {
			
					elementStack = (Stack)globalStack.pop();
					lexer.inElementContent= true;
					lexer.wsExplicit= true;
				
		}
		enclosedExpr_AST = (AST)currentAST.root;
		returnAST = enclosedExpr_AST;
	}
	
	public final String  reservedKeywords() throws RecognitionException, TokenStreamException {
		String name;
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST reservedKeywords_AST = null;
		name= null;
		
		switch ( LA(1)) {
		case LITERAL_div:
		{
			AST tmp278_AST = null;
			tmp278_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp278_AST);
			match(LITERAL_div);
			if ( inputState.guessing==0 ) {
				name= "div";
			}
			reservedKeywords_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_mod:
		{
			AST tmp279_AST = null;
			tmp279_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp279_AST);
			match(LITERAL_mod);
			if ( inputState.guessing==0 ) {
				name= "mod";
			}
			reservedKeywords_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_text:
		{
			AST tmp280_AST = null;
			tmp280_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp280_AST);
			match(LITERAL_text);
			if ( inputState.guessing==0 ) {
				name= "text";
			}
			reservedKeywords_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_node:
		{
			AST tmp281_AST = null;
			tmp281_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp281_AST);
			match(LITERAL_node);
			if ( inputState.guessing==0 ) {
				name= "node";
			}
			reservedKeywords_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_or:
		{
			AST tmp282_AST = null;
			tmp282_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp282_AST);
			match(LITERAL_or);
			if ( inputState.guessing==0 ) {
				name= "or";
			}
			reservedKeywords_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_and:
		{
			AST tmp283_AST = null;
			tmp283_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp283_AST);
			match(LITERAL_and);
			if ( inputState.guessing==0 ) {
				name= "and";
			}
			reservedKeywords_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_child:
		{
			AST tmp284_AST = null;
			tmp284_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp284_AST);
			match(LITERAL_child);
			if ( inputState.guessing==0 ) {
				name= "child";
			}
			reservedKeywords_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_parent:
		{
			AST tmp285_AST = null;
			tmp285_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp285_AST);
			match(LITERAL_parent);
			if ( inputState.guessing==0 ) {
				name= "parent";
			}
			reservedKeywords_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_self:
		{
			AST tmp286_AST = null;
			tmp286_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp286_AST);
			match(LITERAL_self);
			if ( inputState.guessing==0 ) {
				name= "self";
			}
			reservedKeywords_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_attribute:
		{
			AST tmp287_AST = null;
			tmp287_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp287_AST);
			match(LITERAL_attribute);
			if ( inputState.guessing==0 ) {
				name= "attribute";
			}
			reservedKeywords_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_comment:
		{
			AST tmp288_AST = null;
			tmp288_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp288_AST);
			match(LITERAL_comment);
			if ( inputState.guessing==0 ) {
				name = "comment";
			}
			reservedKeywords_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_document:
		{
			AST tmp289_AST = null;
			tmp289_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp289_AST);
			match(LITERAL_document);
			if ( inputState.guessing==0 ) {
				name = "document";
			}
			reservedKeywords_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_collection:
		{
			AST tmp290_AST = null;
			tmp290_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp290_AST);
			match(LITERAL_collection);
			if ( inputState.guessing==0 ) {
				name = "collection";
			}
			reservedKeywords_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_ancestor:
		{
			AST tmp291_AST = null;
			tmp291_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp291_AST);
			match(LITERAL_ancestor);
			if ( inputState.guessing==0 ) {
				name= "ancestor";
			}
			reservedKeywords_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_descendant:
		{
			AST tmp292_AST = null;
			tmp292_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp292_AST);
			match(LITERAL_descendant);
			if ( inputState.guessing==0 ) {
				name= "descendant";
			}
			reservedKeywords_AST = (AST)currentAST.root;
			break;
		}
		case 100:
		{
			AST tmp293_AST = null;
			tmp293_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp293_AST);
			match(100);
			if ( inputState.guessing==0 ) {
				name= "descendant-or-self";
			}
			reservedKeywords_AST = (AST)currentAST.root;
			break;
		}
		case 104:
		{
			AST tmp294_AST = null;
			tmp294_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp294_AST);
			match(104);
			if ( inputState.guessing==0 ) {
				name= "ancestor-or-self";
			}
			reservedKeywords_AST = (AST)currentAST.root;
			break;
		}
		case 105:
		{
			AST tmp295_AST = null;
			tmp295_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp295_AST);
			match(105);
			if ( inputState.guessing==0 ) {
				name= "preceding-sibling";
			}
			reservedKeywords_AST = (AST)currentAST.root;
			break;
		}
		case 101:
		{
			AST tmp296_AST = null;
			tmp296_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp296_AST);
			match(101);
			if ( inputState.guessing==0 ) {
				name= "following-sibling";
			}
			reservedKeywords_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_item:
		{
			AST tmp297_AST = null;
			tmp297_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp297_AST);
			match(LITERAL_item);
			if ( inputState.guessing==0 ) {
				name = "item";
			}
			reservedKeywords_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_empty:
		{
			AST tmp298_AST = null;
			tmp298_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp298_AST);
			match(LITERAL_empty);
			if ( inputState.guessing==0 ) {
				name= "empty";
			}
			reservedKeywords_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_version:
		{
			AST tmp299_AST = null;
			tmp299_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp299_AST);
			match(LITERAL_version);
			if ( inputState.guessing==0 ) {
				name = "version";
			}
			reservedKeywords_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_xquery:
		{
			AST tmp300_AST = null;
			tmp300_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp300_AST);
			match(LITERAL_xquery);
			if ( inputState.guessing==0 ) {
				name = "xquery";
			}
			reservedKeywords_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_variable:
		{
			AST tmp301_AST = null;
			tmp301_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp301_AST);
			match(LITERAL_variable);
			if ( inputState.guessing==0 ) {
				name = "variable";
			}
			reservedKeywords_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_namespace:
		{
			AST tmp302_AST = null;
			tmp302_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp302_AST);
			match(LITERAL_namespace);
			if ( inputState.guessing==0 ) {
				name = "namespace";
			}
			reservedKeywords_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_if:
		{
			AST tmp303_AST = null;
			tmp303_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp303_AST);
			match(LITERAL_if);
			if ( inputState.guessing==0 ) {
				name = "if";
			}
			reservedKeywords_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_then:
		{
			AST tmp304_AST = null;
			tmp304_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp304_AST);
			match(LITERAL_then);
			if ( inputState.guessing==0 ) {
				name = "then";
			}
			reservedKeywords_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_else:
		{
			AST tmp305_AST = null;
			tmp305_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp305_AST);
			match(LITERAL_else);
			if ( inputState.guessing==0 ) {
				name = "else";
			}
			reservedKeywords_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_for:
		{
			AST tmp306_AST = null;
			tmp306_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp306_AST);
			match(LITERAL_for);
			if ( inputState.guessing==0 ) {
				name = "for";
			}
			reservedKeywords_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_let:
		{
			AST tmp307_AST = null;
			tmp307_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp307_AST);
			match(LITERAL_let);
			if ( inputState.guessing==0 ) {
				name = "let";
			}
			reservedKeywords_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_default:
		{
			AST tmp308_AST = null;
			tmp308_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp308_AST);
			match(LITERAL_default);
			if ( inputState.guessing==0 ) {
				name = "default";
			}
			reservedKeywords_AST = (AST)currentAST.root;
			break;
		}
		case LITERAL_function:
		{
			AST tmp309_AST = null;
			tmp309_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp309_AST);
			match(LITERAL_function);
			if ( inputState.guessing==0 ) {
				name = "function";
			}
			reservedKeywords_AST = (AST)currentAST.root;
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		returnAST = reservedKeywords_AST;
		return name;
	}
	
	
	public static final String[] _tokenNames = {
		"<0>",
		"EOF",
		"<2>",
		"NULL_TREE_LOOKAHEAD",
		"QNAME",
		"PREDICATE",
		"FLWOR",
		"PARENTHESIZED",
		"ABSOLUTE_SLASH",
		"ABSOLUTE_DSLASH",
		"WILDCARD",
		"PREFIX_WILDCARD",
		"FUNCTION",
		"UNARY_MINUS",
		"UNARY_PLUS",
		"XPOINTER",
		"XPOINTER_ID",
		"VARIABLE_REF",
		"VARIABLE_BINDING",
		"ELEMENT",
		"ATTRIBUTE",
		"TEXT",
		"VERSION_DECL",
		"NAMESPACE_DECL",
		"DEF_NAMESPACE_DECL",
		"DEF_FUNCTION_NS_DECL",
		"GLOBAL_VAR",
		"FUNCTION_DECL",
		"PROLOG",
		"ATOMIC_TYPE",
		"MODULE",
		"ORDER_BY",
		"\"xpointer\"",
		"LPAREN",
		"RPAREN",
		"NCNAME",
		"\"xquery\"",
		"\"version\"",
		"SEMICOLON",
		"\"declare\"",
		"\"namespace\"",
		"\"default\"",
		"\"function\"",
		"\"variable\"",
		"STRING_LITERAL",
		"EQ",
		"\"element\"",
		"DOLLAR",
		"LCURLY",
		"RCURLY",
		"\"as\"",
		"COMMA",
		"\"empty\"",
		"QUESTION",
		"STAR",
		"PLUS",
		"\"item\"",
		"\"for\"",
		"\"let\"",
		"\"if\"",
		"\"where\"",
		"\"return\"",
		"\"in\"",
		"COLON",
		"\"order\"",
		"\"by\"",
		"\"ascending\"",
		"\"descending\"",
		"\"greatest\"",
		"\"least\"",
		"\"then\"",
		"\"else\"",
		"\"or\"",
		"\"and\"",
		"NEQ",
		"GT",
		"GTEQ",
		"LT",
		"LTEQ",
		"ANDEQ",
		"OREQ",
		"\"to\"",
		"MINUS",
		"\"div\"",
		"\"mod\"",
		"UNION",
		"SLASH",
		"DSLASH",
		"\"text\"",
		"\"node\"",
		"SELF",
		"XML_COMMENT",
		"LPPAREN",
		"RPPAREN",
		"AT",
		"PARENT",
		"\"child\"",
		"\"self\"",
		"\"attribute\"",
		"\"descendant\"",
		"\"descendant-or-self\"",
		"\"following-sibling\"",
		"\"parent\"",
		"\"ancestor\"",
		"\"ancestor-or-self\"",
		"\"preceding-sibling\"",
		"DOUBLE_LITERAL",
		"DECIMAL_LITERAL",
		"INTEGER_LITERAL",
		"\"comment\"",
		"\"processing-instruction\"",
		"\"document-node\"",
		"WS",
		"END_TAG_START",
		"QUOT",
		"ATTRIBUTE_CONTENT",
		"ELEMENT_CONTENT",
		"XML_COMMENT_END",
		"XML_PI",
		"XML_PI_END",
		"\"document\"",
		"\"collection\"",
		"XML_PI_START",
		"CHAR",
		"BASECHAR",
		"IDEOGRAPHIC",
		"COMBINING_CHAR",
		"DIGIT",
		"EXTENDER",
		"LETTER",
		"DIGITS",
		"HEX_DIGITS",
		"NMSTART",
		"NMCHAR",
		"EXPR_COMMENT",
		"PREDEFINED_ENTITY_REF",
		"CHAR_REF",
		"NEXT_TOKEN"
	};
	
	protected void buildTokenTypeASTClassMap() {
		tokenTypeToASTClassMap=null;
	};
	
	private static final long[] mk_tokenSet_0() {
		long[] data = { 1139656695681646592L, 234468654792319936L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_0 = new BitSet(mk_tokenSet_0());
	private static final long[] mk_tokenSet_1() {
		long[] data = { 1085384243388874752L, 216212360289321920L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_1 = new BitSet(mk_tokenSet_1());
	private static final long[] mk_tokenSet_2() {
		long[] data = { 1085454612133052416L, 216423466521854912L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_2 = new BitSet(mk_tokenSet_2());
	private static final long[] mk_tokenSet_3() {
		long[] data = { 70368744177664L, 246307834822656L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_3 = new BitSet(mk_tokenSet_3());
	private static final long[] mk_tokenSet_4() {
		long[] data = { 1139656145925832704L, 234468654792319936L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_4 = new BitSet(mk_tokenSet_4());
	private static final long[] mk_tokenSet_5() {
		long[] data = { 1103469010642534400L, 216423469743080384L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_5 = new BitSet(mk_tokenSet_5());
	private static final long[] mk_tokenSet_6() {
		long[] data = { 1085542581653209088L, 234257545325716416L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_6 = new BitSet(mk_tokenSet_6());
	private static final long[] mk_tokenSet_7() {
		long[] data = { 1103398641898356736L, 216212360289321920L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_7 = new BitSet(mk_tokenSet_7());
	private static final long[] mk_tokenSet_8() {
		long[] data = { 281474976710656L, 22517998271078400L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_8 = new BitSet(mk_tokenSet_8());
	
	}
