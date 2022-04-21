package builder.examples.ej1;

public class Director {
    private ComputadoraBuilder builder;

    public Computadoras getBuilder() {
        return builder.getProduct();
    }

    public void setBuilder(ComputadoraBuilder builder) {
        this.builder = builder;
    }

    public  void buildProduct(){
        builder.createProduct();
        builder.buildCpu();
        builder.buildDisk();
        builder.buildMemory();
    }

}
