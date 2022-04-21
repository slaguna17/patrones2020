package chainOfResponsability.basic;

public class HandlerConcrete3 implements  IHandler {

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
        //  condicion para poder hacerme responsable de esa informacion

        if (amount >= 500 && amount < 1000){
            System.out.println("Proceso Atendio por : HandlerConcrete3");
        } else {
            System.out.println("Por el momento no hay quien maneje su peticion");
        }

    }
}
