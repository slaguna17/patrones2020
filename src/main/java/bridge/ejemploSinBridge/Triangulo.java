package bridge.ejemploSinBridge;

public class Triangulo implements  IFigura {
    @Override
    public void pintarRojo() {
        System.out.println("Pintando Rojo");
        System.out.println("Triangulo");
    }

    @Override
    public void pintarAmarillo() {
        System.out.println("Pintando Amarillo");
        System.out.println("Triangulo");
    }

    @Override
    public void pintarVerde() {
        System.out.println("Pintando Verde");
        System.out.println("Triangulo");
    }

    @Override
    public void pintarAzul() {

    }
}
