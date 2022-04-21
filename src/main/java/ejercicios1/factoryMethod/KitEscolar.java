package ejercicios1.factoryMethod;

public class KitEscolar implements IKit {
    private Mochila mochila;
    private Deportivo deportivo;
    private Cuaderno cuaderno;


    public KitEscolar() {
    }

    @Override
    public void action() {

    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Deportivo getDeportivo() {
        return deportivo;
    }

    public void setDeportivo(Deportivo deportivo) {
        this.deportivo = deportivo;
    }

    public Cuaderno getCuaderno() {
        return cuaderno;
    }

    public void setCuaderno(Cuaderno cuaderno) {
        this.cuaderno = cuaderno;
    }
}
