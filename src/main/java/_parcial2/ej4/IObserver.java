package _parcial2.ej4;

public interface IObserver {
    Persona persona = new Persona("");
    String category = "";

    void update(String msg);

    String getCategory();
    Persona getPersona();
}
