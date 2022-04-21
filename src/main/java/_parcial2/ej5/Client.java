package _parcial2.ej5;

public class Client {
    public static void main(String[] args) {
        Ropa ropa = new Ropa();
        ropa.setPrecio(200);

        ropa.setStrategy(new StrategyPrimavera());
        ropa.execute();
        System.out.println(ropa.getPrecio());

        ropa.setStrategy(new StrategyVerano());
        ropa.execute();
        System.out.println(ropa.getPrecio());

        ropa.setStrategy(new StrategyOtonio());
        ropa.execute();
        System.out.println(ropa.getPrecio());

        ropa.setStrategy(new StrategyInvierno());
        ropa.execute();
        System.out.println(ropa.getPrecio());


    }
}
