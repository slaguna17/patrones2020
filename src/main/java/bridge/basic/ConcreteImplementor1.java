package bridge.basic;

public class ConcreteImplementor1 implements  Implementor {
    @Override
    public void operation1() {
        System.out.println("ConcreteImplementor1 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("ConcreteImplementor1 operation2");
    }
}
