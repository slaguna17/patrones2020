package iterator.basic;

public class IteratorConcreteListA implements Iterator {
    private int position;
    private String [] nombre;

    public IteratorConcreteListA(String [] nombre){
        this.nombre=nombre;
    }

    @Override
    public Object next() {
        return this.nombre[position++];
    }

    @Override
    public boolean hasNext() {
        // si es vacio ?  / limite de los datos
        return this.nombre.length != 0 && position < this.nombre.length;
    }
}
