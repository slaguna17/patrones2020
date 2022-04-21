package ejercicios1.builder;

public class PizzaHawaiana extends Builder {


    @Override
    public void buildMasa() {
        pizza.setMasa("masa1");
    }

    @Override
    public void buildQueso() {
        pizza.setTipoQueso("queso1");

    }

    @Override
    public void buildSalsa() {
        pizza.setSalsa("salsa1");
    }
}
