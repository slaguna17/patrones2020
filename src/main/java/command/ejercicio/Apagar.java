package command.ejercicio;

public class Apagar implements ICommand {
    private Receiver receiver;

    public Apagar(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.apagar();
    }
}
