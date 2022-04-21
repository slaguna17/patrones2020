package _parcial1.prototipe;

public class Client {

    public static void main (String [] args){

       Celular cel1 = new Celular();
       cel1.setTamano("M");
       cel1.setPeso("60");
       cel1.setOrigen("Bolivia");
       cel1.setModelo("A1");
       cel1.setImei("10001");
       cel1.setCamara(new Camara("10","5mp"));

       Celular cel2 = (Celular) cel1.clone();
       cel2.setModelo("10002");

       Celular cel3= (Celular) cel1.clone();
       cel3.setModelo("10003");

       cel1.showData();
       cel2.showData();
       cel3.showData();

    }

}
