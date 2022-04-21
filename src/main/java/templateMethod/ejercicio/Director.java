package templateMethod.ejercicio;

public class Director extends  Persona {


    public Director(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void showData() {
        System.out.println("Director Nombre " + this.nombre);
        System.out.println("Director Edad" + this.edad);
    }


}
