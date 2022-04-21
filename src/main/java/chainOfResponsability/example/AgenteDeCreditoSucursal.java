package chainOfResponsability.example;

public class AgenteDeCreditoSucursal implements IAgenteCredito {

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

        if (cliente.getMontoPretamo() >= 10 && cliente.getMontoPretamo() < 20){
            System.out.println("INFO > Proceso Atendio por : AgenteDeCreditoSucursal");
            Caja.getInstance().getMoney(cliente.getMontoPretamo());

        } else {
            this.next.prestamo(cliente);
        }

    }
}
