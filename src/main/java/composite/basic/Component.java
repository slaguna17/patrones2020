package composite.basic;

/**
 * @autor : eynar.pari
 * @date : 24/06/2020.
 **/
abstract class Component {
    private String attribute;

    public Component(String attribute){
        this.attribute=attribute;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public abstract  void operation();
    public abstract  void add(Component component);
    public abstract  void remove(Component component);
    public abstract  void getChild(int position);

}
