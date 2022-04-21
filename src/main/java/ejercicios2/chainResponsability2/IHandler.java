package ejercicios2.chainResponsability2;


public interface IHandler {

    void setNext(IHandler handler);
    IHandler next();
    void criteriaHandler(Orden orden);   // nuestra peticion

}
