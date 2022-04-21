package command.basic;

public class CommandConcrete1 implements  ICommand{
    private Receiver receiver;

    public CommandConcrete1 (Receiver receiver){
        this.receiver=receiver;
    }

    @Override
    public void execute() {
        this.receiver.operation1();
    }
}
