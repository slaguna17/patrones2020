package _parcial3.ej6;

public class Xiaomi implements ICelular {
    private int ram;
    private int almacenamiento;
    private String cpu;
    private int precio;

    public Xiaomi(int ram, int almacenamiento, String cpu, int precio) {
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.cpu = cpu;
        this.precio = precio;
    }

    @Override
    public void showData() {
        System.out.println("Marca: Xiaomi");
        System.out.println("RAM: " + ram + "GB");
        System.out.println("Memoria: " + almacenamiento + "GB");
        System.out.println("CPU: " + cpu );
        System.out.println("Precio: " + precio);
    }

    @Override
    public void aumentarAlmacenamiento(int almacenamiento) {
        this.almacenamiento += almacenamiento;
    }

    @Override
    public void aumentarPrecio(int precio) {
        this.precio += precio;
    }
}
