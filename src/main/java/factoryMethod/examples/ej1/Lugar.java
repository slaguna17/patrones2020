package factoryMethod.examples.ej1;

public class Lugar {
    private String pais;
    private String ciudad;

    public Lugar(String pais, String ciudad){
        this.pais= pais;
        this.ciudad=ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
