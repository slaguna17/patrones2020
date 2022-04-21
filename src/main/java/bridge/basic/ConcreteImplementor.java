package bridge.basic;

public class ConcreteImplementor implements  Implementor {
    @Override
    public void operation1() {
        System.out.println("ConcreteImplementor2 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("ConcreteImplementor2 operation2");
    }
}
