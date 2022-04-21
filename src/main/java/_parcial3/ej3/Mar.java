package _parcial3.ej3;

public class Mar implements Paquete {
    private int precio;
    private String name;

    public Mar(int precio, String name) {
        this.precio = precio;
        this.name = name;
    }

    @Override
    public void enviando() {
        precio += precio * 0.25;
        System.out.println("Enviando paquete: " + name + " por mar a " + precio);
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
