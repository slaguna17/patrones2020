package _parcial1.factoryMethod;

public class TextBoxCreator extends Creator {
    @Override
    public TextBox factoryMethodProduct() {
        TextBox control = new TextBox();
        return control;
    }
}
