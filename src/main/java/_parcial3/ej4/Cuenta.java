package _parcial3.ej4;

public class Cuenta implements IBanco{
    private double monto;

    public Cuenta(int monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    @Override
    public void comprar(double precio, String tipo) {
            this.monto -= precio;
            System.out.println("Su saldo es de: " + this.monto);
    }

}
