package ejercicios3_SergioLaguna.ej4;

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
    public void criteriaHandler(String accion) {

        General general = new General(); // Entrevistas
        Teniente teniente = new Teniente(); //  Disciplina
        Coronel coronel = new Coronel(); //  Manifestaciones
        Cabo cabo = new Cabo(); //Limpieza

        // orden de la cadena responsabilidad
        this.setNext(general);
        general.setNext(teniente);
        teniente.setNext(coronel);
        coronel.setNext(cabo);

        this.next.criteriaHandler(accion);
    }
}
