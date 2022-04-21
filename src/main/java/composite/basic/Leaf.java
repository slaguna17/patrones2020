package composite.basic;

/**
 * @autor : eynar.pari
 * @date : 24/06/2020.
 **/
public class Leaf extends Component {
    public Leaf(String attribute) {
        super(attribute);
    }

    @Override
    public void operation() {
        System.out.println("Leaf "+ this.getAttribute());
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
