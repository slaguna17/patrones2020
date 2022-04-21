package bridge.ejemploConBridge;

public class Rectangulo implements Figura {

    Color color;

    @Override
    public void pintar(Color color) {
        System.out.println("Objeto Rectangulo");
        this.color = color;
        this.color.pintando();
    }
}
