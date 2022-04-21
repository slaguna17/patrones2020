package ejercicios2.memento1;

public class Originator {
    private BaseDeDatos db;

    public BaseDeDatos getDb() {
        return db;
    }

    public void setDataBaseState(BaseDeDatos database) {
       this.db= database.clone();
    }

    public Memento createBackup(){
        return new Memento(this.db);
    }

    public void restoreBackup(Memento specificMemento){
       this.db = specificMemento.getDataBaseState();
       System.out.println("Restore Data Base ---");
       this.db.showData();
    }

}
