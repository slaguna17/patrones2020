package chainOfResponsability.example;

public class Banco implements IAgenteCredito {

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

        AgenteDeCreditoLocal agenteDeCreditoLocal = new AgenteDeCreditoLocal();
        AgenteDeCreditoSucursal agenteDeCreditoSucursal = new AgenteDeCreditoSucursal();
        AgenteDeCreditoDepartamental agenteDeCreditoDepartamental = new AgenteDeCreditoDepartamental();
        AgenteDeCreditoNacional agenteDeCreditoNacional = new AgenteDeCreditoNacional();

        // definiendo la cadena de responsabilidad de la peticion
        this.setNext(agenteDeCreditoLocal);
        agenteDeCreditoLocal.setNext(agenteDeCreditoSucursal);
        agenteDeCreditoSucursal.setNext(agenteDeCreditoDepartamental);
        agenteDeCreditoDepartamental.setNext(agenteDeCreditoNacional);

        // enviando

        this.next.prestamo(cliente);
    }
}
