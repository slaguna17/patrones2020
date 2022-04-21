package decorator.basic;

/**
 * @autor : eynar.pari
 * @date : 25/06/2020.
 **/
public class Client {

    public static void main (String [] sada){
         Componente concreteObj = new ComponentConcrete();

         concreteObj=new DecoratorConcretoA(concreteObj);
         concreteObj= new DecoratorConcretoB(concreteObj);

         concreteObj.operation();


    }

}
