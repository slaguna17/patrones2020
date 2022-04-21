package iterator.ejercicio.ej1.sergio;


public class Vector implements IAggregateList {
    java.util.Vector<Persona> persona;

    public Vector(){
        persona = new java.util.Vector<>();
    }

    public void add(Persona nueva){
        persona.add(nueva);
    }

    @Override
    public IteratorVector iterator() {
        return new IteratorVector(this.persona);
    }
}
