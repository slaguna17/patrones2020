package _parcial1.builder;

public class Parrilla {
    private String tipoCarne;
    private String saborRefresco;
    private String guarniciones;


    public Parrilla(){

    }

    public String getTipoCarne() {
        return tipoCarne;
    }

    public void setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
    }

    public String getSaborRefresco() {
        return saborRefresco;
    }

    public void setSaborRefresco(String saborRefresco) {
        this.saborRefresco = saborRefresco;
    }

    public String getGuarniciones() {
        return guarniciones;
    }

    public void setGuarniciones(String guarniciones) {
        this.guarniciones = guarniciones;
    }

    public void showData(){
        System.out.println("tipo carne "+tipoCarne);
        System.out.println("sabor refresco "+saborRefresco);
        System.out.println("giuarnicion" + guarniciones);
    }
}
