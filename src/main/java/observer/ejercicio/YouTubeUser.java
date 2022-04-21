package observer.ejercicio;

public class YouTubeUser implements IObserver {

    private Persona persona;
    private String category;

    public YouTubeUser(Persona persona, String category){
        this.persona=persona;
        this.category=category;
    }

    @Override
    public void update(String msg) {
        System.out.println("YouTubeUser : "+this.persona.nombre+"["+this.category+"]  > [Notificacion] : "+msg);
    }

    @Override
    public Persona getPersona() {
        return persona;
    }

    @Override
    public String getCategory() {
        return category;
    }

}
