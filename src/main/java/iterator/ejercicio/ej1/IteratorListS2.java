package iterator.ejercicio.ej1;

import java.util.List;

public class IteratorListS2 implements Iterator {
    private int position;
    private List<Persona> nombre;

    public IteratorListS2(List<Persona> nombre){
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
