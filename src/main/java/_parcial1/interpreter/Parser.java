package _parcial1.interpreter;

import java.util.ArrayList;

public class Parser {
    // no terminal expresion
    private ArrayList<AbstractExpresion> parseTree = new ArrayList<AbstractExpresion>();
    private Context context;

    public Parser(String s) {
        context= new Context(s.replace(" ",""));
        for (String token : s.split(" ")) {
            System.out.println("token"+token);
             parseTree.add(new TerminalExpressionNumberRomano(token.length()));
           }
    }

    public String evaluate() {
        for (AbstractExpresion e : parseTree)
            e.interpreter(context);
        return context.output;
    }
}
