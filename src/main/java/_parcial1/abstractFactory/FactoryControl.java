package _parcial1.abstractFactory;


public class FactoryControl {

    public static IControl make(String type){
        IControl control;

        switch (type){
            case "combobox":
                control= new ComboBox();
                break;
            case "checkbox":
                control= new Checkbox();
                break;
            case "table":
                control= new Table();
                break;
            case "link":
                control= new Link();
                break;
            case "textbox":
                control = new TextBox();
                break;
            default:
                control = new TextBox();
                break;
        }

        return control;


    }
}
