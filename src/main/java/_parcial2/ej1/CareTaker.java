package _parcial2.ej1;

import java.util.ArrayList;

public class CareTaker {
    private ArrayList<Memento> savedStates= new ArrayList<>();
    private int indice = 0;

    public void addMemento(Memento memento){
        this.savedStates.add(memento);
        indice++;
    }

    public Memento getMemento(String comando){
        if(comando.equals("ctrl+z") && indice > 0){
            indice--;
            return  this.savedStates.get(indice);
        } else if (comando.equals("ctrl+y") && indice<savedStates.size()){
            indice++;
            return this.savedStates.get(indice);
        } else{
            throw new IndexOutOfBoundsException();
        }
    }

}
