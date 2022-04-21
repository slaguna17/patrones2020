package observer.ejercicio;

public interface IObserver {
    Persona persona = new Persona("","");
    String category = "";

    void update(String msg);

    String getCategory();
    Persona getPersona();
}
