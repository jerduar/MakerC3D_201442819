
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Thu Mar 02 14:09:06 CST 2017
//----------------------------------------------------

package org.compi2.codigo3d.parser;

import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Thu Mar 02 14:09:06 CST 2017
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\030\000\002\002\004\000\002\007\002\000\002\002" +
    "\004\000\002\004\005\000\002\004\005\000\002\004\004" +
    "\000\002\004\005\000\002\004\003\000\002\006\003\000" +
    "\002\006\003\000\002\006\003\000\002\006\003\000\002" +
    "\006\003\000\002\005\005\000\002\003\005\000\002\003" +
    "\005\000\002\003\005\000\002\003\005\000\002\003\005" +
    "\000\002\003\004\000\002\003\005\000\002\003\003\000" +
    "\002\003\003\000\002\003\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\052\000\016\004\000\005\000\006\000\014\000\016" +
    "\000\022\000\001\002\000\016\004\016\005\013\006\007" +
    "\014\017\016\011\022\012\001\002\000\004\002\006\001" +
    "\002\000\004\002\001\001\002\000\036\002\uffea\007\uffea" +
    "\010\uffea\011\uffea\012\uffea\013\uffea\015\uffea\016\uffea\017" +
    "\uffea\020\uffea\021\uffea\023\uffea\024\uffea\025\uffea\001\002" +
    "\000\012\002\ufffa\023\ufffa\024\ufffa\025\ufffa\001\002\000" +
    "\014\004\016\005\013\006\007\016\011\022\040\001\002" +
    "\000\016\004\016\005\013\006\007\014\017\016\011\022" +
    "\012\001\002\000\036\002\uffeb\007\uffeb\010\uffeb\011\uffeb" +
    "\012\uffeb\013\uffeb\015\uffeb\016\uffeb\017\uffeb\020\uffeb\021" +
    "\uffeb\023\uffeb\024\uffeb\025\uffeb\001\002\000\010\002\uffff" +
    "\024\021\025\022\001\002\000\026\007\026\010\035\011" +
    "\030\012\037\013\031\015\033\016\025\017\032\020\036" +
    "\021\027\001\002\000\036\002\uffec\007\uffec\010\uffec\011" +
    "\uffec\012\uffec\013\uffec\015\uffec\016\uffec\017\uffec\020\uffec" +
    "\021\uffec\023\uffec\024\uffec\025\uffec\001\002\000\016\004" +
    "\016\005\013\006\007\014\017\016\011\022\012\001\002" +
    "\000\012\002\ufffc\023\ufffc\024\ufffc\025\ufffc\001\002\000" +
    "\016\004\016\005\013\006\007\014\017\016\011\022\012" +
    "\001\002\000\016\004\016\005\013\006\007\014\017\016" +
    "\011\022\012\001\002\000\012\002\ufffd\023\ufffd\024\021" +
    "\025\ufffd\001\002\000\012\002\ufffe\023\ufffe\024\ufffe\025" +
    "\ufffe\001\002\000\014\004\016\005\013\006\007\016\011" +
    "\022\040\001\002\000\014\004\ufff9\005\ufff9\006\ufff9\016" +
    "\ufff9\022\ufff9\001\002\000\014\004\016\005\013\006\007" +
    "\016\011\022\040\001\002\000\014\004\ufff7\005\ufff7\006" +
    "\ufff7\016\ufff7\022\ufff7\001\002\000\014\004\ufff5\005\ufff5" +
    "\006\ufff5\016\ufff5\022\ufff5\001\002\000\014\004\016\005" +
    "\013\006\007\016\011\022\040\001\002\000\014\004\016" +
    "\005\013\006\007\016\011\022\040\001\002\000\014\004" +
    "\016\005\013\006\007\016\011\022\040\001\002\000\014" +
    "\004\ufff8\005\ufff8\006\ufff8\016\ufff8\022\ufff8\001\002\000" +
    "\014\004\016\005\013\006\007\016\011\022\040\001\002" +
    "\000\014\004\ufff6\005\ufff6\006\ufff6\016\ufff6\022\ufff6\001" +
    "\002\000\014\004\016\005\013\006\007\016\011\022\040" +
    "\001\002\000\036\002\ufff0\007\ufff0\010\ufff0\011\ufff0\012" +
    "\ufff0\013\ufff0\015\ufff0\016\ufff0\017\ufff0\020\ufff0\021\027" +
    "\023\ufff0\024\ufff0\025\ufff0\001\002\000\016\015\033\016" +
    "\025\017\032\020\036\021\027\023\043\001\002\000\036" +
    "\002\uffed\007\uffed\010\uffed\011\uffed\012\uffed\013\uffed\015" +
    "\uffed\016\uffed\017\uffed\020\uffed\021\uffed\023\uffed\024\uffed" +
    "\025\uffed\001\002\000\024\002\ufff4\015\033\016\025\017" +
    "\032\020\036\021\027\023\ufff4\024\ufff4\025\ufff4\001\002" +
    "\000\036\002\ufff3\007\ufff3\010\ufff3\011\ufff3\012\ufff3\013" +
    "\ufff3\015\ufff3\016\ufff3\017\032\020\036\021\027\023\ufff3" +
    "\024\ufff3\025\ufff3\001\002\000\036\002\ufff1\007\ufff1\010" +
    "\ufff1\011\ufff1\012\ufff1\013\ufff1\015\ufff1\016\ufff1\017\ufff1" +
    "\020\ufff1\021\027\023\ufff1\024\ufff1\025\ufff1\001\002\000" +
    "\036\002\uffef\007\uffef\010\uffef\011\uffef\012\uffef\013\uffef" +
    "\015\uffef\016\uffef\017\uffef\020\uffef\021\027\023\uffef\024" +
    "\uffef\025\uffef\001\002\000\036\002\ufff2\007\ufff2\010\ufff2" +
    "\011\ufff2\012\ufff2\013\ufff2\015\ufff2\016\ufff2\017\032\020" +
    "\036\021\027\023\ufff2\024\ufff2\025\ufff2\001\002\000\010" +
    "\023\053\024\021\025\022\001\002\000\030\007\026\010" +
    "\035\011\030\012\037\013\031\015\033\016\025\017\032" +
    "\020\036\021\027\023\043\001\002\000\012\002\ufffb\023" +
    "\ufffb\024\ufffb\025\ufffb\001\002\000\036\002\uffee\007\uffee" +
    "\010\uffee\011\uffee\012\uffee\013\uffee\015\uffee\016\uffee\017" +
    "\032\020\036\021\027\023\uffee\024\uffee\025\uffee\001\002" +
    "" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\052\000\006\002\004\007\003\001\001\000\010\003" +
    "\014\004\013\005\007\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\003" +
    "\053\001\001\000\010\003\051\004\050\005\007\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\006\033\001" +
    "\001\000\002\001\001\000\010\003\014\004\017\005\007" +
    "\001\001\000\002\001\001\000\010\003\014\004\023\005" +
    "\007\001\001\000\010\003\014\004\022\005\007\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\003\047\001" +
    "\001\000\002\001\001\000\004\003\046\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\003\045\001\001\000" +
    "\004\003\044\001\001\000\004\003\043\001\001\000\002" +
    "\001\001\000\004\003\040\001\001\000\002\001\001\000" +
    "\004\003\041\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\006\033\001\001\000\002\001\001\000" +
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


//Codigo visible

    public void syntax_error(Symbol s){
        System.err.println(s);
    }

    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{ 
        System.err.println("T.T");
        System.err.println(s);
    }


}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {

//Codigo de acciones
      

  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
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
          case 23: // expresion ::= DECIMAL 
            {
              NodoC3D RESULT =null;
		int decimalleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int decimalright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String decimal = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new NodoC3D(decimal); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // expresion ::= ENTERO 
            {
              NodoC3D RESULT =null;
		int enteroleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int enteroright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String entero = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new NodoC3D(entero); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // expresion ::= ID 
            {
              NodoC3D RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new NodoC3D(id); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // expresion ::= PAR_IZQ expresion PAR_DER 
            {
              NodoC3D RESULT =null;
		int expleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int expright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		NodoC3D exp = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = exp; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // expresion ::= MENOS expresion 
            {
              NodoC3D RESULT =null;
		int expleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int expright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D exp = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = - " + exp.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(temp); 
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // expresion ::= expresion POT expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " ^ " + der.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(temp); 
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // expresion ::= expresion DIV expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " / " + der.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(temp); 
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // expresion ::= expresion MULT expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " * " + der.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(temp); 
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // expresion ::= expresion MENOS expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " - " + der.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(temp); 
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // expresion ::= expresion MAS expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " + " + der.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(temp); 
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // expresionR ::= expresion simbolo_rel expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int simleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int simright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String sim = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " " + sim + " " + der.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(temp); 
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresionR",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // simbolo_rel ::= MAYOR_IGUAL 
            {
              String RESULT =null;
		int simleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int simright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String sim = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = sim; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("simbolo_rel",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // simbolo_rel ::= MENOR_IGUAL 
            {
              String RESULT =null;
		int simleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int simright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String sim = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = sim; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("simbolo_rel",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // simbolo_rel ::= IGUAL_IGUAL 
            {
              String RESULT =null;
		int simleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int simright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String sim = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = sim; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("simbolo_rel",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // simbolo_rel ::= MENOR_QUE 
            {
              String RESULT =null;
		int simleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int simright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String sim = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = sim; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("simbolo_rel",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // simbolo_rel ::= MAYOR_QUE 
            {
              String RESULT =null;
		int simleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int simright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String sim = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = sim; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("simbolo_rel",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expresionL ::= expresionR 
            {
              NodoC3D RESULT =null;
		int expleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int expright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D exp = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT = exp;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresionL",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // expresionL ::= PAR_IZQ expresionL PAR_DER 
            {
              NodoC3D RESULT =null;
		int expleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int expright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		NodoC3D exp = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = exp;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresionL",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // expresionL ::= NEG expresionL 
            {
              NodoC3D RESULT =null;
		int expleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int expright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D exp = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = " + " ! " + exp.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(temp);
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresionL",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // expresionL ::= expresionL OR expresionL 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " || " + der.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(temp);
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresionL",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // expresionL ::= expresionL AND expresionL 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " && " + der.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(temp);
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresionL",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // inicial ::= NT$0 expresionL 
            {
              NodoC3D RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (NodoC3D) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int expleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int expright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D exp = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        RESULT = exp;
                        ControlC3D.agregarC3D("//Último valor: " + exp.getCad());
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("inicial",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // NT$0 ::= 
            {
              NodoC3D RESULT =null;
 ControlC3D.reiniciar(); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$0",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= inicial EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		NodoC3D start_val = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

