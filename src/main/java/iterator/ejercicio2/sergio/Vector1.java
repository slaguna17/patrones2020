package iterator.ejercicio2.sergio;

public class Vector1 implements IAggregateList{
    java.util.Vector<Empleado> nombre;

    public Vector1(){
        nombre = new java.util.Vector<>();
    }

    public void add(Empleado value){
        nombre.add(value);
    }

    @Override
    public IteratorVector iterator() {
        return new IteratorVector(this.nombre);
    }
}
