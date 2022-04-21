package examen1SergioLaguna.ej4;

public class Director {
    private CarneBuilder builder;
    public Carne getBuilder() {
        return builder.getProduct();
    }

    public void setBuilder(CarneBuilder builder) {
        this.builder = builder;
    }

    public  void buildProduct(){
        builder.createProduct();
        builder.buildTipo();
        builder.buildRefresco();
        builder.buildGuarnicion();
    }

}

