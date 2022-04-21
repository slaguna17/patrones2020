package state.basic;

public class ConcreteStateA implements  IState {
    @Override
    public void handle() {
        System.out.println("State > ConcreteStateA");
    }
}
