package interpreter.ejercicios.ej1;

public class TerminalExpressionSub extends AbstractExpresion {
    public TerminalExpressionSub(int sizeToRemove){
        this.sizeToRemove=sizeToRemove;
    }
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("-")) {
            context.signo=-1;
            context.input= context.input.substring(this.sizeToRemove);
        }
    }
}
