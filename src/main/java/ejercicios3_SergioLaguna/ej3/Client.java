package ejercicios3_SergioLaguna.ej3;

public class Client {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();

        Tesis tesis;

        tesis = new Tesis(1,"introduccion");
        originator.setState(tesis);
        careTaker.addMemento(originator.createMemento());

        tesis = new Tesis(2,"indice");
        originator.setState(tesis);
        careTaker.addMemento(originator.createMemento());

        tesis = new Tesis(3,"graficos");
        originator.setState(tesis);
        careTaker.addMemento(originator.createMemento());

        tesis = new Tesis(4, "cuerpo");
        originator.setState(tesis);
        careTaker.addMemento(originator.createMemento());

        tesis = new Tesis(5,"conclucion");
        originator.setState(tesis);
        careTaker.addMemento(originator.createMemento());

        originator.restoreFromMemento(careTaker.getMemento(2));
    }

}
