package composite.ejercicio;

import java.util.ArrayList;
import java.util.List;

/**
 * @autor : eynar.pari
 * @date : 24/06/2020.
 **/
public class AgrupadorDeObjetosElectronicos extends ArtefactosElectronicos {

    private List<ArtefactosElectronicos> list = new ArrayList<>();
    private int totalPrecio =0;

    public AgrupadorDeObjetosElectronicos(int precio) {
        super(precio);
    }

    public AgrupadorDeObjetosElectronicos() {
        super(0);
    }

    @Override
    public int totalPrecio() {

        for (ArtefactosElectronicos componente:list ) {
            totalPrecio = totalPrecio +componente.totalPrecio();
        }
        System.out.println("Componente : ["+ getType()+"] Estimacion Total : [" + totalPrecio +"]");
        return totalPrecio;
    }

    @Override
    public void add(ArtefactosElectronicos component) {
        list.add(component);

    }

    @Override
    public void remove(ArtefactosElectronicos component) {
        list.remove(component);
    }

    @Override
    public void getChild(int position) {
        System.out.println(list.get(position).getPrecio());
    }
}
