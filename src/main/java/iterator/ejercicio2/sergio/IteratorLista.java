package iterator.ejercicio2.sergio;

import java.util.List;

public class IteratorLista implements Iterator{
    private int position;
    private List<Empleado> nombre;

    public IteratorLista(List<Empleado> nombre){
        this.nombre=nombre;
        this.position=0;
    }

    @Override
    public Empleado next() {
        return this.nombre.get(position++);
    }

    @Override
    public boolean hasNext() {
        // si es vacio ?  / limite de los datos
        return this.nombre.size() != 0 && position < this.nombre.size();
    }
}
