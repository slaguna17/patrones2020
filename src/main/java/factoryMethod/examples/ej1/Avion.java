package factoryMethod.examples.ej1;

public class Avion {
    private String marca;
    private String numAsientos;

    public Avion(String marca, String numAsientos){
        this.marca= marca;
        this.numAsientos=numAsientos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(String numAsientos) {
        this.numAsientos = numAsientos;
    }
}
