package memento.basic;

public class Memento {
    private ConcreteObjeto state;

    public Memento (ConcreteObjeto stateSaved){
        this.state=stateSaved;
    }

    public ConcreteObjeto getState() {
        return state;
    }

    public void setState(ConcreteObjeto state) {
        this.state = state;
    }
}
