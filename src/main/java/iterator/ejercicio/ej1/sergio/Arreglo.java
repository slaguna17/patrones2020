package iterator.ejercicio.ej1.sergio;

public class Arreglo implements IAggregateList {
    private int position;
    private Persona [] persona;
    //private String attribute1;

    public Arreglo(){
        this.position=0;
        persona= new Persona[10];
    }

    public void add(Persona nueva){
        persona [position]=nueva;
        position++;
    }

    @Override
    public IteradorArreglo iterator() {
        return new IteradorArreglo(this.persona);
    }
}
