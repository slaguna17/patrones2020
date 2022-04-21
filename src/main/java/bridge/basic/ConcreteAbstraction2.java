package bridge.basic;

public class ConcreteAbstraction2 implements IAbstraction {

    //caracteristica
    private Implementor implementor;

    public ConcreteAbstraction2(Implementor implementor){
        this.implementor= implementor;
    }

    @Override
    public void method1() {
        System.out.println("ConcreteAbstraction2 method1");
        this.implementor.operation1();
    }

    @Override
    public void method2() {
        System.out.println("ConcreteAbstraction2 method2");
        this.implementor.operation2();
    }
}
