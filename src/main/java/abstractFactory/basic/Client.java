package abstractFactory.basic;

public class Client {

    public static  void main(String [] args){
        ConcreteProduct1 p1 = (ConcreteProduct1) FactoryProduct.make("productoConcreto1");
        p1.action();


        // estatico
        FactoryProduct.make("productoConcreto1").action();


        // no es estatico
        FactoryProduct2 creator = new FactoryProduct2();
        creator.make("productoConcreto1").action();

    }
}
