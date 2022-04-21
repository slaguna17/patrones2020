package ejercicios1.factoryMethod;

public class KitEscolarCreator extends Creator {
    @Override
    public KitColegial factoryMethodProduct() {
        KitColegial kitColegial = new KitColegial();
        kitColegial.setComputadora(new Computadora("HP","Windows8"));
        kitColegial.setLibro(new Libro("Literatura","upb"));
        kitColegial.setMochila(new Mochila("50","S"));

        return kitColegial;
    }
}
