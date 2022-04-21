package factoryMethod.ejercicios.ej1;

public class CreatorHeladoAgua extends Creator {
    @Override
    public HeladoAgua factoryMethodHelado() {
        HeladoAgua heladoAgua = new HeladoAgua();
        heladoAgua.setBase(new Base("triangular","cono"));
        heladoAgua.setForma("cono");
        heladoAgua.setFruta(new Fruta("dulce","frutilla","2$"));
        heladoAgua.setTamano("Mediano");
        return heladoAgua;
    }
}
