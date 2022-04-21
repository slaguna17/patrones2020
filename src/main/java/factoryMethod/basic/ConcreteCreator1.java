package factoryMethod.basic;

public class ConcreteCreator1 extends Creator {
    @Override
    public ConcreteProduct1 factoryMethodProduct() {
        ConcreteProduct1 concreteProduct1 = new ConcreteProduct1();

        // logica de creacion concreteProduct1

        return concreteProduct1;
    }
}
