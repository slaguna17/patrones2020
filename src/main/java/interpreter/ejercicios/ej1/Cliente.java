package interpreter.ejercicios.ej1;

public class Cliente {
    public static void main(String[] args) {
        String toInterpretate=" 1 + 2 - 3 + 5 - 8 + 7";
        System.out.println("Evaluate : "+toInterpretate+"\nInterpretate : "
                + new Parser1(toInterpretate).evaluate());
    }
}
