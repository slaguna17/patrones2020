package interpreter.basic;
import java.util.ArrayList;

public class Parser {
    // no terminal expresion

    private ArrayList<AbstractExpresion> parseTree = new ArrayList<AbstractExpresion>();
    private Context context;

    public Parser(String s) {
        context= new Context(s.replace(" ",""));
        for (String token : s.split(" ")) {
            switch (token){
                case "a":
                    parseTree.add(new TerminalExpressionA());
                    break;

                default:
                    break;
            }
        }
    }

    public String evaluate() {
        for (AbstractExpresion e : parseTree)
            e.interpreter(context);
        return context.output;
    }
}
