package adapter.basic;

public class ConcreteA implements  IAdapter {
    @Override
    public void method1() {
        System.out.println("ConcreteA method1");
    }

    @Override
    public void method2() {
        System.out.println("ConcreteA method2");
    }

    @Override
    public void method3() {
        System.out.println("ConcreteA method3");
    }
}
