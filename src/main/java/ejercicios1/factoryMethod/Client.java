package ejercicios1.factoryMethod;

public class Client {

    public static void main(String[] args) {
        KitColegioCreator creatorColegio = new KitColegioCreator();
        KitEscolarCreator creatorEscolar = new KitEscolarCreator();


        KitEscolar product1 = creatorColegio.factoryMethodProduct();
        KitEscolar product2 = creatorColegio.factoryMethodProduct();
        KitColegial product3 = creatorEscolar.factoryMethodProduct();
        KitColegial product4 = creatorEscolar.factoryMethodProduct();


    }
}
