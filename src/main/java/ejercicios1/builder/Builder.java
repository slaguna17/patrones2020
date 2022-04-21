package ejercicios1.builder;

public abstract class Builder {
    protected Pizza pizza;

    public Pizza getProduct() {
        return this.pizza;
    }

    public void createProduct() {
        pizza = new Pizza();
    }

    public abstract void buildMasa();

    public abstract void buildQueso();

    public abstract void buildSalsa();


}
