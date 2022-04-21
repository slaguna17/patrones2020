package factoryMethod.ejercicios.ej1;

public class Fruta {

    String tipoFruta;
    String nombre;
    String costo;

    public Fruta(String tipoFruta, String nombre, String costo){
        this.tipoFruta=tipoFruta;
        this.nombre= nombre;
        this.costo=costo;
    }

    public String getTipoFruta() {
        return tipoFruta;
    }

    public void setTipoFruta(String tipoFruta) {
        this.tipoFruta = tipoFruta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }
}
