package iterator.ejercicio2.sergio;

public class IteratorArreglo implements Iterator{
    private int position=0;
    private Empleado[] empleados;

    public IteratorArreglo(Empleado [] empleados){
        this.empleados =empleados;
    }

    @Override
    public Empleado next() {
        return this.empleados[position++];
    }

    @Override
    public boolean hasNext() {
        // si es vacio ?  / limite de los datos
        return this.empleados.length != 0 && position < this.empleados.length;
    }
}
