package _parcial2.ej2;

public class Support implements IHandler {
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
        if (solicitud.equals("otros")){
            System.out.println("Cualquier otro tema, el Support es el encargado de arreglarlo");
        }
    }
}
