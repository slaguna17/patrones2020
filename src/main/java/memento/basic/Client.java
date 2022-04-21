package memento.basic;

public class Client {

    public  static  void main (String[]args){

        CareTaker careTaker = new CareTaker();
        Originator originator= new Originator();

        ConcreteObjeto concreteObjeto;

        // cambiando estados del objeto concreto


        concreteObjeto= new ConcreteObjeto("UPB","State1");
        originator.setState(concreteObjeto);
        careTaker.addMemento(originator.createMemento()); //  creando mi version/state 1  [1]

        concreteObjeto= new ConcreteObjeto("UPB","State2");
        originator.setState(concreteObjeto);

        concreteObjeto= new ConcreteObjeto("UPB","State3");
        originator.setState(concreteObjeto);
        careTaker.addMemento(originator.createMemento()); //  creando mi version/state 1  [2]


        concreteObjeto= new ConcreteObjeto("UPB","State4");
        originator.setState(concreteObjeto);

        concreteObjeto= new ConcreteObjeto("UPB","State5");
        originator.setState(concreteObjeto);

        originator.restoreFromMemento(careTaker.getMemento(1));

    }
}
