package command.ejercicio;

public class CommandApagar implements ICommand {
    private Computadora receiver;

    public CommandApagar(Computadora receiver){
        this.receiver=receiver;
    }

    @Override
    public void execute() {
        this.receiver.apagar();
    }
}
