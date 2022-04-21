package iterator.ejercicio2.sergio;

import java.util.Stack;

public class Stack1 implements IAggregateList {
    private Stack<Empleado> s ;

    public Stack1(){
        s = new Stack<Empleado>();
    }

    public void add(Empleado value){
        s.push(value);
    }
    @Override
    public Iterator iterator() {
        return new IteratorStack(this.s);
    }
}
