package examen1SergioLaguna.ej4;

public abstract class CarneBuilder {
    protected Carne carne;
    public Carne getProduct(){
        return this.carne;
    }

    public void createProduct(){
        carne=new Carne();
    }

    public abstract void buildTipo();
    public abstract void buildRefresco();
    public abstract void buildGuarnicion();
}
