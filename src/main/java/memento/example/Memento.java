package memento.example;

public class Memento {
    private Codigo state;

    public Memento (Codigo stateSaved){
        this.state=stateSaved;
    }

    public Codigo getState() {
        return state;
    }

    public void setState(Codigo state) {
        this.state = state;
    }
}
