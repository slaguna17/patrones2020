package _parcial1.prototipe;

public class Celular implements ICelular {


    private Camara camara;
    private String modelo;
    private  String  tamano;
    private String peso;
    private String imei;
    private String origen;

    public Celular(){

    }

    @Override
    public Object clone() {
      Celular cloneObject = new Celular();
      cloneObject.setCamara(this.camara);
      cloneObject.setImei(this.imei);
      cloneObject.setModelo(this.modelo);
      cloneObject.setOrigen(this.origen);
      cloneObject.setPeso(this.peso);
      cloneObject.setTamano(this.tamano);

      return cloneObject;
    }

    public void showData(){
        System.out.println("camara foco "+camara.getFoco());
        System.out.println("camara lente "+camara.getLente());
        System.out.println("modelo "+modelo);
        System.out.println("tamano "+  tamano);
        System.out.println("peso"+peso);
        System.out.println("imei "+imei);
        System.out.println("origen"+origen);
    }

    public Camara getCamara() {
        return camara;
    }

    public void setCamara(Camara camara) {
        this.camara = camara;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
}
