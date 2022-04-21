package _parcial3.ej5;

import java.util.ArrayList;
import java.util.List;

public class Disco extends File {
    private List<Folder> list = new ArrayList<>();
    private int totalPalabras =0;



    public Disco() {
        super(0);
    }

    @Override
    public int totalPalabras() {

        for (Folder componente:list ) {
            totalPalabras = totalPalabras +componente.totalPalabras();
        }
        System.out.println("Unidad de disco :  Palabras Total : " + totalPalabras);
        return totalPalabras;
    }

    @Override
    public void add(File component) {
        System.out.println("No es aplicable");
    }


    public void add(Folder component) {
        list.add(component);

    }

    @Override
    public void remove(File component) {
        System.out.println("No es aplicable");
    }

    @Override
    public void getChild(int position) {
        System.out.println(list.get(position).getPalabras());
    }

    public int getTotalPalabras() {
        return totalPalabras;
    }
}
