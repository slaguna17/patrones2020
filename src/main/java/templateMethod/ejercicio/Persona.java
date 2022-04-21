package templateMethod.ejercicio;

import java.util.Date;

public abstract class Persona {

    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Overwrite
    public int getEdad() {
        System.out.println("EDAD"+edad);
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // no overwrite
    public final void getTimeNombre() {
        System.out.println("Nombre " + this.nombre + " time" + new Date().getTime());
    }

    public abstract void showData() ;

}
