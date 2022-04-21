package ejercicios2.chainResponsability1;

public class AyudaAlCliente implements IHandler {

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
    public void criteriaHandler(PersonaRequisitos personaRequisitos) {
        System.out.println("Persona : [" + personaRequisitos.getNombre()+ "] Atendida por AyudaAlCliente");
    }
}
