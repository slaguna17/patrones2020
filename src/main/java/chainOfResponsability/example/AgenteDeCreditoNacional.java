package chainOfResponsability.example;

public class AgenteDeCreditoNacional implements IAgenteCredito {

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

        if (cliente.getMontoPretamo() >= 50){
            System.out.println("INFO > Proceso Atendio por : AgenteDeCreditoNacional");
            Caja.getInstance().getMoney(cliente.getMontoPretamo());

        } else {
            System.out.println("ERROR > Revise el monto que solicito el cliente : "+cliente.getMontoPretamo());
        }

    }
}
