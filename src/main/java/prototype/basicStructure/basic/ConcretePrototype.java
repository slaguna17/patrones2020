package prototype.basicStructure.basic;

public class ConcretePrototype implements IPrototype {

    private String attributo1;
    private  int attributo2;

    public ConcretePrototype(){

    }

    public String getAttributo1() {
        return attributo1;
    }

    public void setAttributo1(String attributo1) {
        this.attributo1 = attributo1;
    }

    public int getAttributo2() {
        return attributo2;
    }

    public void setAttributo2(int attributo2) {
        this.attributo2 = attributo2;
    }

    @Override
    public Object clone() {
      ConcretePrototype cloneObject = new ConcretePrototype();
      cloneObject.setAttributo1(this.attributo1);
      cloneObject.setAttributo2(this.attributo2);
      return cloneObject;
    }
}
