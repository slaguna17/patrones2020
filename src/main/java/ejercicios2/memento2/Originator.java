package ejercicios2.memento2;

public class Originator {
    private Documento documento;


    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    public Memento createVersion(){
        return new Memento(this.documento);
    }

    public void restoreVersion(Memento n){
        this.documento = n.getDocumento();
        this.documento.showData();


    }

}
