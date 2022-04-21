package adapter.basic;

public class ConcreteB implements  IAdapter {
    @Override
    public void method1() {
        System.out.println("ConcreteB method1");
    }

    @Override
    public void method2() {
        System.out.println("ConcreteB method2");
    }

    @Override
    public void method3() {
        System.out.println("ConcreteB method3");
    }
}
