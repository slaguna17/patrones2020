package ejercicios3_SergioLaguna.ej2;

public interface IHandler {
    void setNext(IHandler handler);
    IHandler next();
    void criteriaHandler(boolean certificado, boolean pago , boolean ficha);
}
