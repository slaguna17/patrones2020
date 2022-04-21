package chainOfResponsability.example;

public class Persona {

    private String nombre;
    private String ci;
    private int montoPretamo;

    public Persona (String nombre, String ci, int montoPrestamo){
        this.nombre=nombre;
        this.ci=ci;
        this.montoPretamo=montoPrestamo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public int getMontoPretamo() {
        return montoPretamo;
    }

    public void setMontoPretamo(int montoPretamo) {
        this.montoPretamo = montoPretamo;
    }
}
