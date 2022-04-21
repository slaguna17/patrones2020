package _parcial2.ej1;

public class Originator {
    private Documento state;


    public Documento getState() {
        return state;
    }

    public void setState(Documento state) {
        System.out.println("SET VERSION");
        state.showData();
        this.state = state;
    }

    public Memento createMemento(){
        System.out.println("CREATE VERSION");
        state.showData();
        return new Memento(this.state);
    }

    public void restoreFromMemento(Memento n){
        this.state= n.getState();
        System.out.println("RESTORE VERSION");
        this.state.showData();


    }
}
