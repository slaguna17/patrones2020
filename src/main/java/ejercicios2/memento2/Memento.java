package ejercicios2.memento2;

public class Memento {
    private Documento documento;

    public Memento (Documento stateSaved){
        this.documento =stateSaved;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }
}
