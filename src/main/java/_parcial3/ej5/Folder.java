package _parcial3.ej5;

import java.util.ArrayList;
import java.util.List;

public class Folder extends File {
    private List<Archivo> list = new ArrayList<>();
    private int totalPalabras =0;

    public Folder(int palabras) {
        super(palabras);
    }

    public Folder() {
        super(0);
    }

    @Override
    public int totalPalabras() {

        for (File componente:list ) {
            totalPalabras = totalPalabras +componente.totalPalabras();
        }
        System.out.println("Folder :  Palabras Total : " + totalPalabras);
        return totalPalabras;
    }

    @Override
    public void add(File component) {
        list.add((Archivo) component);

    }

    @Override
    public void remove(File component) {
        list.remove(component);
    }

    @Override
    public void getChild(int position) {
        System.out.println(list.get(position).getPalabras());
    }

    public int getTotalPalabras() {
        return totalPalabras;
    }
}
