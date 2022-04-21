package factoryMethod.ejercicios.ej1;

public class Client {

    public static void main (String []args){

        CreatorHeladoAgua creatorHeladoAgua = new CreatorHeladoAgua();
        CreatorHeladoCrema creatorHeladoCrema = new CreatorHeladoCrema();
        CreatorHeladoMixto creatorHeladoMixto = new CreatorHeladoMixto();

        HeladoAgua heladoAgua1 = creatorHeladoAgua.factoryMethodHelado();
        HeladoAgua heladoAgua2 = creatorHeladoAgua.factoryMethodHelado();

        HeladoCrema heladoCrema1 = creatorHeladoCrema.factoryMethodHelado();
        HeladoCrema heladoCrema2 = creatorHeladoCrema.factoryMethodHelado();


        HeladoMixto heladoMixto1 = creatorHeladoMixto.factoryMethodHelado();
        HeladoMixto heladoMixto2 = creatorHeladoMixto.factoryMethodHelado();

        heladoAgua1.comprar();
        heladoAgua2.comprar();
        heladoCrema1.comprar();
        heladoCrema2.comprar();
        heladoMixto1.comprar();
        heladoMixto2.comprar();
    }
}
