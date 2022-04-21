package ejercicios1.builder;

public class Client {

    public static void main(String[] args) {
        Cocinero cocineroColegio = new Cocinero();

        Builder hawaiana = new PizzaHawaiana();
        Builder carnivora = new PizzaCarnivora();


        cocineroColegio.setBuilder(hawaiana);
        cocineroColegio.buildProduct();
        Pizza pizza1 = cocineroColegio.getBuilder();


        cocineroColegio.setBuilder(carnivora);
        cocineroColegio.buildProduct();
        Pizza pizza2 = cocineroColegio.getBuilder();

        pizza1.action();
        pizza2.action();
        

    }
}
