package examen1SergioLaguna.ej2;

public class Client {
    public static void main(String[] args) {
        Celular cel1 = new Celular();
        cel1.setTamanio(10);
        cel1.setPeso(60);
        cel1.setOrigen("Bolivia");
        cel1.setCamara(new Camara(10,5));
        cel1.setModelo("A1");
        cel1.setImei(10001);

        Celular cel2 = (Celular) cel1.clone();
        cel2.setImei(10002);
        Celular cel3 = (Celular) cel1.clone();
        cel3.setImei(10003);

        cel1.showData();
        cel2.showData();
        cel3.showData();
    }
}
