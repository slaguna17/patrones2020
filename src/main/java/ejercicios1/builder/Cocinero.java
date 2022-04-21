package ejercicios1.builder;

public class Cocinero {
    private Builder builder;

    public Pizza getBuilder() {
        return builder.getProduct();
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void buildProduct() {
        builder.createProduct();
        builder.buildMasa();
        builder.buildQueso();
        builder.buildSalsa();
    }

}
