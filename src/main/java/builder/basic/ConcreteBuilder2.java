package builder.basic;

public class ConcreteBuilder2 extends  Builder {

    @Override
    public void buildAttribute1() {
       product.setAttribute1("caracteristica3");
    }

    @Override
    public void buildAttribute2() {
        product.setAttribute2(5);
    }
}
