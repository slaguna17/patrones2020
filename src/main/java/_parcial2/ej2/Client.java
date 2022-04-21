package _parcial2.ej2;

public class Client {
    public static void main(String[] args) {
        Organizador organizador = new Organizador();

        //posibles solicitudes: infraestructura, revision, nuevaFuncion, dinero, otros

        organizador.criteriaHandler("infraestructura");
        organizador.criteriaHandler("revision");
        organizador.criteriaHandler("nuevaFuncion");
        organizador.criteriaHandler("dinero");
        organizador.criteriaHandler("otros");
        organizador.criteriaHandler("A");

    }
}
