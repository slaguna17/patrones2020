package adapter.basic;

public class ConcreteAdapter implements  IAdapter {
    // caracteristica
    private Adaptee adaptee;

    public ConcreteAdapter(Adaptee adaptee){
        this.adaptee= adaptee;
    }


    @Override
    public void method1() {
        // logica
        this.adaptee.method1Different();
    }

    @Override
    public void method2() {
        //logica
        this.adaptee.method2Different();
    }

    @Override
    public void method3() {
        this.adaptee.method3Different();
    }
}
