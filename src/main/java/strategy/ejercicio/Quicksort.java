package strategy.ejercicio;

public class Quicksort implements IOrdenamiento {
    @Override
    public Estudiante[] execute(Estudiante[] listEstudiantes) {
        Estudiante[] listEstudiantesOrdenado = Quicksort(listEstudiantes, 0, listEstudiantes.length);
        return listEstudiantesOrdenado;
    }

    private Estudiante[] Quicksort(Estudiante listEstudiantes[],int low, int n){
        // todo
       //Logica Ordenamiento
       return null;
    }



}
