package builder.basic;

public class Director {
      private Builder builder;

    public Product getBuilder() {
        return builder.getProduct();
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public  void buildProduct(){
        builder.createProduct();
        builder.buildAttribute1();
        builder.buildAttribute2();
    }

}
