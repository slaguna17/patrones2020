package _parcial1.prototipe;

public class Camara {

    String foco;
    String lente;

    public Camara(String foco, String lente){
        this.foco=foco;
        this.lente=lente;
    }

    public String getFoco() {
        return foco;
    }

    public void setFoco(String foco) {
        this.foco = foco;
    }

    public String getLente() {
        return lente;
    }

    public void setLente(String lente) {
        this.lente = lente;
    }
}
