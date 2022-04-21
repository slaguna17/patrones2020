package ejercicios3_SergioLaguna.ej3;

public class Originator {
    private Tesis state;


    public Tesis getState() {
        return state;
    }

    public void setState(Tesis state) {
        System.out.println("Set Version ----> " + state.getVersion());
        //state.showData();
        this.state = state;
    }

    public Memento createMemento(){
        System.out.println("Create Version ----> " + state.getVersion());
        //state.showData();
        return new Memento(this.state);
    }

    public void restoreFromMemento(Memento n){
        this.state= n.getState();
        System.out.println("Restore Version --- > " + state.getVersion());
        this.state.showData();
    }
}
