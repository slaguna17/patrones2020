package observer.basic;

import java.util.ArrayList;

public class ConcreteSubject implements ISubject {
    private ArrayList<IObserver> observers = new ArrayList<>();

    private String attribute1;
    private int attribute2;

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
        this.notifyObserver();
    }

    public int getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(int attribute2) {
        this.attribute2 = attribute2;
    }

    @Override
    public void attach(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void deAttach(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < this.observers.size(); i++) {
            this.observers.get(i).update(this.attribute1);
        }
    }
}
