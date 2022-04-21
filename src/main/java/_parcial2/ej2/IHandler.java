package _parcial2.ej2;

public interface IHandler {
    void setNext(IHandler handler);
    IHandler next();
    void criteriaHandler(String solicitud);
}
