package _parcial1.singleton;

public class Colegio {
    String nombreColegio;
    public Colegio(){

    }

    public void Matricularse(Estudiante estudiante, int pagoMatricula){
        Ventanilla.getInstance().addEstudiante(estudiante,pagoMatricula);
    }

    public void consultarListaEstudiantes(Persona persona){
        if (persona.cargo == "HHRR"){
            Ventanilla.getInstance().consultaDatos();
        }else{
            System.out.println("No tiene permisos de consultar");
        }
    }
}
