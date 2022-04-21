package _parcial2.ej2;

public class Developer implements IHandler {
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
        if (solicitud.equals("nuevaFuncion")){
            System.out.println("El developer estima la nueva funcionalidad");
        } else {
            this.next.criteriaHandler(solicitud);
        }

    }
}
