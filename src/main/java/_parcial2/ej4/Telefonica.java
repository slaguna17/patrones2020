package _parcial2.ej4;

import java.util.ArrayList;

public class Telefonica implements ITelefonica {
    private ArrayList<IObserver> observers = new ArrayList<>();
    private ArrayList<Notificacion> notificaciones = new ArrayList<>();

    @Override
    public void attach(IObserver observer){
        this.observers.add(observer);
    }

    @Override
    public void deAttach(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(IObserver observer: observers){
            if (observer.getCategory().equals("AnyCategory") ||
                    observer.getCategory().equals(notificaciones.get(notificaciones.size() -1).categoria)){
                observer.update("(Notify\n\t: "+ "\n\tCategoria: " + notificaciones.get(notificaciones.size()-1).categoria);
            }
        }
    }
}
