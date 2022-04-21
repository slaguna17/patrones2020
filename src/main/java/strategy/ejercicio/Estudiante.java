package strategy.ejercicio;

public class Estudiante {

    String nombre;
    int promedio;

    public Estudiante(String nombre,int promedio){
        this.nombre=nombre;
        this.promedio=promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }
}
