package templateMethod.ejercicio;
public class Estudiante extends Persona {


    public Estudiante(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void showData() {
        System.out.println("Estudiante Nombre " + this.nombre);
        System.out.println("Estudiante Edad" + this.edad);
    }

    @Override
    public int getEdad() {
        System.out.println("Override EDAD "+this.edad);
        return edad+0;
    }

}
