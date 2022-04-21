package _parcial2.ej2;

public class Qa implements IHandler{
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
    public void criteriaHandler(String solicitud) {
        if (solicitud.equals("revision")){
            System.out.println("El Qa aisla el error");
        } else {
            this.next.criteriaHandler(solicitud);
        }

    }
}
