package command.ejercicio;

public class CommandCerrarSesion implements ICommand {
    private Computadora receiver;

    public CommandCerrarSesion(Computadora receiver){
        this.receiver=receiver;
    }

    @Override
    public void execute() {
        this.receiver.cerrarSession();
    }
}
