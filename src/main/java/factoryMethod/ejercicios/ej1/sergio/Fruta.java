package factoryMethod.ejercicios.ej1.sergio;

public class Fruta {
    private String tipo;
    private String nombre;
    private int costo;

    public Fruta(String tipo, String nombre, int costo) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.costo = costo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
}
