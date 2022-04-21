package iterator.ejercicio2.sergio;

public class Empleado {
     String nombre;
     int ci;

    public Empleado(String nombre, int ci){
        this.nombre=nombre;
        this.ci=ci;
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
