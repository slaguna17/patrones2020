package composite.ejercicio;

/**
 * @autor : eynar.pari
 * @date : 24/06/2020.
 **/
abstract class ArtefactosElectronicos {
    private int precio;
    private String type;

    public ArtefactosElectronicos(int precio){
        this.precio =precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract  int totalPrecio();
    public abstract  void add(ArtefactosElectronicos component);
    public abstract  void remove(ArtefactosElectronicos component);
    public abstract  void getChild(int position);

}
