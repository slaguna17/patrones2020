package builder.basic;

public class ConcreteBuilder1 extends  Builder {


    @Override
    public void buildAttribute1() {
       product.setAttribute1("caracteristica1");
    }

    @Override
    public void buildAttribute2() {
        product.setAttribute2(2);
    }
}
