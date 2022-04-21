package composite.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @autor : eynar.pari
 * @date : 24/06/2020.
 **/
public class Composite extends Component {

    private List<Component> list = new ArrayList<>();
    private int totalEstimacion=0;

    public Composite(String titulo) {
        super(titulo);
    }


    @Override
    public int totalEstimacion() {

        for (Component componente:list ) {
            totalEstimacion=totalEstimacion+componente.totalEstimacion();
        }
        System.out.println("Componente : ["+getTitulo()+"] Estimacion Total : [" + totalEstimacion+"]");
        return totalEstimacion;
    }

    @Override
    public void add(Component component) {
        list.add(component);

    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    @Override
    public void getChild(int position) {
        System.out.println(list.get(position).getTitulo());
    }
}
