package _parcial1.interpreter;

public class Client {

    public static void main (String [] args){
       String toInterpretate="I II II IV V VI VII VIII IX X X III VI";

       System.out.println("Evaluate : "+toInterpretate+"\n Interpretate : "
               + new Parser(toInterpretate).evaluate());

    }
}
