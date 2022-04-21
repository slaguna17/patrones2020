package ejercicios2.memento1;

public class Persona {
    String nombre;
    String ci;
    Persona(String nombre,String ci){
        this.nombre=nombre;
        this.ci=ci;
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
