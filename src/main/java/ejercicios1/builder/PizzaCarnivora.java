package ejercicios1.builder;

public class PizzaCarnivora extends Builder {


    @Override
    public void buildMasa() {
        pizza.setMasa("masa2");
    }

    @Override
    public void buildQueso() {
        pizza.setTipoQueso("no tiene");

    }

    @Override
    public void buildSalsa() {
        pizza.setSalsa("salsa2 + carne");
    }
}
