package templateMethod.ejercicio;

public class Client {

    public static void main(String[] abc){
        Estudiante estudiante= new Estudiante("juan",20);
        Director director= new Director("director",50);
        Docente docente= new Docente("docente",45);

        estudiante.getEdad();
        director.getEdad();
        docente.getEdad();

        estudiante.getTimeNombre();
        director.getTimeNombre();
        docente.getTimeNombre();

        estudiante.showData();
        director.showData();
        docente.showData();


    }
}
