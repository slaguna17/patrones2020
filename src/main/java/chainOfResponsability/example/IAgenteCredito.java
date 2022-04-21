package chainOfResponsability.example;


public interface IAgenteCredito {

    void setNext(IAgenteCredito handler);
    IAgenteCredito next();
    void prestamo(Persona cliente);   // nuestra peticion

}
