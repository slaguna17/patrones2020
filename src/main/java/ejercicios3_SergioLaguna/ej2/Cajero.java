package ejercicios3_SergioLaguna.ej2;

public class Cajero implements IHandler {
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
        if (certificado && !pago && ficha){
            System.out.println("Se envio al usuario al cajero para pagar su tramite");
        } else {
            this.next.criteriaHandler(certificado,pago,ficha);
        }
    }
}
