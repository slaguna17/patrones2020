package strategy.ejercicio;

public class Colegio {

    private IOrdenamiento strategy;
    private Estudiante []  listaEstudiantes;

    public Colegio(){}

    public void execute(){
        listaEstudiantes=this.strategy.execute(listaEstudiantes);
    }

    public IOrdenamiento getStrategy() {
        return strategy;
    }

    public void setStrategy(IOrdenamiento strategy) {
        this.strategy = strategy;
    }

    public Estudiante[] getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(Estudiante[] listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public void showEstudiantes(){
        for (int i = 0; i < listaEstudiantes.length ; i++) {
            System.out.println("nombre :"+listaEstudiantes[i].nombre+ " promedio :"+listaEstudiantes[i].promedio);
        }
    }
}
