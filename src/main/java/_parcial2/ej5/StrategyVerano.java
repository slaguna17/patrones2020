package _parcial2.ej5;

public class StrategyVerano implements IStrategy {
    @Override
    public int execute(int precio, Ropa ropa) {
        System.out.println("Estacion verano, Ropa al 10% de descuento");
        ropa.setPrecio(precio-(precio/10));
        return 0;
    }
}
