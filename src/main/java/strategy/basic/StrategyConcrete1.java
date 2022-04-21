package strategy.basic;

public class StrategyConcrete1 implements  IStrategy {
    @Override
    public int execute(int input) {
        System.out.println("Algoritmo 1");
        return 0;
    }
}
