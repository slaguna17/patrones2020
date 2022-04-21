package command.ejercicio;

public class CommandSuspender implements ICommand {
    private Computadora receiver;

    public CommandSuspender(Computadora receiver){
        this.receiver=receiver;
    }

    @Override
    public void execute() {
        this.receiver.suspender();
    }
}
