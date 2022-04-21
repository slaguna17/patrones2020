package iterator.basic;

public class ConcreteListA implements  IAggregateList{
    private int position;
    private String [] nombre;
    private String attribute1;

    public ConcreteListA(){
        this.position=0;
        nombre= new String[5];
    }

    public void add(String value){
        nombre[position]=value;
        position++;
    }

    @Override
    public IteratorConcreteListA iterator() {
        return new IteratorConcreteListA(this.nombre);
    }
}
