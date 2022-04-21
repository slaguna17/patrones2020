package composite.example;

/**
 * @autor : eynar.pari
 * @date : 24/06/2020.
 **/
public class Item extends Component {


    public Item(String titulo) {
        super(titulo);
    }

    @Override
    public int totalEstimacion() {
        System.out.println("Componente : ["+getTitulo()+"] Estimacion Total : [" + getEstimation()+"]");
        return this.getEstimation();
    }

    @Override
    public void add(Component component) {
        System.out.println("Not Applicable");
    }

    @Override
    public void remove(Component component) {
        System.out.println("Not Applicable");
    }

    @Override
    public void getChild(int position) {
        System.out.println("Not Applicable");
    }
}
