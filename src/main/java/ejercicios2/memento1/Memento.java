package ejercicios2.memento1;

import java.sql.DatabaseMetaData;

public class Memento {
    private BaseDeDatos db;

    public Memento (BaseDeDatos databaseSaved){
        this.db =databaseSaved;
    }

    public BaseDeDatos getDataBaseState() {
        return db;
    }

    public void setDb(BaseDeDatos db) {
        this.db = db.clone();

    }

}
