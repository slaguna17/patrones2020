package _parcial3.ej3;

public class Aire implements Paquete {
    private int precio;
    private String name;

    public Aire(int precio, String name) {
        this.precio = precio;
        this.name = name;
    }

    @Override
    public void enviando() {
        precio += 0.1 * precio;
        System.out.println("Enviando paquete: " + name + " por aire a " + precio);
    }

    @Override
    public int precio() {
        return precio;
    }

    @Override
    public String nombre() {
        return name;
    }
}
