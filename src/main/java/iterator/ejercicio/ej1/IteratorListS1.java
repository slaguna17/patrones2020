package iterator.ejercicio.ej1;

public class IteratorListS1 implements Iterator {
    private int position=0;
    private Persona [] personas;

    public IteratorListS1(Persona [] personas){
        this.personas =personas;
    }

    @Override
    public Persona next() {
        return this.personas[position++];
    }

    @Override
    public boolean hasNext() {
        // si es vacio ?  / limite de los datos
        return this.personas.length != 0 && position < this.personas.length;
    }
}
