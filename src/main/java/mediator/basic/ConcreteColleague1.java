package mediator.basic;

public class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String msg) {
        mediator.send(msg,this);
    }

    @Override
    public void messageReceived(String msg) {
        System.out.println("Concrete Colleague1 > msg received  : "+msg);
    }
}
