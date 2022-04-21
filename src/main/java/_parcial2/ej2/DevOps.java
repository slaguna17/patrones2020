package _parcial2.ej2;

public class DevOps implements IHandler {
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
        if (solicitud.equals("infraestructura")){
            System.out.println("El DevOps pide informacion del error para ver si es un Bug o una Mejora");
        } else {
            this.next.criteriaHandler(solicitud);
        }

    }
}
