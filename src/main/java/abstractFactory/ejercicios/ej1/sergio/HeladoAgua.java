package abstractFactory.ejercicios.ej1.sergio;


public class HeladoAgua implements IHelado {
    private String tamano;
    private String forma;
    private Fruta1 fruta;
    private BaseHelado1 base;

    public HeladoAgua(String tamano, String forma, Fruta1 fruta, BaseHelado1 base) {
        this.tamano = tamano;
        this.forma = forma;
        this.fruta = fruta;
        this.base = base;
    }

    @Override
    public void infoHelado() {
        System.out.println("***************************");
        System.out.println("Helado de agua");
        System.out.println("De tamano: " + tamano);
        System.out.println("Con forma: " + forma);
        System.out.println("Con fruta " + fruta.getNombre() + " de tipo: " + fruta.getTipo() + " y precio: " +  fruta.getCosto());
        System.out.println("Con base: " + base.getNombre() + "de forma: " + base.getTipo());
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

    public Fruta1 getFruta() {
        return fruta;
    }

    public void setFruta(Fruta1 fruta) {
        this.fruta = fruta;
    }

    public BaseHelado1 getBase() {
        return base;
    }

    public void setBase(BaseHelado1 base) {
        this.base = base;
    }
}
