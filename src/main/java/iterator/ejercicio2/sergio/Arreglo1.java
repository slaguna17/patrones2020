package iterator.ejercicio2.sergio;

public class Arreglo1 implements IAggregateList{
    private int position;
    private Empleado[] empleados;

    public Arreglo1(){
        this.position=0;
        empleados = new Empleado[2];
    }

    public void add(Empleado value){
        empleados[position]=value;
        position++;

    }

    @Override
    public IteratorArreglo iterator() {
        return new IteratorArreglo(this.empleados);
    }
}
