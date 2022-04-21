package ejercicios2.chainResponsability2;

public class Coronel implements IHandler {

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
        if (orden.equals(Orden.DESBLOQUEOS) || orden.equals(Orden.MANIFIESTACIONES)){
            System.out.println("Orden atendida por el Coronel");
        }else{
            this.next.criteriaHandler(orden);
        }
    }

}
