// $ANTLR 2.7.4: "XQuery.g" -> "XQueryParser.java"$

	package org.exist.xquery.parser;

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
	import org.exist.xquery.*;
	import org.exist.xquery.value.*;
	import org.exist.xquery.functions.*;

public interface XQueryTokenTypes {
	int EOF = 1;
	int NULL_TREE_LOOKAHEAD = 3;
	int QNAME = 4;
	int PREDICATE = 5;
	int FLWOR = 6;
	int PARENTHESIZED = 7;
	int ABSOLUTE_SLASH = 8;
	int ABSOLUTE_DSLASH = 9;
	int WILDCARD = 10;
	int PREFIX_WILDCARD = 11;
	int FUNCTION = 12;
	int UNARY_MINUS = 13;
	int UNARY_PLUS = 14;
	int XPOINTER = 15;
	int XPOINTER_ID = 16;
	int VARIABLE_REF = 17;
	int VARIABLE_BINDING = 18;
	int ELEMENT = 19;
	int ATTRIBUTE = 20;
	int ATTRIBUTE_CONTENT = 21;
	int TEXT = 22;
	int VERSION_DECL = 23;
	int NAMESPACE_DECL = 24;
	int DEF_NAMESPACE_DECL = 25;
	int DEF_COLLATION_DECL = 26;
	int DEF_FUNCTION_NS_DECL = 27;
	int GLOBAL_VAR = 28;
	int FUNCTION_DECL = 29;
	int PROLOG = 30;
	int OPTION = 31;
	int ATOMIC_TYPE = 32;
	int MODULE = 33;
	int ORDER_BY = 34;
	int POSITIONAL_VAR = 35;
	int BEFORE = 36;
	int AFTER = 37;
	int MODULE_DECL = 38;
	int MODULE_IMPORT = 39;
	int SCHEMA_IMPORT = 40;
	int ATTRIBUTE_TEST = 41;
	int COMP_ELEM_CONSTRUCTOR = 42;
	int COMP_ATTR_CONSTRUCTOR = 43;
	int COMP_TEXT_CONSTRUCTOR = 44;
	int COMP_COMMENT_CONSTRUCTOR = 45;
	int COMP_PI_CONSTRUCTOR = 46;
	int COMP_NS_CONSTRUCTOR = 47;
	int COMP_DOC_CONSTRUCTOR = 48;
	int LITERAL_xpointer = 49;
	int LPAREN = 50;
	int RPAREN = 51;
	int NCNAME = 52;
	int LITERAL_xquery = 53;
	int LITERAL_version = 54;
	int SEMICOLON = 55;
	int LITERAL_module = 56;
	int LITERAL_namespace = 57;
	int EQ = 58;
	int STRING_LITERAL = 59;
	int LITERAL_declare = 60;
	int LITERAL_default = 61;
	// "boundary-space" = 62
	int LITERAL_ordering = 63;
	int LITERAL_construction = 64;
	// "base-uri" = 65
	// "copy-namespaces" = 66
	int LITERAL_option = 67;
	int LITERAL_function = 68;
	int LITERAL_variable = 69;
	int LITERAL_import = 70;
	int LITERAL_encoding = 71;
	int LITERAL_collation = 72;
	int LITERAL_element = 73;
	int LITERAL_order = 74;
	int LITERAL_empty = 75;
	int LITERAL_greatest = 76;
	int LITERAL_least = 77;
	int LITERAL_preserve = 78;
	int LITERAL_strip = 79;
	int LITERAL_ordered = 80;
	int LITERAL_unordered = 81;
	int COMMA = 82;
	// "no-preserve" = 83
	int LITERAL_inherit = 84;
	// "no-inherit" = 85
	int DOLLAR = 86;
	int LCURLY = 87;
	int RCURLY = 88;
	int COLON = 89;
	int LITERAL_external = 90;
	int LITERAL_at = 91;
	int LITERAL_schema = 92;
	int LITERAL_as = 93;
	// "empty-sequence" = 94
	int QUESTION = 95;
	int STAR = 96;
	int PLUS = 97;
	int LITERAL_item = 98;
	int LITERAL_for = 99;
	int LITERAL_let = 100;
	int LITERAL_some = 101;
	int LITERAL_every = 102;
	int LITERAL_if = 103;
	int LITERAL_update = 104;
	int LITERAL_replace = 105;
	int LITERAL_value = 106;
	int LITERAL_insert = 107;
	int LITERAL_delete = 108;
	int LITERAL_rename = 109;
	int LITERAL_with = 110;
	int LITERAL_into = 111;
	int LITERAL_preceding = 112;
	int LITERAL_following = 113;
	int LITERAL_where = 114;
	int LITERAL_return = 115;
	int LITERAL_in = 116;
	int LITERAL_by = 117;
	int LITERAL_ascending = 118;
	int LITERAL_descending = 119;
	int LITERAL_satisfies = 120;
	int LITERAL_typeswitch = 121;
	int LITERAL_case = 122;
	int LITERAL_then = 123;
	int LITERAL_else = 124;
	int LITERAL_or = 125;
	int LITERAL_and = 126;
	int LITERAL_instance = 127;
	int LITERAL_of = 128;
	int LITERAL_treat = 129;
	int LITERAL_castable = 130;
	int LITERAL_cast = 131;
	int LT = 132;
	int GT = 133;
	int LITERAL_eq = 134;
	int LITERAL_ne = 135;
	int LITERAL_lt = 136;
	int LITERAL_le = 137;
	int LITERAL_gt = 138;
	int LITERAL_ge = 139;
	int NEQ = 140;
	int GTEQ = 141;
	int LTEQ = 142;
	int LITERAL_is = 143;
	int LITERAL_isnot = 144;
	int ANDEQ = 145;
	int OREQ = 146;
	int LITERAL_to = 147;
	int MINUS = 148;
	int LITERAL_div = 149;
	int LITERAL_idiv = 150;
	int LITERAL_mod = 151;
	int LITERAL_union = 152;
	int UNION = 153;
	int LITERAL_intersect = 154;
	int LITERAL_except = 155;
	int SLASH = 156;
	int DSLASH = 157;
	int LITERAL_text = 158;
	int LITERAL_node = 159;
	int LITERAL_attribute = 160;
	int LITERAL_comment = 161;
	// "processing-instruction" = 162
	// "document-node" = 163
	int LITERAL_document = 164;
	int SELF = 165;
	int XML_COMMENT = 166;
	int XML_PI = 167;
	int LPPAREN = 168;
	int RPPAREN = 169;
	int AT = 170;
	int PARENT = 171;
	int LITERAL_child = 172;
	int LITERAL_self = 173;
	int LITERAL_descendant = 174;
	// "descendant-or-self" = 175
	// "following-sibling" = 176
	int LITERAL_parent = 177;
	int LITERAL_ancestor = 178;
	// "ancestor-or-self" = 179
	// "preceding-sibling" = 180
	int DOUBLE_LITERAL = 181;
	int DECIMAL_LITERAL = 182;
	int INTEGER_LITERAL = 183;
	int END_TAG_START = 184;
	int QUOT = 185;
	int APOS = 186;
	int QUOT_ATTRIBUTE_CONTENT = 187;
	int APOS_ATTRIBUTE_CONTENT = 188;
	int ELEMENT_CONTENT = 189;
	int XML_COMMENT_END = 190;
	int XML_PI_END = 191;
	int XML_CDATA = 192;
	int LITERAL_collection = 193;
	int LITERAL_validate = 194;
	int XML_PI_START = 195;
	int XML_CDATA_START = 196;
	int XML_CDATA_END = 197;
	int LETTER = 198;
	int DIGITS = 199;
	int HEX_DIGITS = 200;
	int NMSTART = 201;
	int NMCHAR = 202;
	int WS = 203;
	int EXPR_COMMENT = 204;
	int PRAGMA = 205;
	int PRAGMA_CONTENT = 206;
	int PRAGMA_QNAME = 207;
	int PREDEFINED_ENTITY_REF = 208;
	int CHAR_REF = 209;
	int NEXT_TOKEN = 210;
	int CHAR = 211;
	int BASECHAR = 212;
	int IDEOGRAPHIC = 213;
	int COMBINING_CHAR = 214;
	int DIGIT = 215;
	int EXTENDER = 216;
}
