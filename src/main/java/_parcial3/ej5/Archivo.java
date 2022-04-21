package _parcial3.ej5;

public class Archivo extends File {
    public Archivo() {
        super(0);
    }

    public Archivo(int palabras) {
        super(palabras);
    }
    @Override
    public int totalPalabras() {
        System.out.println("Archivo :  Palabras Totales : " + getPalabras()+"");
        return this.getPalabras();
    }

    @Override
    public void add(File component) {
        System.out.println("No es aplicable");
    }

    @Override
    public void remove(File component) {
        System.out.println("No es aplicable");
    }

    @Override
    public void getChild(int position) {
        System.out.println("No es aplicable");
    }
}
