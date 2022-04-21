package _parcial2.ej3;

public class Defensa implements ICommand {
    private Receiver receiver;

    public Defensa (Receiver receiver){
        this.receiver=receiver;
    }

    @Override
    public void execute() {
        this.receiver.defender();
    }
}
