package strategy.ejercicio;

public class Client {
    public static void main(String []abx){

        Estudiante [] estudiantes = {   new Estudiante("Juan4",8),
                                        new Estudiante("Juan3",6),
                                        new Estudiante("Juan1",1),
                                        new Estudiante("Juan5",10),
                                        new Estudiante("Juan2",2),
                                        new Estudiante("Juan7",50),
                                        new Estudiante("Juan6",20),
                                    };
        Colegio upb = new Colegio();
        upb.setListaEstudiantes(estudiantes);
        upb.setStrategy(new Burbuja());
        upb.execute();
        upb.showEstudiantes();
    }
}
