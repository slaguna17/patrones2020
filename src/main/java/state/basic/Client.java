package state.basic;

public class Client {
    public static void main(String [] abc){

        IState state = new ConcreteStateA();

        Context context = new Context();
        context.setState(state);
        context.request();

        state = new ConcreteStateB();
        context.setState(state);
        context.request();

    }

}
