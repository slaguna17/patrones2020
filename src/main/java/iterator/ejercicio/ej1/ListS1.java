package iterator.ejercicio.ej1;

public class ListS1 implements IAggregateList {
    private int position;
    private Persona [] personas;

    public ListS1(){
        this.position=0;
        personas = new Persona[5];
    }

    public void add(Persona value){
        personas[position]=value;
        position++;

    }

    @Override
    public IteratorListS1 iterator() {
        return new IteratorListS1(this.personas);
    }
}
