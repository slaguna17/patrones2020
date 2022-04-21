package command.ejercicio;

public class CommandReiniciar implements ICommand {
    private Computadora receiver;

    public CommandReiniciar(Computadora receiver){
        this.receiver=receiver;
    }

    @Override
    public void execute() {
        this.receiver.reiniciar();
    }
}
