package memento.example;

public class Client {

    public  static  void main (String[]args){

        CareTaker git = new CareTaker();
        Originator originator= new Originator();

        Codigo estudianteAPI;

        // cambiando estados del objeto concreto


        estudianteAPI= new Codigo("UPB","Hello World");
        originator.setState(estudianteAPI);
        git.addMemento(originator.createMemento(),"commit version1"); //  creando mi version/state 1  [commit version1]

        estudianteAPI= new Codigo("UPB","GET request");
        originator.setState(estudianteAPI);

        estudianteAPI= new Codigo("UPB","POST request");
        originator.setState(estudianteAPI);
        git.addMemento(originator.createMemento(), "commit version2"); //  creando mi version/state 1  [commit version2]

        estudianteAPI= new Codigo("UPB","State4");
        originator.setState(estudianteAPI);

        estudianteAPI= new Codigo("UPB","State5");
        originator.setState(estudianteAPI);

        originator.restoreFromMemento(git.getMemento("commit version1"));
    }
}
