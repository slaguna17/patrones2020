package iterator.ejercicio.ej1.sergio;

import java.util.LinkedList;
import java.util.List;

public class Lista implements IAggregateList {
    private List<Persona> l;
    private int posicion;

    public Lista() {
         l = new LinkedList<Persona>();
    }

    public void add(Persona nueva){
        l.add(nueva);
    }

    @Override
    public IteratorList iterator() {
        return new IteratorList(this.l);
    }
}
