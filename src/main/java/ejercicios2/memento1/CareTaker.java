package ejercicios2.memento1;

import java.util.HashMap;
import java.util.Map;

public class CareTaker {

    private Map<String,Memento> savedStates= new HashMap<>();

    public void saveBackup(Memento memento, String alias){
        this.savedStates.put(alias,memento);

    }

    public Memento restoreBackup(String alias){
        System.out.println("Backup to Restore : "+alias);
        return  this.savedStates.get(alias);
    }

}
