package observer.basic;

public class ObservadorConcrete1 implements IObserver{
    @Override
    public void update(String msg) {
        System.out.println("ObservadorConcrete1  > [Notificacion]"+msg);
        // logica
    }
}
