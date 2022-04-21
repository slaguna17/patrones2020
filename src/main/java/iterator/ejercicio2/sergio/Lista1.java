package iterator.ejercicio2.sergio;

import java.util.ArrayList;
import java.util.List;

public class Lista1 implements IAggregateList{
    List<Empleado> empleados;

    public Lista1(){
        empleados = new ArrayList<>();
    }

    public void add(Empleado value){
        empleados.add(value);
    }

    @Override
    public IteratorLista iterator() {
        return new IteratorLista(this.empleados);
    }
}
