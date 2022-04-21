package ejercicios1.factoryMethod;

public class KitColegial implements IKit {
    private Mochila mochila;
    private Libro libro;
    private Computadora computadora;


    public KitColegial() {
    }

    @Override
    public void action() {
        //
    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }
}
