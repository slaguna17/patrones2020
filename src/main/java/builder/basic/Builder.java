package builder.basic;

public abstract class Builder {
     protected  Product product;

     public Product getProduct(){
         return this.product;
     }

     public void createProduct(){
         product=new Product();
     }

     public abstract void buildAttribute1();
     public abstract void buildAttribute2();

}
