package _parcial1.factoryMethod;

public class LinkCreator extends Creator {
    @Override
    public Link factoryMethodProduct() {
        Link control = new Link();
        return control;
    }
}
