package interpreter.basic;

public class TerminalExpressionA extends AbstractExpresion {


    // a   ---- >   1
    // context.input = abca ----->  11
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("a")) {
            context.output = context.output + "1";
            context.input= context.input.substring(1); // Elimina caracter interpretado
        }
    }
}
