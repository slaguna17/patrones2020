package mediator.basic;

public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String msg) {
        mediator.send(msg,this);
    }

    @Override
    public void messageReceived(String msg) {
        System.out.println("Concrete Colleague2 > msg received  : "+msg);
    }
}
