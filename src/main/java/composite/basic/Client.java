package composite.basic;

/**
 * @autor : eynar.pari
 * @date : 24/06/2020.
 **/
public class Client {
    public static void main (String [] args){
        Composite compositeComplejoBasico = new Composite(" > OBJETO COMPLEJO BASICO 1");
        compositeComplejoBasico.add(new Leaf("\t>objeto basico1 leaf"));
        compositeComplejoBasico.add(new Leaf("\t>objeto basico2 leaf"));
        compositeComplejoBasico.add(new Leaf("\t>objeto basico3 leaf"));
        compositeComplejoBasico.add(new Leaf("\t>objeto basico4 leaf"));
        compositeComplejoBasico.add(new Leaf2("\t>objeto basico1 leaf2"));
        compositeComplejoBasico.add(new Leaf2("\t>objeto basico2 leaf2"));

        Composite compositeComplejoMedio = new Composite(" > OBJETO COMPLEJO MEDIO 1------------");
        compositeComplejoMedio.add(new Leaf("\t>(CCM) objeto basico1 leaf"));
        compositeComplejoMedio.add(new Leaf("\t>(CCM) objeto basico2 leaf"));
        compositeComplejoMedio.add(new Leaf("\t>(CCM) objeto basico3 leaf"));
        compositeComplejoMedio.add(new Leaf("\t>(CCM) objeto basico4 leaf"));
        compositeComplejoMedio.add(new Leaf2("\t>(CCM) objeto basico1 leaf2"));
        compositeComplejoMedio.add(compositeComplejoBasico);
        compositeComplejoMedio.add(compositeComplejoBasico);
        compositeComplejoMedio.add(compositeComplejoBasico);


        compositeComplejoMedio.operation();

    }

}
