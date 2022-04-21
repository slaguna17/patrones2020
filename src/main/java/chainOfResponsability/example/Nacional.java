package chainOfResponsability.example;

public class Nacional implements IHadler {
    private IHadler next;

    @Override
    public void setNext(IHadler handler) {
        this.next=handler;
    }

    @Override
    public IHadler next() {
        return this.next;
    }

    @Override
    public void criteriaHandler(int amount) {
        //  condicion para poder hacerme responsable de esa informacion

        if (amount > 50000){
            System.out.println("Tipo de credito: Nacional");
        } else {
            this.next.criteriaHandler(amount);
        }

    }
}
