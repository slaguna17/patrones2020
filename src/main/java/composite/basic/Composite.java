package composite.basic;

import java.util.ArrayList;
import java.util.List;

/**
 * @autor : eynar.pari
 * @date : 24/06/2020.
 **/
public class Composite extends Component {

    private List<Component> list = new ArrayList<>();

    public Composite(String attribute) {
        super(attribute);
    }

    @Override
    public void operation() {
        System.out.println(this.getAttribute());
        for (Component componente:list ) {
            componente.operation();
        }
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
        System.out.println(list.get(position).getAttribute());
    }
}
