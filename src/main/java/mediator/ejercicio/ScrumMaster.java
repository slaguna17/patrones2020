package mediator.ejercicio;

public class ScrumMaster extends Colleague {

    public ScrumMaster(Mediator mediator) {
        super(mediator);
        this.role="SM";
    }

    @Override
    public void send(String msg) {
        mediator.send("[msg send] "+this.role+" "+this.name+" : "+msg,this);
    }

    @Override
    public void messageReceived(String msg) {
        System.out.println("[msg received] "+this.role+" "+this.name+" < "+msg);
    }
}
