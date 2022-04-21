package ejercicios1.factoryMethod;

public class KitColegioCreator extends Creator {
    @Override
    public KitEscolar factoryMethodProduct() {
        KitEscolar kitEscolar= new KitEscolar();
        kitEscolar.setCuaderno(new Cuaderno("1","50"));
        kitEscolar.setDeportivo(new Deportivo("M","RED","5"));
        kitEscolar.setMochila(new Mochila("50","M"));
        return kitEscolar;
    }
}
