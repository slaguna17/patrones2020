package examen1SergioLaguna.ej3;

public class ControlerCreator extends Creator {
    @Override
    public IControles factoryMethodControles() {

        TextBox tb = new TextBox(1,"grande");
        Link l =new Link(1,"grande");
        Table t = new Table(1,"grande");
        CheckBox cb = new CheckBox(1,"grande");
        ComboBox cbx = new ComboBox(1,"grande");
        Controller c = new Controller(tb,l,t,cb,cbx);
        return c;
    }
}
