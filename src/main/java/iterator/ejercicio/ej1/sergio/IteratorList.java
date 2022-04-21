package iterator.ejercicio.ej1.sergio;

import java.util.LinkedList;
import java.util.List;

public class IteratorList implements Iterator {
    private List <Persona> l = new LinkedList<Persona>();
    private int posicion;

    public IteratorList(List<Persona> l){
        this.l=l;
        this.posicion =0;
    }
    @Override
    public Object next() {
        return l.get(posicion++);
    }

    @Override
    public boolean hasNext() {
        return l.size() != 0 && posicion<l.size();
    }
}
