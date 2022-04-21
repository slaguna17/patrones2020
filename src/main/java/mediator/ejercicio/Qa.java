package mediator.ejercicio;

public class Qa extends Colleague {

    public Qa(Mediator mediator) {
        super(mediator);
        this.role="QA";
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
