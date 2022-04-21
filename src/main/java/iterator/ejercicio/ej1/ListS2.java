package iterator.ejercicio.ej1;

import java.util.ArrayList;
import java.util.List;

public class ListS2 implements IAggregateList {
    List<Persona> personas;

    public ListS2(){
       personas = new ArrayList<>();
    }

    public void add(Persona value){
        personas.add(value);
    }

    @Override
    public IteratorListS2 iterator() {
        return new IteratorListS2(this.personas);
    }
}
