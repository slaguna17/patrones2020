package factoryMethod.ejercicios.ej1;

public class CreatorHeladoCrema extends Creator {
    @Override
    public HeladoCrema factoryMethodHelado() {
        HeladoCrema heladoCrema = new HeladoCrema();
        heladoCrema.setBase(new Base("cono","vaso"));
        heladoCrema.setCrema(new Crema("dulce","5$"));
        heladoCrema.setForma("circular");
        heladoCrema.setFruta(new Fruta("cirtrico","limon","2$"));
        heladoCrema.setTamano("5");
        return heladoCrema;
    }
}
