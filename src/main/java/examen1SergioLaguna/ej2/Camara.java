package examen1SergioLaguna.ej2;

public class Camara {
    private int foco;
    private int lente;

    public Camara(int foco, int lente) {
        this.foco = foco;
        this.lente = lente;
    }

    public int getFoco() {
        return foco;
    }

    public void setFoco(int foco) {
        this.foco = foco;
    }

    public int getLente() {
        return lente;
    }

    public void setLente(int lente) {
        this.lente = lente;
    }
}
