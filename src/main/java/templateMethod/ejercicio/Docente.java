package templateMethod.ejercicio;

public class Docente extends  Persona {


    public Docente(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void showData() {
        System.out.println("Docente Nombre " + this.nombre);
        System.out.println("Docente Edad" + this.edad);
    }
}
