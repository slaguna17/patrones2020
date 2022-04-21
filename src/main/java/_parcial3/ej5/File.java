package _parcial3.ej5;

public abstract class File {
    private int Palabras;

    public File(int palabras){
        this.Palabras =palabras;
    }

    public int getPalabras() {
        return Palabras;
    }

    public void setPalabras(int palabras) {
        this.Palabras = palabras;
    }

    public abstract  int totalPalabras();
    public abstract  void add(File component);
    public abstract  void remove(File component);
    public abstract  void getChild(int position);
}
