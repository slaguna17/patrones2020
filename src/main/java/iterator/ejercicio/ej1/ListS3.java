package iterator.ejercicio.ej1;

import java.util.Vector;

public class ListS3 implements IAggregateList {
    Vector<Persona> nombre;

    public ListS3(){
       nombre = new Vector<>();
    }

    public void add(Persona value){
        nombre.add(value);
    }

    @Override
    public IteratorListS3 iterator() {
        return new IteratorListS3(this.nombre);
    }
}
