package templateMethod.basic;

public class ConcreteClass1 extends AbstractClass {
    @Override
    void method1() {
        System.out.println(" ConcreteClass1 method1");
    }

    @Override
    void method2() {
        System.out.println(" ConcreteClass1 method2");
    }

    @Override
    public void templateMethod1(){
        System.out.println(" ConcreteClass1 templateMethod1 @Override");
    }

}
