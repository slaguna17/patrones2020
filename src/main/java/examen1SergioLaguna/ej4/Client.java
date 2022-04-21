package examen1SergioLaguna.ej4;

public class Client {
    public static void main(String[] args) {
       Director director = new Director();
CarneBuilder c1 = new Bife();
CarneBuilder c2 = new Lomito();
CarneBuilder c3 = new Tira();
        director.setBuilder(c1);
        director.buildProduct();
        Carne pc1 = director.getBuilder();

        director.setBuilder(c2);
        director.buildProduct();
        Carne pc2 = director.getBuilder();

        director.setBuilder(c3);
        director.buildProduct();
        Carne pc3 = director.getBuilder();

        pc1.showData();
        pc2.showData();
        pc3.showData();
    }
}
