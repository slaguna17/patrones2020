package command.basic;

public class CommandConcrete2 implements  ICommand{
    private Receiver receiver;

    public CommandConcrete2(Receiver receiver){
        this.receiver=receiver;
    }

    @Override
    public void execute() {
        this.receiver.operation2();
    }
}
