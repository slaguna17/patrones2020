package mediator.basic;

public class ConcreteMediator implements Mediator {


    private  ConcreteColleague1 concreteColleague1;
    private  ConcreteColleague2 concreteColleague2;

    @Override
    public void send(String msg, Colleague colleague) {
        if (colleague == concreteColleague1)
            concreteColleague2.messageReceived(msg);
        else
            concreteColleague1.messageReceived(msg);

    }

    public ConcreteColleague1 getConcreteColleague1() {
        return concreteColleague1;
    }

    public void setConcreteColleague1(ConcreteColleague1 concreteColleague1) {
        this.concreteColleague1 = concreteColleague1;
    }

    public ConcreteColleague2 getConcreteColleague2() {
        return concreteColleague2;
    }

    public void setConcreteColleague2(ConcreteColleague2 concreteColleague2) {
        this.concreteColleague2 = concreteColleague2;
    }
}
