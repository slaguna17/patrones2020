package observer.basic;

public class ObservadorConcrete2 implements IObserver{
    @Override
    public void update(String msg) {
        System.out.println("ObservadorConcrete2  > [Notificacion]"+msg);
    }
}
