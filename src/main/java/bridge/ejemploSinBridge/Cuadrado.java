package bridge.ejemploSinBridge;

public class Cuadrado implements  IFigura {
    @Override
    public void pintarRojo() {
        System.out.println("Pintando Rojo");
        System.out.println("Cuadrado");
    }

    @Override
    public void pintarAmarillo() {
        System.out.println("Pintando Amarillo");
        System.out.println("Cuadrado");
    }

    @Override
    public void pintarVerde() {
        System.out.println("Pintando Verde");
        System.out.println("Cuadrado");
    }

    @Override
    public void pintarAzul() {

    }
}
