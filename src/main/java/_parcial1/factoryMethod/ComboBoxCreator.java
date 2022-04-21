package _parcial1.factoryMethod;

public class ComboBoxCreator extends Creator {
    @Override
    public ComboBox factoryMethodProduct() {
        ComboBox control = new ComboBox();
        return control;
    }
}
