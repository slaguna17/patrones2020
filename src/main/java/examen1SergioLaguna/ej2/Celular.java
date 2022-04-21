package examen1SergioLaguna.ej2;

public class Celular implements Icel{
    private String modelo;
    private int tamanio;
    private int peso;
    private Camara camara;
    private int imei;
    private String origen;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Camara getCamara() {
        return camara;
    }

    public void setCamara(Camara camara) {
        this.camara = camara;
    }

    public int getImei() {
        return imei;
    }

    public void setImei(int imei) {
        this.imei = imei;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public Object clone() {
        Celular clone = new Celular();
        clone.setCamara(this.camara);
        clone.setModelo(this.modelo);
        clone.setImei(this.imei);
        clone.setOrigen(this.origen);
        clone.setPeso(this.peso);
        clone.setTamanio(this.tamanio);
        return clone;
    }
    public void showData(){
        System.out.println("*******************************");
        System.out.println("tamanio: "+tamanio);
        System.out.println("modelo: "+modelo);
        System.out.println("origen: "+origen);
        System.out.println("peso: "+peso);
        System.out.println("foco: "+camara.getFoco());
        System.out.println("lente: "+camara.getLente());
        System.out.println("imei: "+ imei);
    }
}
