package examen1SergioLaguna.ej3;

public class CheckBox {
    private int tamanio;
    private String forma;

    public CheckBox(int tamanio, String forma) {
        this.tamanio = tamanio;
        this.forma = forma;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }
}
