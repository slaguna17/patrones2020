package iterator.basic;

import java.util.Vector;

public class ConcreteListB implements  IAggregateList{
    Vector<String> nombre;

    public ConcreteListB(){
       nombre = new Vector<>();
    }

    public void add(String value){
        nombre.add(value);
    }

    @Override
    public IteratorConcreteListB iterator() {
        return new IteratorConcreteListB(this.nombre);
    }
}
