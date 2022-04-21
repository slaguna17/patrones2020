package factoryMethod.basic;

public class Client {

    public static void main (String [] args){
        ConcreteCreator1 creator=new ConcreteCreator1();




        ConcreteProduct1 product1=  creator.factoryMethodProduct();
        ConcreteProduct1 product2=  creator.factoryMethodProduct();
        ConcreteProduct1 product3=  creator.factoryMethodProduct();
        ConcreteProduct1 product4=  creator.factoryMethodProduct();




    }
}
