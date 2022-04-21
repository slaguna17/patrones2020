package _parcial3.ej1;

public class PDF {
    private String name;
    private String contenido;
    private int caracteres;

    public PDF(String name, String contenido) {
        this.name = name;
        this.contenido = contenido;
        caracteres = contenido.length();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getCaracteres() {
        return caracteres;
    }

    public void setCaracteres(int caracteres) {
        this.caracteres = caracteres;
    }

}
