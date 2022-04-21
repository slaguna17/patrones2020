package ejercicios3_SergioLaguna.ej4;

public interface IHandler {
    void setNext(IHandler handler);
    IHandler next();
    void criteriaHandler(String accion);
}
