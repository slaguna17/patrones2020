package ejercicios2.chainResponsability1;


public interface IHandler {

    void setNext(IHandler handler);
    IHandler next();
    void criteriaHandler(PersonaRequisitos personaRequisitos);   // nuestra peticion

}
