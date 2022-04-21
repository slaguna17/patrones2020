package chainOfResponsability.example;

public class AgenteDeCreditoLocal implements IAgenteCredito {

    private IAgenteCredito next;

    @Override
    public void setNext(IAgenteCredito handler) {
        this.next=handler;
    }

    @Override
    public IAgenteCredito next() {
        return this.next;
    }

    @Override
    public void prestamo(Persona cliente) {
        //  condicion para poder hacerme responsable de esa informacion
        //  Es el monto de prestamos que requiere el cliente

        if (cliente.getMontoPretamo() >= 0 && cliente.getMontoPretamo() < 10){
            System.out.println("INFO > Proceso Atendio por : AgenteDeCreditoLocal");
            Caja.getInstance().getMoney(cliente.getMontoPretamo());
        } else {
            this.next.prestamo(cliente);
        }

    }
}
