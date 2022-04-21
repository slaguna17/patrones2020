package singleton.ejercicios.ej1;

public class Persona {
    String nombre;
    public Persona(String nombre){
        this.nombre=nombre;
    }

    public void getDinero(int amount){
        Banco.getInstance().getDinero(amount);
    }

}
