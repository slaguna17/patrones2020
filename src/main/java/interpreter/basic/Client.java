package interpreter.basic;

public class Client {

    public static void main (String [] args){
       String toInterpretate="a a e";
       System.out.println("Evaluate : "+toInterpretate+"\nInterpretate : "
               + new Parser(toInterpretate).evaluate());
    }
}
