package _parcial2.ej5;

public class StrategyOtonio implements IStrategy {
    @Override
    public int execute(int precio, Ropa ropa) {
        System.out.println("Estacion otoño, Ropa al 50% de descuento");
        ropa.setPrecio(precio-(precio/2));
        return 50;
    }
}
