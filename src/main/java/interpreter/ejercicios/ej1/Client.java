package interpreter.ejercicios.ej1;

public class Client {

    public static void main (String [] args){
       String toInterpretate="1 + 2 - 3 + 4 + 5 - 1 + 2 + 20 - 50";

       System.out.println("Evaluate : "+toInterpretate+"\n Interpretate : "
               + new Parser(toInterpretate).evaluate());

    }
}
