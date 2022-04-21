package _parcial1.builder;

public abstract class Builder {
     protected Parrilla product;

     public Parrilla getProduct(){
         return this.product;
     }

     public void createProduct(){
         product=new Parrilla();
     }

     public abstract void buildTipoCarne();
     public abstract void buildRefresco();
     public abstract void buildGuarnicion();
}
