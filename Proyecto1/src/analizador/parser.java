
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package analizador;

import java_cup.runtime.*;
import java.util.ArrayList;
import structuras.tablaJson;
import structuras.arbol;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\042\000\002\002\004\000\002\002\005\000\002\003" +
    "\004\000\002\003\003\000\002\004\003\000\002\004\003" +
    "\000\002\005\010\000\002\006\006\000\002\007\003\000" +
    "\002\007\003\000\002\007\003\000\002\007\004\000\002" +
    "\010\004\000\002\010\004\000\002\010\004\000\002\010" +
    "\004\000\002\010\004\000\002\010\004\000\002\016\003" +
    "\000\002\016\003\000\002\017\005\000\002\017\003\000" +
    "\002\020\003\000\002\020\003\000\002\020\003\000\002" +
    "\011\005\000\002\011\003\000\002\012\005\000\002\012" +
    "\003\000\002\013\004\000\002\013\003\000\002\014\004" +
    "\000\002\014\003\000\002\015\004" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\071\000\004\011\005\001\002\000\004\002\073\001" +
    "\002\000\006\016\011\023\006\001\002\000\004\010\037" +
    "\001\002\000\010\012\ufffd\016\ufffd\023\ufffd\001\002\000" +
    "\010\012\035\016\011\023\006\001\002\000\004\013\014" +
    "\001\002\000\010\012\ufffc\016\ufffc\023\ufffc\001\002\000" +
    "\010\012\ufffe\016\ufffe\023\ufffe\001\002\000\004\023\015" +
    "\001\002\000\004\010\016\001\002\000\010\023\017\025" +
    "\020\026\022\001\002\000\010\020\ufff9\024\ufff9\030\ufff9" +
    "\001\002\000\010\020\ufff7\024\ufff7\030\ufff7\001\002\000" +
    "\010\020\023\024\024\030\026\001\002\000\010\020\ufff8" +
    "\024\ufff8\030\ufff8\001\002\000\010\023\032\025\033\026" +
    "\034\001\002\000\010\023\027\025\030\026\031\001\002" +
    "\000\010\020\ufff6\024\ufff6\030\ufff6\001\002\000\010\012" +
    "\ufffb\016\ufffb\023\ufffb\001\002\000\010\020\ufff4\024\ufff4" +
    "\030\ufff4\001\002\000\010\020\ufff3\024\ufff3\030\ufff3\001" +
    "\002\000\010\020\ufff5\024\ufff5\030\ufff5\001\002\000\010" +
    "\020\ufff1\024\ufff1\030\ufff1\001\002\000\010\020\ufff0\024" +
    "\ufff0\030\ufff0\001\002\000\010\020\ufff2\024\ufff2\030\ufff2" +
    "\001\002\000\004\002\000\001\002\000\010\012\uffff\016" +
    "\uffff\023\uffff\001\002\000\024\004\043\006\050\007\045" +
    "\014\041\015\042\023\053\025\046\026\056\027\052\001" +
    "\002\000\026\004\uffe7\006\uffe7\007\uffe7\014\uffe7\015\uffe7" +
    "\023\uffe7\025\uffe7\026\uffe7\027\uffe7\030\uffe7\001\002\000" +
    "\024\004\043\006\050\007\045\014\041\015\042\023\053" +
    "\025\046\026\056\027\052\001\002\000\024\004\043\006" +
    "\050\007\045\014\041\015\042\023\053\025\046\026\056" +
    "\027\052\001\002\000\010\023\053\025\046\026\056\001" +
    "\002\000\026\004\uffef\006\uffef\007\uffef\014\uffef\015\uffef" +
    "\023\uffef\025\uffef\026\uffef\027\uffef\030\uffef\001\002\000" +
    "\024\004\043\006\050\007\045\014\041\015\042\023\053" +
    "\025\046\026\056\027\052\001\002\000\030\004\uffe9\005" +
    "\uffe9\006\uffe9\007\uffe9\014\uffe9\015\uffe9\023\uffe9\025\uffe9" +
    "\026\uffe9\027\uffe9\030\uffe9\001\002\000\026\004\uffee\006" +
    "\uffee\007\uffee\014\uffee\015\uffee\023\uffee\025\uffee\026\uffee" +
    "\027\uffee\030\uffee\001\002\000\024\004\043\006\050\007" +
    "\045\014\041\015\042\023\053\025\046\026\056\027\052" +
    "\001\002\000\004\030\063\001\002\000\024\004\043\006" +
    "\050\007\045\014\041\015\042\023\053\025\046\026\056" +
    "\027\052\001\002\000\030\004\uffeb\005\uffeb\006\uffeb\007" +
    "\uffeb\014\uffeb\015\uffeb\023\uffeb\025\uffeb\026\uffeb\027\uffeb" +
    "\030\uffeb\001\002\000\026\004\uffe1\006\uffe1\007\uffe1\014" +
    "\uffe1\015\uffe1\023\uffe1\025\uffe1\026\uffe1\027\uffe1\030\uffe1" +
    "\001\002\000\026\004\uffec\006\uffec\007\uffec\014\uffec\015" +
    "\uffec\023\uffec\025\uffec\026\uffec\027\uffec\030\uffec\001\002" +
    "\000\030\004\uffea\005\uffea\006\uffea\007\uffea\014\uffea\015" +
    "\uffea\023\uffea\025\uffea\026\uffea\027\uffea\030\uffea\001\002" +
    "\000\026\004\uffe3\006\uffe3\007\uffe3\014\uffe3\015\uffe3\023" +
    "\uffe3\025\uffe3\026\uffe3\027\uffe3\030\uffe3\001\002\000\026" +
    "\004\uffe5\006\uffe5\007\uffe5\014\uffe5\015\uffe5\023\uffe5\025" +
    "\uffe5\026\uffe5\027\uffe5\030\uffe5\001\002\000\024\004\043" +
    "\006\050\007\045\014\041\015\042\023\053\025\046\026" +
    "\056\027\052\001\002\000\026\004\uffe8\006\uffe8\007\uffe8" +
    "\014\uffe8\015\uffe8\023\uffe8\025\uffe8\026\uffe8\027\uffe8\030" +
    "\uffe8\001\002\000\010\012\ufffa\016\ufffa\023\ufffa\001\002" +
    "\000\026\004\uffe2\006\uffe2\007\uffe2\014\uffe2\015\uffe2\023" +
    "\uffe2\025\uffe2\026\uffe2\027\uffe2\030\uffe2\001\002\000\026" +
    "\004\uffe0\006\uffe0\007\uffe0\014\uffe0\015\uffe0\023\uffe0\025" +
    "\uffe0\026\uffe0\027\uffe0\030\uffe0\001\002\000\004\005\067" +
    "\001\002\000\026\004\uffed\006\uffed\007\uffed\014\uffed\015" +
    "\uffed\023\uffed\025\uffed\026\uffed\027\uffed\030\uffed\001\002" +
    "\000\024\004\043\006\050\007\045\014\041\015\042\023" +
    "\053\025\046\026\056\027\052\001\002\000\026\004\uffe6" +
    "\006\uffe6\007\uffe6\014\uffe6\015\uffe6\023\uffe6\025\uffe6\026" +
    "\uffe6\027\uffe6\030\uffe6\001\002\000\026\004\uffe4\006\uffe4" +
    "\007\uffe4\014\uffe4\015\uffe4\023\uffe4\025\uffe4\026\uffe4\027" +
    "\uffe4\030\uffe4\001\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\071\000\004\002\003\001\001\000\002\001\001\000" +
    "\012\003\007\004\012\005\006\006\011\001\001\000\002" +
    "\001\001\000\002\001\001\000\010\004\035\005\006\006" +
    "\011\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\007" +
    "\020\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\010\024\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\022\011\046\012\037\013\057\014" +
    "\056\015\053\016\050\017\043\020\054\001\001\000\002" +
    "\001\001\000\022\011\046\012\037\013\057\014\056\015" +
    "\053\016\071\017\043\020\054\001\001\000\022\011\046" +
    "\012\037\013\057\014\056\015\053\016\067\017\043\020" +
    "\054\001\001\000\004\020\065\001\001\000\002\001\001" +
    "\000\022\011\046\012\037\013\057\014\056\015\053\016" +
    "\064\017\043\020\054\001\001\000\002\001\001\000\002" +
    "\001\001\000\022\011\046\012\037\013\057\014\056\015" +
    "\053\016\063\017\043\020\054\001\001\000\002\001\001" +
    "\000\022\011\046\012\037\013\057\014\056\015\053\016" +
    "\060\017\043\020\054\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\022\011\046\012\037\013\057" +
    "\014\056\015\053\016\061\017\043\020\054\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\022\011" +
    "\046\012\037\013\057\014\056\015\053\016\070\017\043" +
    "\020\054\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
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
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




        ArrayList<arbol> arbolesER = new ArrayList();

        public ArrayList getArboles(){
                return arbolesER;
        }

        ArrayList<tablaJson> tablaS = new ArrayList();

        public ArrayList getTablaS(){
                return tablaS;
        }



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= main EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // main ::= LLAVE_IZQ sentencias LLAVE_DER 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("main",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // sentencias ::= sentencias sentencia 
            {
              String RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("sentencias",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // sentencias ::= sentencia 
            {
              String RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("sentencias",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // sentencia ::= conjunto 
            {
              String RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("sentencia",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // sentencia ::= expRel 
            {
              String RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("sentencia",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // conjunto ::= CONJ DOSPUNTOS ID FLECHA expCon PUNTOCOMA 
            {
              String RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int exleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int exright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String ex = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 tablaS.add(new tablaJson(id,ex)); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("conjunto",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expRel ::= ID FLECHA e PUNTOCOMA 
            {
              String RESULT =null;
		int a1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int a1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		arbol a1 = (arbol)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 arbolesER.add(a1); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expRel",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // expCon ::= ID 
            {
              String RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=id; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expCon",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // expCon ::= CARACTER 
            {
              String RESULT =null;
		int caracterleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int caracterright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String caracter = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=caracter; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expCon",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // expCon ::= STRING 
            {
              String RESULT =null;
		int stringleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int stringright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String string = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=string; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expCon",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // expCon ::= expCon expCon1 
            {
              String RESULT =null;
		int ex1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int ex1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String ex1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int ex2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int ex2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String ex2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT= ex1 + ex2; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expCon",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // expCon1 ::= CULEBRA CARACTER 
            {
              String RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int caracterleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int caracterright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String caracter = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT=c+caracter; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expCon1",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // expCon1 ::= CULEBRA ID 
            {
              String RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT=c+id; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expCon1",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // expCon1 ::= CULEBRA STRING 
            {
              String RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int stringleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int stringright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String string = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT=c+string; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expCon1",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // expCon1 ::= COMA CARACTER 
            {
              String RESULT =null;
		int comaleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int comaright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String coma = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int caracterleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int caracterright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String caracter = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT=coma+caracter; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expCon1",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // expCon1 ::= COMA ID 
            {
              String RESULT =null;
		int comaleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int comaright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String coma = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT=coma+id; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expCon1",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // expCon1 ::= COMA STRING 
            {
              String RESULT =null;
		int comaleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int comaright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String coma = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int stringleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int stringright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String string = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT=coma+string; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expCon1",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // e ::= valor 
            {
              arbol RESULT =null;
		int v1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int v1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String v1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT=new arbol(v1); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("e",12, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // e ::= op 
            {
              arbol RESULT =null;
		int a1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int a1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		arbol a1 = (arbol)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT=a1; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("e",12, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // valor ::= PAR_IZQ valor1 PAR_DER 
            {
              String RESULT =null;
		int v1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int v1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String v1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT=v1; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("valor",13, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // valor ::= valor1 
            {
              String RESULT =null;
		int v1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int v1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String v1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT=v1; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("valor",13, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // valor1 ::= ID 
            {
              String RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT=id; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("valor1",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // valor1 ::= CARACTER 
            {
              String RESULT =null;
		int caracterleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int caracterright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String caracter = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT=caracter; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("valor1",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // valor1 ::= STRING 
            {
              String RESULT =null;
		int cadenaleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int cadenaright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String cadena = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = cadena; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("valor1",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // op ::= BARRA_V e e 
            {
              arbol RESULT =null;
		int opleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int opright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String op = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int v1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int v1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		arbol v1 = (arbol)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int v2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int v2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		arbol v2 = (arbol)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 arbol operacion = new arbol(op);
                                operacion.añadirHijo(v1);
                                operacion.añadirHijo(v2);
                                RESULT = operacion; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("op",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // op ::= op1 
            {
              arbol RESULT =null;
		int a1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int a1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		arbol a1 = (arbol)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT= a1; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("op",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // op1 ::= PUNTO e e 
            {
              arbol RESULT =null;
		int opleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int opright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String op = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int v1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int v1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		arbol v1 = (arbol)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int v2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int v2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		arbol v2 = (arbol)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 arbol operacion = new arbol(op);
                                operacion.añadirHijo(v1);
                                operacion.añadirHijo(v2);
                                RESULT = operacion; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("op1",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // op1 ::= op2 
            {
              arbol RESULT =null;
		int a1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int a1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		arbol a1 = (arbol)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT= a1; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("op1",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // op2 ::= INT e 
            {
              arbol RESULT =null;
		int opleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int opright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String op = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int v1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int v1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		arbol v1 = (arbol)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 arbol operacion = new arbol("|");
                                operacion.añadirHijo(v1);
                                operacion.añadirHijo(new arbol("epsilon"));
                                
                                RESULT = operacion; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("op2",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // op2 ::= op3 
            {
              arbol RESULT =null;
		int a1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int a1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		arbol a1 = (arbol)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT= a1; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("op2",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // op3 ::= MAS e 
            {
              arbol RESULT =null;
		int opleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int opright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String op = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int v1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int v1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		arbol v1 = (arbol)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 arbol operacion = new arbol(".");
                                operacion.añadirHijo(v1);
                                arbol kleene = new arbol("*");
                                kleene.añadirHijo(v1);
                                operacion.añadirHijo(kleene);
                                
                                RESULT = operacion; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("op3",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // op3 ::= op4 
            {
              arbol RESULT =null;
		int a1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int a1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		arbol a1 = (arbol)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT= a1; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("op3",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // op4 ::= POR e 
            {
              arbol RESULT =null;
		int opleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int opright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String op = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int v1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int v1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		arbol v1 = (arbol)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 arbol operacion = new arbol(op);
                                operacion.añadirHijo(v1);
                                
                                RESULT = operacion; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("op4",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
