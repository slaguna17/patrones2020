package composite.example;

/**
 * @autor : eynar.pari
 * @date : 24/06/2020.
 **/
abstract class Component {
    private String titulo;
    private int estimation;

    public Component(String titulo){
        this.titulo =titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEstimation() {
        return estimation;
    }

    public void setEstimation(int estimation) {
        this.estimation = estimation;
    }

    public abstract  int totalEstimacion();
    public abstract  void add(Component component);
    public abstract  void remove(Component component);
    public abstract  void getChild(int position);

}
