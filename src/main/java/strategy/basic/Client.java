package strategy.basic;

public class Client {
    public static void main(String []abx){

        Context context = new Context();
        context.setAttribute2(9);

        context.setStrategy(new StrategyConcrete1());
        context.execute();

        context.setStrategy(new StrategyConcrete2());
        context.execute();

        context.setStrategy(new StrategyConcrete3());
        context.execute();


    }

}
