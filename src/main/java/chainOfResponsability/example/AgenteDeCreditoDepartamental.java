package chainOfResponsability.example;

public class AgenteDeCreditoDepartamental implements IAgenteCredito {

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

        if (cliente.getMontoPretamo() >= 20 && cliente.getMontoPretamo() < 50){
            System.out.println("INFO > Proceso Atendio por : AgenteDeCreditoDepartamental");
            Caja.getInstance().getMoney(cliente.getMontoPretamo());
        } else {
            this.next.prestamo(cliente);
        }
    }
}
