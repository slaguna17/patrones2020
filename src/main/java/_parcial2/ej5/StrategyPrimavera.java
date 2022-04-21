package _parcial2.ej5;

public class StrategyPrimavera implements IStrategy {
    @Override
    public int execute(int precio, Ropa ropa) {
        System.out.println("Estacion Primavera");
        return precio;
    }
}
