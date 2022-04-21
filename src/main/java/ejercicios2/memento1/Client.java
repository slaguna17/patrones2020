package ejercicios2.memento1;

public class Client {

    public  static  void main (String[]args){

        CareTaker careTaker = new CareTaker();
        Originator originator= new Originator();

        BaseDeDatos mysql=new BaseDeDatos("RegistroDB");

        mysql.addPersonas(new Persona("JUAN1","111111"));
        originator.setDataBaseState(mysql);
        careTaker.saveBackup(originator.createBackup(),"BackupMarzo"); //  creando mi version/state 1  [1]

        mysql.addPersonas(new Persona("JUAN2","11112"));
        originator.setDataBaseState(mysql);

        mysql.addPersonas(new Persona("JUAN3","111113"));
        originator.setDataBaseState(mysql);
        careTaker.saveBackup(originator.createBackup(),"BackupAbril"); //  creando mi version/state 1  [2]


        mysql.addPersonas(new Persona("JUAN4","111114"));
        originator.setDataBaseState(mysql);

        mysql.addPersonas(new Persona("JUAN5","111115"));
        originator.setDataBaseState(mysql);

        mysql.showData();

        originator.restoreBackup(careTaker.restoreBackup("BackupMarzo"));



    }
}
