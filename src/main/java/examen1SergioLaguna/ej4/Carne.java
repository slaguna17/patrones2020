package examen1SergioLaguna.ej4;

public class Carne {
    String tipoDeCarne;
    String refresco;
    String guarnicion;
    public void showData(){
        System.out.println("corte: " + tipoDeCarne);
        System.out.println("bebida: " + refresco);
        System.out.println("guarnicion: " + guarnicion);
    }

    public String getTipoDeCarne() {
        return tipoDeCarne;
    }

    public void setTipoDeCarne(String tipoDeCarne) {
        this.tipoDeCarne = tipoDeCarne;
    }

    public String getRefresco() {
        return refresco;
    }

    public void setRefresco(String refresco) {
        this.refresco = refresco;
    }

    public String getGuarnicion() {
        return guarnicion;
    }

    public void setGuarnicion(String guarnicion) {
        this.guarnicion = guarnicion;
    }
}
