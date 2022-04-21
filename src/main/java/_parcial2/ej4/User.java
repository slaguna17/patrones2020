package _parcial2.ej4;

public class User implements IObserver {
    private Persona persona;
    private String category;

    public User(Persona persona, String category) {
        this.persona = persona;
        this.category = category;
    }

    @Override
    public void update(String msg) {
        System.out.println("User: " + this.persona.nombre+ "("+this.category+") > (Notificacion :"+msg);
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public Persona getPersona() {
        return persona;
    }
}
