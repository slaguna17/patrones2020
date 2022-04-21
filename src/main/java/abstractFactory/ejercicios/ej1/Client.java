package abstractFactory.ejercicios.ej1;

public class Client {

    public static void main (String [] args){

        FactoryHelado.make(FactoryHelado.heladoType.AGUA).comprar();
        FactoryHelado.make(FactoryHelado.heladoType.MIXTO).comprar();
        FactoryHelado.make(FactoryHelado.heladoType.CREMA).comprar();

    }
}
