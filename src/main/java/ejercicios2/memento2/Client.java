package ejercicios2.memento2;

public class Client {

    public  static  void main (String[]args){

        CareTaker careTaker = new CareTaker();
        Originator originator= new Originator();

        Documento tesis;

        tesis= new Documento("UPB Title");
        originator.setDocumento(tesis);
        careTaker.addVersion(originator.createVersion(),"Revision1");

        tesis= new Documento("UPB Summary");
        originator.setDocumento(tesis);
        careTaker.addVersion(originator.createVersion(),"Revision2");

        tesis= new Documento("UPB2 Introduction");
        originator.setDocumento(tesis);
        careTaker.addVersion(originator.createVersion(),"Revision3");


        tesis= new Documento("UPB3 Remove Title");
        originator.setDocumento(tesis);
        careTaker.addVersion(originator.createVersion(),"Revision4");

        tesis= new Documento("UPB4 Complete");
        originator.setDocumento(tesis);
        careTaker.addVersion(originator.createVersion(),"Revision5");

        originator.restoreVersion(careTaker.getVersion("Revision3"));

    }
}
