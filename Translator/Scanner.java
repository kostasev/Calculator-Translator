/* The following code was generated by JFlex 1.4.3 on 3/23/19 2:54 PM */

/* JFlex example: part of Java language lexer specification */
import java_cup.runtime.*;
/**

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 3/23/19 2:54 PM from the specification file
 * <tt>scanner.flex</tt>
 */
class Scanner implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int STRING = 2;
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\5\1\3\1\2\1\0\1\3\1\1\16\5\4\0\1\3\1\0"+
    "\1\14\1\0\1\4\3\0\1\7\1\10\1\0\1\6\1\11\3\0"+
    "\12\5\7\0\32\4\1\0\1\26\2\0\1\4\1\0\4\4\1\17"+
    "\1\16\2\4\1\15\2\4\1\20\1\4\1\30\1\4\1\22\1\4"+
    "\1\23\1\21\1\27\1\25\2\4\1\24\2\4\1\12\1\0\1\13"+
    "\1\0\41\5\2\0\4\4\4\0\1\4\2\0\1\5\7\0\1\4"+
    "\4\0\1\4\5\0\27\4\1\0\37\4\1\0\u01ca\4\4\0\14\4"+
    "\16\0\5\4\7\0\1\4\1\0\1\4\21\0\160\5\5\4\1\0"+
    "\2\4\2\0\4\4\10\0\1\4\1\0\3\4\1\0\1\4\1\0"+
    "\24\4\1\0\123\4\1\0\213\4\1\0\5\5\2\0\236\4\11\0"+
    "\46\4\2\0\1\4\7\0\47\4\7\0\1\4\1\0\55\5\1\0"+
    "\1\5\1\0\2\5\1\0\2\5\1\0\1\5\10\0\33\4\5\0"+
    "\3\4\15\0\5\5\6\0\1\4\4\0\13\5\5\0\53\4\37\5"+
    "\4\0\2\4\1\5\143\4\1\0\1\4\10\5\1\0\6\5\2\4"+
    "\2\5\1\0\4\5\2\4\12\5\3\4\2\0\1\4\17\0\1\5"+
    "\1\4\1\5\36\4\33\5\2\0\131\4\13\5\1\4\16\0\12\5"+
    "\41\4\11\5\2\4\4\0\1\4\5\0\26\4\4\5\1\4\11\5"+
    "\1\4\3\5\1\4\5\5\22\0\31\4\3\5\104\0\1\4\1\0"+
    "\13\4\67\0\33\5\1\0\4\5\66\4\3\5\1\4\22\5\1\4"+
    "\7\5\12\4\2\5\2\0\12\5\1\0\7\4\1\0\7\4\1\0"+
    "\3\5\1\0\10\4\2\0\2\4\2\0\26\4\1\0\7\4\1\0"+
    "\1\4\3\0\4\4\2\0\1\5\1\4\7\5\2\0\2\5\2\0"+
    "\3\5\1\4\10\0\1\5\4\0\2\4\1\0\3\4\2\5\2\0"+
    "\12\5\4\4\7\0\1\4\5\0\3\5\1\0\6\4\4\0\2\4"+
    "\2\0\26\4\1\0\7\4\1\0\2\4\1\0\2\4\1\0\2\4"+
    "\2\0\1\5\1\0\5\5\4\0\2\5\2\0\3\5\3\0\1\5"+
    "\7\0\4\4\1\0\1\4\7\0\14\5\3\4\1\5\13\0\3\5"+
    "\1\0\11\4\1\0\3\4\1\0\26\4\1\0\7\4\1\0\2\4"+
    "\1\0\5\4\2\0\1\5\1\4\10\5\1\0\3\5\1\0\3\5"+
    "\2\0\1\4\17\0\2\4\2\5\2\0\12\5\1\0\1\4\17\0"+
    "\3\5\1\0\10\4\2\0\2\4\2\0\26\4\1\0\7\4\1\0"+
    "\2\4\1\0\5\4\2\0\1\5\1\4\7\5\2\0\2\5\2\0"+
    "\3\5\10\0\2\5\4\0\2\4\1\0\3\4\2\5\2\0\12\5"+
    "\1\0\1\4\20\0\1\5\1\4\1\0\6\4\3\0\3\4\1\0"+
    "\4\4\3\0\2\4\1\0\1\4\1\0\2\4\3\0\2\4\3\0"+
    "\3\4\3\0\14\4\4\0\5\5\3\0\3\5\1\0\4\5\2\0"+
    "\1\4\6\0\1\5\16\0\12\5\11\0\1\4\7\0\3\5\1\0"+
    "\10\4\1\0\3\4\1\0\27\4\1\0\12\4\1\0\5\4\3\0"+
    "\1\4\7\5\1\0\3\5\1\0\4\5\7\0\2\5\1\0\2\4"+
    "\6\0\2\4\2\5\2\0\12\5\22\0\2\5\1\0\10\4\1\0"+
    "\3\4\1\0\27\4\1\0\12\4\1\0\5\4\2\0\1\5\1\4"+
    "\7\5\1\0\3\5\1\0\4\5\7\0\2\5\7\0\1\4\1\0"+
    "\2\4\2\5\2\0\12\5\1\0\2\4\17\0\2\5\1\0\10\4"+
    "\1\0\3\4\1\0\51\4\2\0\1\4\7\5\1\0\3\5\1\0"+
    "\4\5\1\4\10\0\1\5\10\0\2\4\2\5\2\0\12\5\12\0"+
    "\6\4\2\0\2\5\1\0\22\4\3\0\30\4\1\0\11\4\1\0"+
    "\1\4\2\0\7\4\3\0\1\5\4\0\6\5\1\0\1\5\1\0"+
    "\10\5\22\0\2\5\15\0\60\4\1\5\2\4\7\5\4\0\10\4"+
    "\10\5\1\0\12\5\47\0\2\4\1\0\1\4\2\0\2\4\1\0"+
    "\1\4\2\0\1\4\6\0\4\4\1\0\7\4\1\0\3\4\1\0"+
    "\1\4\1\0\1\4\2\0\2\4\1\0\4\4\1\5\2\4\6\5"+
    "\1\0\2\5\1\4\2\0\5\4\1\0\1\4\1\0\6\5\2\0"+
    "\12\5\2\0\4\4\40\0\1\4\27\0\2\5\6\0\12\5\13\0"+
    "\1\5\1\0\1\5\1\0\1\5\4\0\2\5\10\4\1\0\44\4"+
    "\4\0\24\5\1\0\2\5\5\4\13\5\1\0\44\5\11\0\1\5"+
    "\71\0\53\4\24\5\1\4\12\5\6\0\6\4\4\5\4\4\3\5"+
    "\1\4\3\5\2\4\7\5\3\4\4\5\15\4\14\5\1\4\17\5"+
    "\2\0\46\4\1\0\1\4\5\0\1\4\2\0\53\4\1\0\u014d\4"+
    "\1\0\4\4\2\0\7\4\1\0\1\4\1\0\4\4\2\0\51\4"+
    "\1\0\4\4\2\0\41\4\1\0\4\4\2\0\7\4\1\0\1\4"+
    "\1\0\4\4\2\0\17\4\1\0\71\4\1\0\4\4\2\0\103\4"+
    "\2\0\3\5\40\0\20\4\20\0\125\4\14\0\u026c\4\2\0\21\4"+
    "\1\0\32\4\5\0\113\4\3\0\3\4\17\0\15\4\1\0\4\4"+
    "\3\5\13\0\22\4\3\5\13\0\22\4\2\5\14\0\15\4\1\0"+
    "\3\4\1\0\2\5\14\0\64\4\40\5\3\0\1\4\3\0\2\4"+
    "\1\5\2\0\12\5\41\0\3\5\2\0\12\5\6\0\130\4\10\0"+
    "\51\4\1\5\1\4\5\0\106\4\12\0\35\4\3\0\14\5\4\0"+
    "\14\5\12\0\12\5\36\4\2\0\5\4\13\0\54\4\4\0\21\5"+
    "\7\4\2\5\6\0\12\5\46\0\27\4\5\5\4\0\65\4\12\5"+
    "\1\0\35\5\2\0\13\5\6\0\12\5\15\0\1\4\130\0\5\5"+
    "\57\4\21\5\7\4\4\0\12\5\21\0\11\5\14\0\3\5\36\4"+
    "\15\5\2\4\12\5\54\4\16\5\14\0\44\4\24\5\10\0\12\5"+
    "\3\0\3\4\12\5\44\4\122\0\3\5\1\0\25\5\4\4\1\5"+
    "\4\4\3\5\2\4\11\0\300\4\47\5\25\0\4\5\u0116\4\2\0"+
    "\6\4\2\0\46\4\2\0\6\4\2\0\10\4\1\0\1\4\1\0"+
    "\1\4\1\0\1\4\1\0\37\4\2\0\65\4\1\0\7\4\1\0"+
    "\1\4\3\0\3\4\1\0\7\4\3\0\4\4\2\0\6\4\4\0"+
    "\15\4\5\0\3\4\1\0\7\4\16\0\5\5\32\0\5\5\20\0"+
    "\2\4\23\0\1\4\13\0\5\5\5\0\6\5\1\0\1\4\15\0"+
    "\1\4\20\0\15\4\3\0\33\4\25\0\15\5\4\0\1\5\3\0"+
    "\14\5\21\0\1\4\4\0\1\4\2\0\12\4\1\0\1\4\3\0"+
    "\5\4\6\0\1\4\1\0\1\4\1\0\1\4\1\0\4\4\1\0"+
    "\13\4\2\0\4\4\5\0\5\4\4\0\1\4\21\0\51\4\u0a77\0"+
    "\57\4\1\0\57\4\1\0\205\4\6\0\4\4\3\5\2\4\14\0"+
    "\46\4\1\0\1\4\5\0\1\4\2\0\70\4\7\0\1\4\17\0"+
    "\1\5\27\4\11\0\7\4\1\0\7\4\1\0\7\4\1\0\7\4"+
    "\1\0\7\4\1\0\7\4\1\0\7\4\1\0\7\4\1\0\40\5"+
    "\57\0\1\4\u01d5\0\3\4\31\0\11\4\6\5\1\0\5\4\2\0"+
    "\5\4\4\0\126\4\2\0\2\5\2\0\3\4\1\0\132\4\1\0"+
    "\4\4\5\0\51\4\3\0\136\4\21\0\33\4\65\0\20\4\u0200\0"+
    "\u19b6\4\112\0\u51cd\4\63\0\u048d\4\103\0\56\4\2\0\u010d\4\3\0"+
    "\20\4\12\5\2\4\24\0\57\4\1\5\4\0\12\5\1\0\31\4"+
    "\7\0\1\5\120\4\2\5\45\0\11\4\2\0\147\4\2\0\4\4"+
    "\1\0\4\4\14\0\13\4\115\0\12\4\1\5\3\4\1\5\4\4"+
    "\1\5\27\4\5\5\20\0\1\4\7\0\64\4\14\0\2\5\62\4"+
    "\21\5\13\0\12\5\6\0\22\5\6\4\3\0\1\4\4\0\12\5"+
    "\34\4\10\5\2\0\27\4\15\5\14\0\35\4\3\0\4\5\57\4"+
    "\16\5\16\0\1\4\12\5\46\0\51\4\16\5\11\0\3\4\1\5"+
    "\10\4\2\5\2\0\12\5\6\0\27\4\3\0\1\4\1\5\4\0"+
    "\60\4\1\5\1\4\3\5\2\4\2\5\5\4\2\5\1\4\1\5"+
    "\1\4\30\0\3\4\2\0\13\4\5\5\2\0\3\4\2\5\12\0"+
    "\6\4\2\0\6\4\2\0\6\4\11\0\7\4\1\0\7\4\221\0"+
    "\43\4\10\5\1\0\2\5\2\0\12\5\6\0\u2ba4\4\14\0\27\4"+
    "\4\0\61\4\u2104\0\u016e\4\2\0\152\4\46\0\7\4\14\0\5\4"+
    "\5\0\1\4\1\5\12\4\1\0\15\4\1\0\5\4\1\0\1\4"+
    "\1\0\2\4\1\0\2\4\1\0\154\4\41\0\u016b\4\22\0\100\4"+
    "\2\0\66\4\50\0\15\4\3\0\20\5\20\0\7\5\14\0\2\4"+
    "\30\0\3\4\31\0\1\4\6\0\5\4\1\0\207\4\2\0\1\5"+
    "\4\0\1\4\13\0\12\5\7\0\32\4\4\0\1\4\1\0\32\4"+
    "\13\0\131\4\3\0\6\4\2\0\6\4\2\0\6\4\2\0\3\4"+
    "\3\0\2\4\3\0\2\4\22\0\3\5\4\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\2\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\4\3\1\13\1\2\1\3\1\14"+
    "\1\15\1\16\3\3\1\17\1\20\1\21\1\22\3\3"+
    "\1\23\4\3\1\24\1\25";

  private static int [] zzUnpackAction() {
    int [] result = new int[40];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\31\0\62\0\113\0\62\0\144\0\62\0\62"+
    "\0\62\0\62\0\62\0\62\0\62\0\175\0\226\0\257"+
    "\0\310\0\341\0\341\0\372\0\62\0\u0113\0\144\0\u012c"+
    "\0\u0145\0\u015e\0\62\0\62\0\62\0\62\0\u0177\0\u0190"+
    "\0\u01a9\0\144\0\u01c2\0\u01db\0\u01f4\0\u020d\0\144\0\144";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[40];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\2\5\1\6\1\3\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\6\1\17\1\6"+
    "\1\20\1\21\3\6\1\3\2\6\1\22\1\4\1\5"+
    "\1\23\1\24\7\22\1\25\11\24\1\26\2\24\33\0"+
    "\1\5\32\0\2\6\7\0\11\6\1\0\2\6\4\0"+
    "\2\6\7\0\1\6\1\27\7\6\1\0\2\6\4\0"+
    "\2\6\7\0\3\6\1\30\5\6\1\0\2\6\4\0"+
    "\2\6\7\0\10\6\1\31\1\0\2\6\4\0\2\6"+
    "\7\0\6\6\1\32\2\6\1\0\2\6\1\22\2\0"+
    "\11\22\1\0\11\22\1\0\3\22\2\0\1\22\2\24"+
    "\6\22\1\0\11\24\1\0\2\24\14\0\1\33\6\0"+
    "\1\34\3\0\1\35\1\36\4\0\2\6\7\0\4\6"+
    "\1\37\4\6\1\0\2\6\4\0\2\6\7\0\1\6"+
    "\1\40\7\6\1\0\2\6\4\0\2\6\7\0\2\6"+
    "\1\41\6\6\1\0\2\6\4\0\2\6\7\0\2\6"+
    "\1\42\6\6\1\0\2\6\4\0\2\6\7\0\1\6"+
    "\1\43\7\6\1\0\2\6\4\0\2\6\7\0\1\6"+
    "\1\44\7\6\1\0\2\6\4\0\2\6\7\0\1\45"+
    "\10\6\1\0\2\6\4\0\2\6\7\0\1\46\10\6"+
    "\1\0\2\6\4\0\2\6\7\0\7\6\1\47\1\6"+
    "\1\0\2\6\4\0\2\6\7\0\7\6\1\50\1\6"+
    "\1\0\2\6";

  private static int [] zzUnpackTrans() {
    int [] result = new int[550];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\1\1\1\11\1\1\7\11\7\1\1\11"+
    "\5\1\4\11\12\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[40];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
StringBuffer stringBuffer = new StringBuffer();
private Symbol symbol(int type) {
   return new Symbol(type, yyline, yycolumn);
}
private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline, yycolumn, value);
}


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Scanner(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Scanner(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 2214) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 10: 
          { stringBuffer.setLength(0); yybegin(STRING);
          }
        case 22: break;
        case 16: 
          { stringBuffer.append('\r');
          }
        case 23: break;
        case 15: 
          { stringBuffer.append('\"');
          }
        case 24: break;
        case 5: 
          { return symbol(sym.LPAREN);
          }
        case 25: break;
        case 20: 
          { return symbol(sym.SUFFIX);
          }
        case 26: break;
        case 21: 
          { return symbol(sym.PREFIX);
          }
        case 27: break;
        case 7: 
          { return symbol(sym.COM);
          }
        case 28: break;
        case 2: 
          { /* just skip what was found, do nothing */
          }
        case 29: break;
        case 11: 
          { stringBuffer.append( yytext() );
          }
        case 30: break;
        case 17: 
          { stringBuffer.append('\t');
          }
        case 31: break;
        case 9: 
          { return symbol(sym.RBRA);
          }
        case 32: break;
        case 14: 
          { return symbol(sym.IFSYM);
          }
        case 33: break;
        case 18: 
          { stringBuffer.append('\n');
          }
        case 34: break;
        case 8: 
          { return symbol(sym.LBRA);
          }
        case 35: break;
        case 19: 
          { return symbol(sym.ELSESYM);
          }
        case 36: break;
        case 6: 
          { return symbol(sym.RPAREN);
          }
        case 37: break;
        case 4: 
          { return symbol(sym.PLUS);
          }
        case 38: break;
        case 12: 
          { yybegin(YYINITIAL);
                                       return symbol(sym.STRINGL, stringBuffer.toString());
          }
        case 39: break;
        case 3: 
          { return symbol(sym.IDENT);
          }
        case 40: break;
        case 1: 
          { throw new Error("Illegal character <"+yytext()+">");
          }
        case 41: break;
        case 13: 
          { stringBuffer.append('\\');
          }
        case 42: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
