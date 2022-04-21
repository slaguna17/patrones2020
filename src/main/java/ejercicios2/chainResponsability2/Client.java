package ejercicios2.chainResponsability2;

public class Client {

    public static void main (String [] args){

        Organizador organizador = new Organizador();

        organizador.criteriaHandler(Orden.DESBLOQUEOS);
        organizador.criteriaHandler(Orden.DISCIPLINA);
        organizador.criteriaHandler(Orden.ENTREVISA);
        organizador.criteriaHandler(Orden.LIMPIEZA);
        organizador.criteriaHandler(Orden.MANIFIESTACIONES);

    }
}
