package bridge.ejemploConBridge;

public class Triangulo implements Figura {

    Color color;

    @Override
    public void pintar(Color color) {

            System.out.println("Objeto Triangulo");
        this.color = color;
        this.color.pintando();
    }
}
