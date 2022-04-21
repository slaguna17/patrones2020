package builder.examples.ej1;


public class Client {

    public static void main (String []args){
        Director director = new Director();

        ComputadoraBuilder concreteProduct1= new ComputadoraI3();
        ComputadoraBuilder concreteProduct2= new ComputadoraI5();
        ComputadoraBuilder concreteProduct3= new ComputadoraI7();


        director.setBuilder(concreteProduct1);
        director.buildProduct();
        Computadoras pc1 = director.getBuilder();

        director.setBuilder(concreteProduct2);
        director.buildProduct();
        Computadoras pc2 = director.getBuilder();

        director.setBuilder(concreteProduct3);
        director.buildProduct();
        Computadoras pc3 = director.getBuilder();

        pc1.showData();
        pc2.showData();
        pc3.showData();

    }
}
