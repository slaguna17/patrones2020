package memento.basic;

public class Originator {
    private ConcreteObjeto state;


    public ConcreteObjeto getState() {
        return state;
    }

    public void setState(ConcreteObjeto state) {
        System.out.println("Set ----> Object -----");
        state.showData();
        this.state = state;
    }

    public Memento createMemento(){
        System.out.println("Create ---->  Object  -----");
        state.showData();
        return new Memento(this.state);
    }

    public void restoreFromMemento(Memento n){
        this.state= n.getState();
       System.out.println("Restore --- > Object  ");
        this.state.showData();


    }

}
