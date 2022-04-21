package ejercicios3_SergioLaguna.ej2;

public class Segip implements IHandler {
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
    public void criteriaHandler(boolean certificado, boolean pago, boolean ficha) {
        if (certificado && pago && ficha){
            System.out.println("Se envio al usuario al responsable de carnetizacion");
        } else {
            this.next.criteriaHandler(certificado,pago,ficha);
        }
    }
}
