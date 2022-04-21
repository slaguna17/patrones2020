package ejercicios1.singleton;

public class Client {

    public static void main(String []args){
        Colegio colegioSimonBolivar = new Colegio();
        colegioSimonBolivar.setCajero(new Cajero("Jose001","Jose Perez"));

        colegioSimonBolivar.pagarMatricula(50,new Estudiante("001","Juan1"));
        colegioSimonBolivar.pagarMatricula(50,new Estudiante("002","Juan2"));
        colegioSimonBolivar.pagarMatricula(50,new Estudiante("003","Juan3"));
        colegioSimonBolivar.pagarMatricula(50,new Estudiante("004","Juan4"));
        colegioSimonBolivar.pagarMatricula(50,new Estudiante("005","Juan5"));
    }
}
