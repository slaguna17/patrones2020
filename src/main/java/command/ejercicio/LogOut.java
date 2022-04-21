package command.ejercicio;

public class LogOut implements ICommand {
    private Receiver receiver;

    public LogOut(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.logOut();
    }
}
