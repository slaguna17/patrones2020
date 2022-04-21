package visitor.basic;

public class Client {

    public static void main (String []args  ){
        ElementConcreteA elementConcreteA = new ElementConcreteA();
        ElementConcreteB elementConcreteB = new ElementConcreteB();

        ConcreateVisitor1 visitor1= new ConcreateVisitor1();

        System.out.println("---------------------");
        elementConcreteA.accept(visitor1);

        System.out.println("---------------------");
        elementConcreteB.accept(visitor1);





    }
}
