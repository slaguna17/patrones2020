package iterator.basic;

import java.util.Vector;

public class IteratorConcreteListB implements Iterator {
    private int position;
    private Vector<String> nombre;

    public IteratorConcreteListB(Vector<String> nombre){
        this.nombre=nombre;
        this.position=0;
    }

    @Override
    public Object next() {
        return this.nombre.get(position++);
    }

    @Override
    public boolean hasNext() {
        // si es vacio ?  / limite de los datos
        return this.nombre.size() != 0 && position < this.nombre.size();
    }
}
