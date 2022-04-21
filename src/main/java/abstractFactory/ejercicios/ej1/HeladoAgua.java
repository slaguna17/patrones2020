package abstractFactory.ejercicios.ej1;

public class HeladoAgua implements IHelado {


    String tamano;
    String forma;
    Fruta fruta;
    Base base;


    public HeladoAgua() {
    }

    @Override
    public void comprar() {

    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public Fruta getFruta() {
        return fruta;
    }

    public void setFruta(Fruta fruta) {
        this.fruta = fruta;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }
}
