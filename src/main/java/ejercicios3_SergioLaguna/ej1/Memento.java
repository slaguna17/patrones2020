package ejercicios3_SergioLaguna.ej1;

public class Memento {
    private Backup state;

    public Memento (Backup stateSaved){
        this.state=stateSaved;
    }

    public Backup getState() {
        return state;
    }

    public void setState(Backup state) {
        this.state = state;
    }
}
