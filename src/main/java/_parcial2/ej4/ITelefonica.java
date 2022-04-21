package _parcial2.ej4;

public interface ITelefonica {
   void attach(IObserver observer);
   void deAttach(IObserver observer);
   void notifyObserver();

}
