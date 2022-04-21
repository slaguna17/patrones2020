package _parcial1.factoryMethod;

public class TableCreator extends Creator {
    @Override
    public Table factoryMethodProduct() {
        Table control = new Table();
        return control;
    }
}
