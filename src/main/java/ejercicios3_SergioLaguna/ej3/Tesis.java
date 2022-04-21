package ejercicios3_SergioLaguna.ej3;


public class Tesis {
    private int version;
    private String texto;
    public Tesis(int version, String texto){
        this.version=version;
        this.texto = texto;
    }

    public void showData(){
        System.out.println("version : "+this.version);
        System.out.println("contenido : "+this.texto);
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
