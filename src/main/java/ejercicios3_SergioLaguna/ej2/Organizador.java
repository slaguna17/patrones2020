package ejercicios3_SergioLaguna.ej2;

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
    public void criteriaHandler(boolean certificado, boolean pago, boolean ficha) {
        Segip segip = new Segip(); // Cumple todo
        Notario notario = new Notario(); //  le falta certificado
        Cajero cajero = new Cajero(); //   le falta el pago
        AyudaAlCliente ayudaAlCliente = new AyudaAlCliente(); // no tiene nada

        // orden de la cadena responsabilidad
        this.setNext(segip);
        segip.setNext(notario);
        notario.setNext(cajero);
        cajero.setNext(ayudaAlCliente);


        this.next.criteriaHandler(certificado, pago, ficha);
    }
}
