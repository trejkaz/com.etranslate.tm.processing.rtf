/* Generated By:JavaCC: Do not edit this line. RTFParserConstants.java */
package com.etranslate.tm.processing.rtf;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface RTFParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int BACKSLASH = 1;
  /** RegularExpression Id. */
  int HEX_ESCAPE = 2;
  /** RegularExpression Id. */
  int LBRACE = 7;
  /** RegularExpression Id. */
  int RBRACE = 8;
  /** RegularExpression Id. */
  int NON_BREAKING_SPACE = 9;
  /** RegularExpression Id. */
  int OPTIONAL_HYPHEN = 10;
  /** RegularExpression Id. */
  int NON_BREAKING_HYPHEN = 11;
  /** RegularExpression Id. */
  int ESCAPED_NEWLINE = 12;
  /** RegularExpression Id. */
  int ESCAPED_CARRIAGE_RETURN = 13;
  /** RegularExpression Id. */
  int IGNORABLE_DESTINATION = 14;
  /** RegularExpression Id. */
  int FORMULA_CHARACTER = 15;
  /** RegularExpression Id. */
  int INDEX_SUBENTRY = 16;
  /** RegularExpression Id. */
  int ESCAPED_LBRACE = 17;
  /** RegularExpression Id. */
  int ESCAPED_RBRACE = 18;
  /** RegularExpression Id. */
  int ESCAPED_BACKSLASH = 19;
  /** RegularExpression Id. */
  int CONTROL_SYM = 20;
  /** RegularExpression Id. */
  int TEXT = 21;
  /** RegularExpression Id. */
  int HEX_DIGIT = 22;
  /** RegularExpression Id. */
  int HEX_CHAR = 23;
  /** RegularExpression Id. */
  int PAR = 29;
  /** RegularExpression Id. */
  int LINE = 30;
  /** RegularExpression Id. */
  int U = 31;
  /** RegularExpression Id. */
  int UC = 32;
  /** RegularExpression Id. */
  int F = 33;
  /** RegularExpression Id. */
  int CS = 34;
  /** RegularExpression Id. */
  int FCHARSET = 35;
  /** RegularExpression Id. */
  int PLAIN = 36;
  /** RegularExpression Id. */
  int PC = 37;
  /** RegularExpression Id. */
  int PCA = 38;
  /** RegularExpression Id. */
  int MAC = 39;
  /** RegularExpression Id. */
  int RTF = 40;
  /** RegularExpression Id. */
  int ANSI = 41;
  /** RegularExpression Id. */
  int ANSICPG = 42;
  /** RegularExpression Id. */
  int DEFF = 43;
  /** RegularExpression Id. */
  int FROMTEXT = 44;
  /** RegularExpression Id. */
  int FROMHTML = 45;
  /** RegularExpression Id. */
  int FBIDIS = 46;
  /** RegularExpression Id. */
  int INFO = 47;
  /** RegularExpression Id. */
  int REVTBL = 48;
  /** RegularExpression Id. */
  int PNTEXT = 49;
  /** RegularExpression Id. */
  int FONTTBL = 50;
  /** RegularExpression Id. */
  int COLORTBL = 51;
  /** RegularExpression Id. */
  int PNSECLVL = 52;
  /** RegularExpression Id. */
  int LISTTABLE = 53;
  /** RegularExpression Id. */
  int STYLESHEET = 54;
  /** RegularExpression Id. */
  int TAB = 55;
  /** RegularExpression Id. */
  int ZWJ = 56;
  /** RegularExpression Id. */
  int ZWNJ = 57;
  /** RegularExpression Id. */
  int EMDASH = 58;
  /** RegularExpression Id. */
  int ENDASH = 59;
  /** RegularExpression Id. */
  int EMSPACE = 60;
  /** RegularExpression Id. */
  int ENSPACE = 61;
  /** RegularExpression Id. */
  int QMSPACE = 62;
  /** RegularExpression Id. */
  int BULLET = 63;
  /** RegularExpression Id. */
  int LQUOTE = 64;
  /** RegularExpression Id. */
  int RQUOTE = 65;
  /** RegularExpression Id. */
  int LTRMARK = 66;
  /** RegularExpression Id. */
  int RTLMARK = 67;
  /** RegularExpression Id. */
  int LDBLQUOTE = 68;
  /** RegularExpression Id. */
  int RDBLQUOTE = 69;
  /** RegularExpression Id. */
  int BIN = 70;
  /** RegularExpression Id. */
  int CONTROL_WORD = 71;
  /** RegularExpression Id. */
  int DIGIT = 72;
  /** RegularExpression Id. */
  int CW_VAL = 73;
  /** RegularExpression Id. */
  int TEXT_CONTROL_DELIMITER = 74;

  /** Lexical state. */
  int CONTROL_VALUE = 0;
  /** Lexical state. */
  int CONTROL = 1;
  /** Lexical state. */
  int HEX = 2;
  /** Lexical state. */
  int DEFAULT = 3;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\"\\\\\"",
    "\"\\\\\\\'\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\t\"",
    "\"\\u0000\"",
    "\"{\"",
    "\"}\"",
    "\"\\\\~\"",
    "\"\\\\-\"",
    "\"\\\\_\"",
    "\"\\\\\\n\"",
    "\"\\\\\\r\"",
    "\"\\\\*\"",
    "\"\\\\|\"",
    "\"\\\\:\"",
    "\"\\\\{\"",
    "\"\\\\}\"",
    "\"\\\\\\\\\"",
    "<CONTROL_SYM>",
    "<TEXT>",
    "<HEX_DIGIT>",
    "<HEX_CHAR>",
    "\" \"",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\t\"",
    "\"\\u0000\"",
    "\"par\"",
    "\"line\"",
    "\"u\"",
    "\"uc\"",
    "\"f\"",
    "\"cs\"",
    "\"fcharset\"",
    "\"plain\"",
    "\"pc\"",
    "\"pca\"",
    "\"mac\"",
    "\"rtf\"",
    "\"ansi\"",
    "\"ansicpg\"",
    "\"deff\"",
    "\"fromtext\"",
    "\"fromhtml\"",
    "\"fbidis\"",
    "\"info\"",
    "\"revtbl\"",
    "\"pntext\"",
    "\"fonttbl\"",
    "\"colortbl\"",
    "\"pnseclvl\"",
    "\"listtable\"",
    "\"stylesheet\"",
    "\"tab\"",
    "\"zwj\"",
    "\"zwnj\"",
    "\"emdash\"",
    "\"endash\"",
    "\"emspace\"",
    "\"enspace\"",
    "\"qmspace\"",
    "\"bullet\"",
    "\"lquote\"",
    "\"rquote\"",
    "\"ltrmark\"",
    "\"rtlmark\"",
    "\"ldblquote\"",
    "\"rdblquote\"",
    "\"bin\"",
    "<CONTROL_WORD>",
    "<DIGIT>",
    "<CW_VAL>",
    "<TEXT_CONTROL_DELIMITER>",
  };

}
