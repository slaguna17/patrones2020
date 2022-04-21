package interpreter.ejercicios.ej1;
public class TerminalExpressionNumber extends AbstractExpresion {

    public TerminalExpressionNumber(int sizeToRemove){
        this.sizeToRemove=sizeToRemove;
    }

    @Override
    public void interpreter(Context context) {
            context.output = context.output + Integer.parseInt(context.input.substring(0,this.sizeToRemove))*(context.signo);
            context.input= context.input.substring(this.sizeToRemove); // Elimina caracter interpretado
    }
}
