package _parcial2.ej1;

public class Client {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Originator originator= new Originator();

        Documento doc;

        doc = new Documento("1");
        originator.setState(doc);
        careTaker.addMemento(originator.createMemento()); //  creando mi version/state 1  [1]

        doc= new Documento("2");
        originator.setState(doc);
        careTaker.addMemento(originator.createMemento());

        doc= new Documento("3");
        originator.setState(doc);
        careTaker.addMemento(originator.createMemento()); //  creando mi version/state 1  [2]

        doc= new Documento("4");
        originator.setState(doc);
        careTaker.addMemento(originator.createMemento());

        //ctrl+z
        originator.restoreFromMemento(careTaker.getMemento("ctrl+z"));
        originator.restoreFromMemento(careTaker.getMemento("ctrl+z"));
        originator.restoreFromMemento(careTaker.getMemento("ctrl+z"));
        originator.restoreFromMemento(careTaker.getMemento("ctrl+z"));
        //ctrl+y
        originator.restoreFromMemento(careTaker.getMemento("ctrl+y"));
        originator.restoreFromMemento(careTaker.getMemento("ctrl+y"));
        originator.restoreFromMemento(careTaker.getMemento("ctrl+y"));



    }
}
