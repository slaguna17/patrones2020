package _parcial3.ej4;

public class Client {
    public static void main(String[] args) {
        Tarjeta tarjeta = new Tarjeta(50000);

        Moneda moneda = new Moneda();
        moneda.setTipo("bolivianos");
        tarjeta.comprar(51000, moneda.getTipo());
        tarjeta.comprar(200, moneda.getTipo());

        moneda.setTipo("dolares");
        tarjeta.comprar(150, moneda.getTipo());

        moneda.setTipo("euros");
        tarjeta.comprar(80, moneda.getTipo());
    }
}
