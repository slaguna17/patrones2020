package observer.ejercicio;

public class Persona {
    String nombre;
    String ci;
    
    public Persona(String nombre, String ci){
        this.nombre= nombre;
        this.ci=ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getci() {
        return ci;
    }

    public void setci(String ci) {
        this.ci = ci;
    }
}
