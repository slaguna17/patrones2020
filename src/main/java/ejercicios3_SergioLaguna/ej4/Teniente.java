package ejercicios3_SergioLaguna.ej4;

public class Teniente implements IHandler {
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
        //  condicion para poder hacerme responsable de esa informacion

        if (accion.equals("disciplina")){
            System.out.println("El teniente es el encargado de la disciplina");
        } else {
            this.next.criteriaHandler(accion);
        }

    }
}
