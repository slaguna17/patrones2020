package _parcial3.ej3;

public class Tierra implements Paquete {
    private int precio;
    private String name;

    public Tierra(int precio, String name) {
        this.precio = precio;
        this.name = name;
    }

    @Override
    public void enviando() {
        precio += 0.05 * precio;
        System.out.println("Enviando paquete: " + name + " por tierra a " + precio);
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
