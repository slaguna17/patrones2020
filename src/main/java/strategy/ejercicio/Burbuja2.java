package strategy.ejercicio;

public class Burbuja2 implements IOrdenamiento {
    @Override
    public Estudiante[] execute(Estudiante[] listEstudiantes) {
        System.out.println("Burbuja2");
        Estudiante[] listEstudiantesOrdenado = null;
        for(int i = 0; i < listEstudiantes.length -1; i++)
        {
            for(int j = 0;j < listEstudiantes.length-i-1;j++)
            {
                if(listEstudiantes[j+1].getPromedio() < listEstudiantes[j].getPromedio() )                {
                    Estudiante auxiliar = listEstudiantes[j+1];
                    listEstudiantes[j+1] = listEstudiantes[j];
                    listEstudiantes[j] = auxiliar;
                }
            }
        }
        listEstudiantesOrdenado = listEstudiantes;

        return listEstudiantesOrdenado;
    }
}
