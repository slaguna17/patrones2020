package iterator.ejercicio.ej1.sergio;

import java.util.Vector;

public class IteratorVector implements Iterator{
    private int position;
    private java.util.Vector<Persona> persona;

    public IteratorVector(Vector<Persona> persona){
        this.persona=persona;
        this.position=0;
    }

    @Override
    public Object next() {
        return this.persona.get(position++);
    }

    @Override
    public boolean hasNext() {
        // si es vacio ?  / limite de los datos
        return this.persona.size() != 0 && position < this.persona.size();
    }
}
