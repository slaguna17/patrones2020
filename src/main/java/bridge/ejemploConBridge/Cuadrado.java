package bridge.ejemploConBridge;

public class Cuadrado implements Figura {

    Color color;

    @Override
    public void pintar(Color color) {
        System.out.println("Objeto cuadrado");
        this.color = color;
        this.color.pintando();

    }
}
