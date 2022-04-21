package interpreter.ejercicios.ej1;

import java.util.ArrayList;

public class Parser {
    // no terminal expresion
    private ArrayList<AbstractExpresion> parseTree = new ArrayList<AbstractExpresion>();
    private Context context;

    public Parser(String s) {
        context= new Context(s.replace(" ",""));
        for (String token : s.split(" ")) {
           switch (token){
               case "+":
                   parseTree.add(new TerminalExpressionAdd(token.length()));
                   break;
               case "-":
                   parseTree.add(new TerminalExpressionSub(token.length()));
                   break;
               default:
                   parseTree.add(new TerminalExpressionNumber(token.length()));
                   break;
           }
        }
    }

    public int evaluate() {
        for (AbstractExpresion e : parseTree)
            e.interpreter(context);

        return context.output;
    }
}
