package factoryMethod.ejercicios.ej1;
public class Crema {
    String sabor;
    String costo;

    public Crema(String sabor, String costo){
        this.sabor=sabor;
        this.costo=costo;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }
}
