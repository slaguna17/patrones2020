package _parcial1.builder;

public class Client {

    public static void main (String []args){
        Chef cocinero = new Chef();

        Builder concreteProduct1= new Bife();
        Builder concreteProduct2= new Lomito();
        Builder concreteProduct3= new Tira();

        cocinero.setBuilder(concreteProduct1);
        cocinero.buildProduct();
        Parrilla product1 = cocinero.getBuilder();


        cocinero.setBuilder(concreteProduct2);
        cocinero.buildProduct();
        Parrilla product2 = cocinero.getBuilder();

        cocinero.setBuilder(concreteProduct3);
        cocinero.buildProduct();
        Parrilla product3 = cocinero.getBuilder();

        product1.showData();
        product2.showData();
        product3.showData();
    }
}
