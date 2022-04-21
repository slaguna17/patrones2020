package factoryMethod.ejercicios.ej1;

public class CreatorHeladoMixto extends Creator {
    @Override
    public HeladoMixto factoryMethodHelado() {
      HeladoMixto heladoMixto = new HeladoMixto();
      heladoMixto.setBase(new Base("triangular","cono"));
      heladoMixto.setCrema(new Crema("frutilla","3$"));
      heladoMixto.setForma("cono");
      heladoMixto.setFruta(new Fruta("dulce","frutilla","2$"));
      heladoMixto.setTamano("Mediano");
      return heladoMixto;
    }
}

