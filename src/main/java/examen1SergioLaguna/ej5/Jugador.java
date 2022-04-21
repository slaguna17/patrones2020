package examen1SergioLaguna.ej5;

public class Jugador extends Equipo{
    private String nombre;
    private int rate;

    public Jugador(Mediator mediator) {
        super(mediator);
        this.role= "player";
    }

    @Override
    public void send(String msg) {

    }

    @Override
    public void messageReceived(String msg) {

    }
}
