package examen1SergioLaguna.ej3;

public class Controller implements IControles{
    private TextBox tb;
    private Link l;
    private Table t;
    private CheckBox cb;
    private ComboBox cbx;

    public Controller(TextBox tb, Link l, Table t, CheckBox cb, ComboBox cbx) {
        this.tb = tb;
        this.l = l;
        this.t = t;
        this.cb = cb;
        this.cbx = cbx;
    }

    @Override
    public void crear() {

    }

    public void showData(){
        System.out.println("");
    }
}
