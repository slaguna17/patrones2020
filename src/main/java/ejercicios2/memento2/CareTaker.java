package ejercicios2.memento2;
import java.util.HashMap;
import java.util.Map;

public class CareTaker {

    private Map<String, Memento> savedStates= new HashMap<>();

    public void addVersion(Memento memento, String msg){
        this.savedStates.put(msg,memento);
    }

    public Memento getVersion(String msg){
        return  this.savedStates.get(msg);
    }

}
