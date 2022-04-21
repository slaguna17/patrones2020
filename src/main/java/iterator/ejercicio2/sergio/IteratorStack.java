package iterator.ejercicio2.sergio;

import java.util.Stack;

public class IteratorStack implements Iterator {
    private Stack<Empleado> nombre;
    private Stack<Empleado> s = new Stack<>();

    public IteratorStack(Stack<Empleado> nombre){
        this.nombre = nombre;

    }

    @Override
    public Empleado next() {
        s.push(nombre.pop());
        return s.pop();
    }

    @Override
    public boolean hasNext() {
        return !nombre.isEmpty();
    }
}
