package bridge.ejemploConBridge;


public class Client {
    public static void main (String [] args){

        Rojo rojo = new Rojo();
        Azul azul = new Azul();
        Cuadrado cuadrado= new Cuadrado();
        cuadrado.pintar(azul);


    }
}
