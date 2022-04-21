package composite.ejercicio;

/**
 * @autor : eynar.pari
 * @date : 24/06/2020.
 **/
public class Computadora extends ArtefactosElectronicos {


    public Computadora() {
        super(100);
    }

    public Computadora(int precio) {
        super(precio);
    }
    @Override
    public int totalPrecio() {
        System.out.println("Componente : ["+ getType()+"] Precio Total : [" + getPrecio()+"]");
        return this.getPrecio();
    }

    @Override
    public void add(ArtefactosElectronicos component) {
        System.out.println("Not Applicable");
    }

    @Override
    public void remove(ArtefactosElectronicos component) {
        System.out.println("Not Applicable");
    }

    @Override
    public void getChild(int position) {
        System.out.println("Not Applicable");
    }
}
