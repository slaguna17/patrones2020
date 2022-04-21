package factoryMethod.ejercicios.ej1.sergio;

public class Crema {
    private String sabor;
    private int costo;
    private boolean conCrema;

    public Crema(String sabor, int costo, boolean conCrema) {
        this.sabor = sabor;
        this.costo = costo;
        this.conCrema = conCrema;
    }

    public boolean isConCrema() {
        return conCrema;
    }

    public void setConCrema(boolean conCrema) {
        this.conCrema = conCrema;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
}
