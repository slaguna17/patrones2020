package chainOfResponsability.basic;

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
    public void criteriaHandler(int amount) {

        HandlerConcrete1 handlerConcrete1 = new HandlerConcrete1(); // <100
        HandlerConcrete2 handlerConcrete2 = new HandlerConcrete2(); //  100- 500
        HandlerConcrete3 handlerConcrete3 = new HandlerConcrete3(); //   500 -1000

        // orden de la cadena responsabilidad
        this.setNext(handlerConcrete1);
        handlerConcrete1.setNext(handlerConcrete2);
        handlerConcrete2.setNext(handlerConcrete3);

        this.next.criteriaHandler(amount);
    }
}
