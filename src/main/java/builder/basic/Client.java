package builder.basic;

public class Client {

    public static void main (String []args){
        Director director = new Director();

        Builder concreteProduct1= new ConcreteBuilder1();
        Builder concreteProduct2= new ConcreteBuilder2();



        director.setBuilder(concreteProduct1);
        director.buildProduct();
        Product product1 = director.getBuilder();


        director.setBuilder(concreteProduct2);
        director.buildProduct();
        Product product2 = director.getBuilder();

        product1.action();;
        product2.action();;

    }
}
