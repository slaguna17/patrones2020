package factoryMethod.ejercicios.ej1;

public class Base {
    String nombre;
    String tipo;

    public Base(String nombre,String tipo){
        this.nombre= nombre;
        this.tipo=tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
