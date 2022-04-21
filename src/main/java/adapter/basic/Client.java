package adapter.basic;

public class Client {

    public static void main (String [] args){

        Adaptee  adaptee = new Adaptee();

        ConcreteAdapter concreteAdapter= new ConcreteAdapter(adaptee);

        concreteAdapter.method1();
        concreteAdapter.method2();
        concreteAdapter.method3();

        ConcreteA concreteA= new ConcreteA();
        concreteA.method1();
        concreteA.method2();
        concreteA.method3();

    }


}
