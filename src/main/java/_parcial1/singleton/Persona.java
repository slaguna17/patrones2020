package _parcial1.singleton;

public class Persona {
    String nombre;
    String ci;
    String cargo;
    public Persona(String nombre, String ci,String cargo){
        this.nombre=nombre;
        this.ci=ci;
        this.cargo=cargo;

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
}
