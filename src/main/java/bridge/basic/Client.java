package bridge.basic;

public class Client {

    public static void main (String [] args){

        ConcreteImplementor1 implementor1 = new ConcreteImplementor1();

        ConcreteAbstraction1 abstraction1 = new ConcreteAbstraction1(implementor1);
        abstraction1.method1();
        abstraction1.method2();


    }
}
