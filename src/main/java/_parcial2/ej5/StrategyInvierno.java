package _parcial2.ej5;

public class StrategyInvierno implements IStrategy {
    @Override
    public int execute(int precio, Ropa ropa) {
        System.out.println("Estacion de invierno");
        ropa.setPrecio(precio+(precio/10));
        return -10;
    }
}
