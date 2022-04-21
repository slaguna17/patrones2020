package bridge.ejemploSinBridge;

public class Rectangulo implements  IFigura {
    @Override
    public void pintarRojo() {
        System.out.println("Pintando Rojo");
        System.out.println("Rectangulo");
    }

    @Override
    public void pintarAmarillo() {
        System.out.println("Pintando Amarillo");
        System.out.println("Rectangulo");
    }

    @Override
    public void pintarVerde() {
        System.out.println("Pintando Verde");
        System.out.println("Rectangulo");
    }

    @Override
    public void pintarAzul() {

    }
}
