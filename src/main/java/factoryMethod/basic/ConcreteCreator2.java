package factoryMethod.basic;

public class ConcreteCreator2 extends Creator {
    @Override
    public ConcreteProduct2 factoryMethodProduct() {
        ConcreteProduct2 concreteProduct2 = new ConcreteProduct2();
        return concreteProduct2;
    }
}
