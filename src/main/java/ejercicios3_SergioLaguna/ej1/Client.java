package ejercicios3_SergioLaguna.ej1;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();

        //Personas
        Persona p1 = new Persona("Sergio", 5939495, 21);
        Persona p2 = new Persona("Matias", 6079687, 26);
        Persona p3 = new Persona("Carlos", 14141414, 55);
        Persona p4 = new Persona("Juan", 2048048, 19);
        Persona p5 = new Persona("Phillip", 1010100, 32);
        //listas
        List<Persona> l1 = new ArrayList<>();
        List<Persona> l2 = new ArrayList<>();
        List<Persona> l3 = new ArrayList<>();
        List<Persona> l4 = new ArrayList<>();
        List<Persona> l5 = new ArrayList<>();

        l1.add(p1);
        l2.add(p2);
        l3.add(p3);
        l4.add(p4);
        l5.add(p5);

        //Backups
        Backup backup;

        backup = new Backup("BackupMayo",l1);
        originator.setState(backup);
        careTaker.addMemento(originator.createMemento());

        backup = new Backup("BackupJunio",l2);
        originator.setState(backup);
        careTaker.addMemento(originator.createMemento());

        backup = new Backup("BackupJulio",l3);
        originator.setState(backup);
        careTaker.addMemento(originator.createMemento());

        backup = new Backup("BackupAgosto",l4);
        originator.setState(backup);
        careTaker.addMemento(originator.createMemento());

        backup = new Backup("BackupJunio",l5);
        originator.setState(backup);
        careTaker.addMemento(originator.createMemento());

        originator.restoreFromMemento(careTaker.getMemento(1));
    }
}
