package iterator.ejercicio.ej1;

import java.util.Vector;

public class IteratorListS3 implements Iterator {
    private int position;
    private Vector<Persona> nombre;

    public IteratorListS3(Vector<Persona> nombre){
        this.nombre=nombre;
        this.position=0;
    }

    @Override
    public Persona next() {
        return this.nombre.get(position++);
    }

    @Override
    public boolean hasNext() {
        // si es vacio ?  / limite de los datos
        return this.nombre.size() != 0 && position < this.nombre.size();
    }
}
