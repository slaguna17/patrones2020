package ejercicios2.memento2;

public class Documento {
    private String texto;


    public Documento(String texto){
        this.texto=texto;

    }

    public void showData(){
        System.out.println("texto : "+this.texto);
   }

    public String gettexto() {
        return texto;
    }

    public void settexto(String texto) {
        this.texto = texto;
    }


}
