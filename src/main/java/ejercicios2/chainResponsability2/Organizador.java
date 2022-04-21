package ejercicios2.chainResponsability2;

public class Organizador implements IHandler {
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
            Coronel coronel= new Coronel();
            Teniente teniente= new Teniente();
            General general= new General();
            Cabo cabo= new Cabo();

            this.setNext(general);
            general.setNext(teniente);
            teniente.setNext(coronel);
            coronel.setNext(cabo);

            this.next.criteriaHandler(orden);

    }

}
