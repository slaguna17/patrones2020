package _parcial1.builder;

public class Chef {
      private Builder builder;

    public Parrilla getBuilder() {
        return builder.getProduct();
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public  void buildProduct(){
        builder.createProduct();
        builder.buildGuarnicion();
        builder.buildRefresco();
        builder.buildTipoCarne();
    }

}
