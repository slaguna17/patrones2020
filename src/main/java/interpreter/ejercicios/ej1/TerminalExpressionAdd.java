package interpreter.ejercicios.ej1;

public class TerminalExpressionAdd extends AbstractExpresion {

    public  TerminalExpressionAdd(int sizeToRemove){
        this.sizeToRemove=sizeToRemove;
    }
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("+")) {
            context.signo=1;
            context.input= context.input.substring(this.sizeToRemove);
        }
    }
}
