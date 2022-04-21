package ejercicios2.chainResponsability2;

public class General implements IHandler {

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
        if (orden.equals(Orden.ENTREVISA)){
            System.out.println("Orden atendida por el General");
        }else{
            this.next.criteriaHandler(orden);
        }
    }

}
