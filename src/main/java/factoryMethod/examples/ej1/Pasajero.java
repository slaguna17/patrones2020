package factoryMethod.examples.ej1;

public class Pasajero {
    private String nombre;
    private String ci;

    public Pasajero(String nombre, String ci){
        this.nombre= nombre;
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
