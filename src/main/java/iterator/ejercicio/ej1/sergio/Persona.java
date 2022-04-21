package iterator.ejercicio.ej1.sergio;

public class Persona {
    private String nombre;
    private int ci;

    public Persona(String nombre, int ci) {
        this.nombre = nombre;
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }
}
