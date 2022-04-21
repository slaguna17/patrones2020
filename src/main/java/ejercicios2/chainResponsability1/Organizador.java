package ejercicios2.chainResponsability1;

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
    public void criteriaHandler(PersonaRequisitos personaRequisitos) {
        ResponsableDeCarnetizacion responsableDeCarnetizacion= new ResponsableDeCarnetizacion();
        Notario notario= new Notario();
        Cajero cajero= new Cajero();
        AyudaAlCliente ayudaAlCliente= new AyudaAlCliente();

        this.setNext(responsableDeCarnetizacion);
        responsableDeCarnetizacion.setNext(notario);
        notario.setNext(cajero);
        cajero.setNext(ayudaAlCliente);

        this.next.criteriaHandler(personaRequisitos);
    }


}
