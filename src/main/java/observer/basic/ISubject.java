package observer.basic;

public interface ISubject {

    void attach(IObserver observer);
    void deAttach(IObserver observer);
    void notifyObserver();
}
