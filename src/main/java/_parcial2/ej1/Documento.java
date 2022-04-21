package _parcial2.ej1;

public class Documento {
    private String texto;

    public Documento(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    public void showData(){
        System.out.println(texto);
        System.out.println();
    }
}
