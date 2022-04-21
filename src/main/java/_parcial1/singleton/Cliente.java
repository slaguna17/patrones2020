package _parcial1.singleton;

public class Cliente {

    public static void main(String [] args){
        Colegio upb = new Colegio();

        upb.Matricularse(new Estudiante("Jose","1234"),500 );

        upb.Matricularse(new Estudiante("Maria","2222"),600 );

        upb.Matricularse(new Estudiante("Juan","3333"),700 );

        upb.Matricularse(new Estudiante("Jose","1234"),100 );

        upb.consultarListaEstudiantes(new Persona("Pedro","1111","HHRR"));
    }
}
