package interpreter.ejercicios.ej1;

import java.util.ArrayList;

public class Parser1 {
    private ArrayList<Expresion> parseTree = new ArrayList<Expresion>();
    private Contexto context;

    public Parser1(String s) {
        context= new Contexto(s.replace(" ",""));
        for (String token : s.split(" ")) {
            switch (token){
                case "a":
                    parseTree.add(new Expresion());
                    break;

                default:
                    break;
            }
        }
    }

    public String evaluate() {
        for (ExpresionAbstracta e : parseTree)
            e.interpreter(context);
        return context.output;
    }
}
