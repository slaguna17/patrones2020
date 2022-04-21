package abstractFactory.ejercicios.ej1.sergio;



public class HeladoCrema implements IHelado {
    private String tamano;
    private String forma;
    private Fruta1 fruta;
    private BaseHelado1 base;
    private Crema1 crema;

    public HeladoCrema(String tamano, String forma, Fruta1 fruta, BaseHelado1 base, Crema1 crema) {
        this.tamano = tamano;
        this.forma = forma;
        this.fruta = fruta;
        this.base = base;
        this.crema = crema;
    }

    @Override
    public void infoHelado() {
        System.out.println("***************************");
        System.out.println("Helado de crema");
        System.out.println("De tamano: " + tamano);
        System.out.println("Con forma: " + forma);
        System.out.println("Con fruta " + fruta.getNombre() + " de tipo: " + fruta.getTipo() + " y precio: " +  fruta.getCosto());
        System.out.println("Con base: " + base.getNombre() + "de forma: " + base.getTipo());
        System.out.println("Con crema de " + crema.getSabor() + " y de costo de " + crema.getCosto());

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

    public Crema1 getCrema() {
        return crema;
    }

    public void setCrema(Crema1 crema) {
        this.crema = crema;
    }
}
