package builder.examples.ej1;

import builder.basic.Product;

public abstract class ComputadoraBuilder {
     protected  Computadoras computadoras;

     public Computadoras getProduct(){
         return this.computadoras;
     }

     public void createProduct(){
         computadoras=new Computadoras();
     }

     public abstract void buildMemory();
    public abstract void buildDisk();
    public abstract void buildCpu();


}
