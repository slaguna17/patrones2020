package ejercicios3_SergioLaguna.ej1;

public class Originator {
    private Backup state;


    public Backup getState() {
        return state;
    }

    public void setState(Backup state) {
        System.out.println("Set ----> " + state.getAlias());
        //state.showData();
        this.state = state;
    }

    public Memento createMemento(){
        System.out.println("Create ----> " + state.getAlias());
        //state.showData();
        return new Memento(this.state);
    }

    public void restoreFromMemento(Memento n){
        this.state= n.getState();
        System.out.println("Restore --- > " + state.getAlias());
        this.state.showData();
    }
}
