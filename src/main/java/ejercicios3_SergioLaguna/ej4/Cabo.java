package ejercicios3_SergioLaguna.ej4;

public class Cabo implements IHandler {
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

        if (accion.equals("limpieza")){
            System.out.println("El cabo realiza la limpieza");
        } else {
            System.out.println("Esta accion no se acepta en este cuartel");
        }

    }
}
