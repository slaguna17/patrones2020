package _parcial1.factoryMethod;

public class CheckBoxCreator extends Creator {
    @Override
    public Checkbox factoryMethodProduct() {
        Checkbox control = new Checkbox();
        return control;
    }
}
