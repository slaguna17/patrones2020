package interpreter.example;

public class TerminalExpressionI extends AbstractExpresion {

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("i")) {
            context.output = context.output + "3";
            context.input= context.input.substring(1);
        }
    }
}
