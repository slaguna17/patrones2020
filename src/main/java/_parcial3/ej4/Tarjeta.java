package _parcial3.ej4;

public class Tarjeta implements IBanco {
    private Cuenta cuenta;
    private Moneda moneda;

    public Tarjeta(int monto){
        this.cuenta = new Cuenta(monto);
    }

    @Override
    public void comprar(double precio, String tipo) {
        if(tipo.equals("bolivianos")){
            System.out.println("Ya esta en bs");
        } else if (tipo.equals("dolares")) {
            precio = precio*6.96;
            System.out.println("El equivalente de esto de dolar a bs es: " + precio);
        } else if (tipo.equals("euros")){
            precio = precio*9;
            System.out.println("El equivalente de esto de euro a bs es: " + precio);
        } else {
            throw new IllegalArgumentException();
        }
        if (cuenta.getMonto() - precio > 0) {
            cuenta.comprar(precio, tipo);
        } else {
            System.out.println("No alcanza el dinero.");
        }
    }
}
