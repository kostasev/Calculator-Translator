
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20141202 (SVN rev 60)
//----------------------------------------------------

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20141202 (SVN rev 60) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\035\000\002\002\004\000\002\002\004\000\002\003" +
    "\004\000\002\003\002\000\002\004\011\000\002\004\010" +
    "\000\002\006\004\000\002\006\002\000\002\005\006\000" +
    "\002\005\005\000\002\010\004\000\002\011\004\000\002" +
    "\011\002\000\002\007\003\000\002\007\003\000\002\007" +
    "\003\000\002\007\003\000\002\012\003\000\002\012\002" +
    "\000\002\013\011\000\002\014\004\000\002\015\004\000" +
    "\002\015\002\000\002\016\003\000\002\016\003\000\002" +
    "\017\006\000\002\017\003\000\002\020\004\000\002\020" +
    "\002" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\064\000\006\002\ufffe\017\ufffe\001\002\000\006\002" +
    "\ufffa\017\012\001\002\000\004\002\006\001\002\000\004" +
    "\002\000\001\002\000\004\002\001\001\002\000\006\002" +
    "\ufffa\017\066\001\002\000\006\002\uffff\017\uffff\001\002" +
    "\000\004\006\013\001\002\000\012\007\022\012\015\016" +
    "\020\017\014\001\002\000\022\004\ufff1\005\ufff1\006\061" +
    "\007\ufff1\011\ufff1\013\ufff1\014\ufff1\015\ufff1\001\002\000" +
    "\004\006\045\001\002\000\020\004\ufff2\005\ufff2\007\ufff2" +
    "\011\ufff2\013\ufff2\014\ufff2\015\ufff2\001\002\000\020\004" +
    "\040\005\uffe7\007\uffe7\011\uffe7\013\uffe7\014\uffe7\015\uffe7" +
    "\001\002\000\020\004\ufff3\005\ufff3\007\ufff3\011\ufff3\013" +
    "\ufff3\014\ufff3\015\ufff3\001\002\000\004\007\034\001\002" +
    "\000\010\002\ufff8\010\030\017\ufff8\001\002\000\006\005" +
    "\026\007\ufff5\001\002\000\020\004\ufff4\005\ufff4\007\ufff4" +
    "\011\ufff4\013\ufff4\014\ufff4\015\ufff4\001\002\000\004\007" +
    "\ufff7\001\002\000\010\012\015\016\020\017\014\001\002" +
    "\000\004\007\ufff6\001\002\000\012\011\uffef\012\015\016" +
    "\020\017\014\001\002\000\004\011\033\001\002\000\020" +
    "\004\ufff0\005\ufff0\007\ufff0\011\ufff0\013\ufff0\014\ufff0\015" +
    "\ufff0\001\002\000\006\002\ufffc\017\ufffc\001\002\000\010" +
    "\002\ufff9\010\035\017\ufff9\001\002\000\012\011\uffef\012" +
    "\015\016\020\017\014\001\002\000\004\011\037\001\002" +
    "\000\006\002\ufffd\017\ufffd\001\002\000\010\012\015\016" +
    "\020\017\014\001\002\000\020\004\042\005\uffe5\007\uffe5" +
    "\011\uffe5\013\uffe5\014\uffe5\015\uffe5\001\002\000\010\012" +
    "\015\016\020\017\014\001\002\000\020\004\uffe8\005\uffe8" +
    "\007\uffe8\011\uffe8\013\uffe8\014\uffe8\015\uffe8\001\002\000" +
    "\020\004\uffe6\005\uffe6\007\uffe6\011\uffe6\013\uffe6\014\uffe6" +
    "\015\uffe6\001\002\000\010\012\015\016\020\017\014\001" +
    "\002\000\004\007\055\001\002\000\010\007\uffeb\014\051" +
    "\015\052\001\002\000\004\007\uffed\001\002\000\010\012" +
    "\uffea\016\uffea\017\uffea\001\002\000\010\012\uffe9\016\uffe9" +
    "\017\uffe9\001\002\000\010\012\015\016\020\017\014\001" +
    "\002\000\004\007\uffec\001\002\000\012\012\015\013\uffef" +
    "\016\020\017\014\001\002\000\004\013\057\001\002\000" +
    "\026\004\uffef\005\uffef\007\uffef\011\uffef\012\015\013\uffef" +
    "\014\uffef\015\uffef\016\020\017\014\001\002\000\020\004" +
    "\uffee\005\uffee\007\uffee\011\uffee\013\uffee\014\uffee\015\uffee" +
    "\001\002\000\012\007\063\012\015\016\020\017\014\001" +
    "\002\000\004\007\064\001\002\000\024\002\ufff8\004\ufff8" +
    "\005\ufff8\007\ufff8\011\ufff8\013\ufff8\014\ufff8\015\ufff8\017" +
    "\ufff8\001\002\000\024\002\ufff9\004\ufff9\005\ufff9\007\ufff9" +
    "\011\ufff9\013\ufff9\014\ufff9\015\ufff9\017\ufff9\001\002\000" +
    "\004\002\ufffb\001\002\000\004\006\061\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\064\000\006\002\004\003\003\001\001\000\010\004" +
    "\010\005\007\006\006\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\006\005\007\006\064\001" +
    "\001\000\002\001\001\000\002\001\001\000\014\005\023" +
    "\007\016\010\020\013\015\017\022\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\011\024\001\001\000\002\001\001\000\002\001\001" +
    "\000\014\005\023\007\016\010\026\013\015\017\022\001" +
    "\001\000\002\001\001\000\014\005\023\007\016\012\030" +
    "\013\015\017\031\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\014\005\023" +
    "\007\016\012\035\013\015\017\031\001\001\000\002\001" +
    "\001\000\002\001\001\000\010\005\023\007\040\013\015" +
    "\001\001\000\004\020\042\001\001\000\012\005\023\007" +
    "\016\013\015\017\043\001\001\000\002\001\001\000\002" +
    "\001\001\000\012\005\023\007\046\013\015\014\045\001" +
    "\001\000\002\001\001\000\006\015\047\016\052\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\010\005\023\007\053\013\015\001\001\000\002\001\001" +
    "\000\014\005\023\007\016\012\055\013\015\017\031\001" +
    "\001\000\002\001\001\000\014\005\023\007\016\012\057" +
    "\013\015\017\031\001\001\000\002\001\001\000\014\005" +
    "\023\007\016\010\061\013\015\017\022\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
 return s.next_token(); 
    }


    // Connect this parser to a scanner!
    Scanner s;
    Parser(Scanner s){ this.s=s; }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // prog ::= defs calls 
            {
              String RESULT =null;
		int dleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String d = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 System.out.println("public class Main {\npublic static void main(String[] args) {" + c + "\n}" + d + "\n}"); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("prog",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= prog EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String start_val = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // defs ::= defs def 
            {
              String RESULT =null;
		int dsleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int dsright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String ds = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int dleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int dright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String d = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = ds + d; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("defs",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // defs ::= 
            {
              String RESULT =null;
		 RESULT = ""; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("defs",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // def ::= IDENT LPAREN args RPAREN LBRA code_ RBRA 
            {
              String RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-6)).value;
		int arleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int arright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		String ar = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int cdleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int cdright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String cd = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 String words[]=ar.split(",");StringBuffer buf = new StringBuffer();
											   for(int i=0;i<words.length;i++){buf.append(" String "+words[i]);if(i!=words.length-1){buf.append(",");}}
											   RESULT = "\npublic static String " + id + "(" + buf.toString() + " ){\nreturn " + cd + " ;\n}"; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("def",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // def ::= IDENT LPAREN RPAREN LBRA code_ RBRA 
            {
              String RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-5)).value;
		int cdleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int cdright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String cd = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = "\npublic static String " + id + "( ){\nreturn " + cd + " ;\n}"; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("def",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // calls ::= call calls 
            {
              String RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int csleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int csright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String cs = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = "\nSystem.out.println(" + c + ");" + cs ; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("calls",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // calls ::= 
            {
              String RESULT =null;
		 RESULT = ""; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("calls",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // call ::= IDENT LPAREN args RPAREN 
            {
              String RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int arleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int arright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String ar = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT =  id + "( " + ar + ")"; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("call",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // call ::= IDENT LPAREN RPAREN 
            {
              String RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		 RESULT =  id + "( )"; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("call",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // args ::= expr argsRec 
            {
              String RESULT =null;
		int exleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int exright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String ex = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int arleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int arright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String ar = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = ex + ar; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("args",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // argsRec ::= COM args 
            {
              String RESULT =null;
		int arleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int arright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String ar = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = "," +  ar; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("argsRec",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // argsRec ::= 
            {
              String RESULT =null;
		 RESULT = ""; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("argsRec",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // val ::= call 
            {
              String RESULT =null;
		int clleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int clright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String cl = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = cl; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("val",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // val ::= STRINGL 
            {
              String RESULT =null;
		int strleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int strright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String str = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = "\""+str+"\""; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("val",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // val ::= ifstm 
            {
              String RESULT =null;
		int ifsleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int ifsright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String ifs = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = ifs; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("val",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // val ::= IDENT 
            {
              String RESULT =null;
		int ifsleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int ifsright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String ifs = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = ifs; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("val",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // code_ ::= expr 
            {
              String RESULT =null;
		int xpleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int xpright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String xp = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = xp; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("code_",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // code_ ::= 
            {
              String RESULT =null;
		 RESULT = "\"\""; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("code_",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // ifstm ::= IFSYM LPAREN cond RPAREN code_ ELSESYM code_ 
            {
              String RESULT =null;
		int cnleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int cnright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		String cn = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int c1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int c1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		String c1 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int c2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int c2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String c2 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = "("+cn+"?"+c1 +":"+c2+")"; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("ifstm",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // cond ::= val conds 
            {
              String RESULT =null;
		int vleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int vright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String v = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = v + c; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("cond",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // conds ::= oper val 
            {
              String RESULT =null;
		int opleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int opright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String op = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int vlleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int vlright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String vl = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = op + vl + ")"; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("conds",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // conds ::= 
            {
              String RESULT =null;
		 RESULT = "" ; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("conds",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // oper ::= PREFIX 
            {
              String RESULT =null;
		 RESULT = ".startsWith("; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("oper",12, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // oper ::= SUFFIX 
            {
              String RESULT =null;
		 RESULT = ".endsWith("; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("oper",12, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // expr ::= val PLUS val exprs 
            {
              String RESULT =null;
		int vlleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int vlright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		String vl = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int vl2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int vl2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String vl2 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int expleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int expright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String exp = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT =  vl +"+"+vl2+ exp ;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",13, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // expr ::= val 
            {
              String RESULT =null;
		int vlleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int vlright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String vl = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT =  vl; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",13, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // exprs ::= PLUS expr 
            {
              String RESULT =null;
		int expleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int expright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String exp = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = "+" + exp; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exprs",14, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // exprs ::= 
            {
              String RESULT =null;
		 RESULT = "" ; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exprs",14, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}