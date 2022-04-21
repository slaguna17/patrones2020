package interpreter.ejercicios.ej1;

public class Expresion extends ExpresionAbstracta {


    // a   ---- >   1
    // context.input = abca ----->  11
    @Override
    public void interpreter(Contexto context) {
        if (context.input.startsWith("a")) {
            context.output = context.output + "1";
            context.input= context.input.substring(1); // Elimina caracter interpretado
        }
    }
}
