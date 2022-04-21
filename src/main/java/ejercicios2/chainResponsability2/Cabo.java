package ejercicios2.chainResponsability2;

public class Cabo implements IHandler {

    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        this.next=handler;
    }

    @Override
    public IHandler next() {
        return this.next;
    }

    @Override
    public void criteriaHandler(Orden orden) {
        if (orden.equals(Orden.LIMPIEZA)){
            System.out.println("Orden atendida por el Cabo");
        }else{
            System.out.println("Orden no puede ser atendida");
        }
    }

}
