package iterator.ejercicio.ej1.sergio;

public class IteradorArreglo implements Iterator {
    private int position;
    private Persona [] persona;

    public IteradorArreglo(Persona [] persona){
        this.persona=persona;
    }

    @Override
    public Object next() {
        return this.persona[position++];
    }

    @Override
    public boolean hasNext() {
        // si es vacio ?  / limite de los datos
        return this.persona.length != 0 && position < this.persona.length;
    }
}
