package command.ejercicio;

public class Suspender implements ICommand {
    private Receiver receiver;

    public Suspender(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.suspender();
    }
}
