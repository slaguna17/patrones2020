package ejercicios3_SergioLaguna.ej2;


public class Client {
    public static void main(String[] args) {
        Organizador organizador = new Organizador();

        organizador.criteriaHandler(true,true,true);
        organizador.criteriaHandler(true,false,true);
        organizador.criteriaHandler(false,true,true);
        organizador.criteriaHandler(false,true,false);
    }
}
