package _parcial2.ej3;

public class Disparar implements ICommand {
    private Receiver receiver;

    public Disparar (Receiver receiver){
        this.receiver=receiver;
    }

    @Override
    public void execute() {
        this.receiver.disparar();
    }
}
