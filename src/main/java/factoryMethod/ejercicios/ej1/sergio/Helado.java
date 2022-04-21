package factoryMethod.ejercicios.ej1.sergio;

public class Helado implements IHelado{
    private String tamano;
    private String forma;
    private Fruta fruta;
    private BaseHelado base;
    private Crema crema;
    private boolean tieneCrema;

    @Override
    public Helado agua(){
        return new Helado();
    }
    @Override
    public Helado crema(){
        return new Helado();
    }
    @Override
    public Helado mixto(){
        return new Helado();
    }
    public void infoHelado(){
        System.out.println("*******************************");
        System.out.println("tamano: "+tamano);
        System.out.println("forma "+ forma);
        System.out.println("con: "+fruta.getNombre() + " de tipo: " + fruta.getTipo() + " con costo: "+ fruta.getCosto());
        System.out.println("base: "+ base.getNombre() + " en forma de:  "+ base.getTipo());
        if(crema.isConCrema()){
            System.out.println("con crema de "+crema.getSabor()+ "  con costo: " + crema.getCosto());
        }
    }

    public boolean isTieneCrema() {
        return tieneCrema;
    }

    public void setTieneCrema(boolean tieneCrema) {
        this.tieneCrema = tieneCrema;
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

    public BaseHelado getBase() {
        return base;
    }

    public void setBase(BaseHelado base) {
        this.base = base;
    }

    public Crema getCrema() {
        return crema;
    }

    public void setCrema(Crema crema) {
        this.crema = crema;
    }
}
