package _parcial2.ej6;

public class Client {
    public static void main(String [] abc){

        IState iniciando = new Iniciando();
        IState encendido = new Encendido();
        IState reiniciar = new Reiniciar();

        Computadora computadora = new Computadora();
        computadora.setStateComputadora(iniciando);
        computadora.request();

        computadora.setStateComputadora(encendido);
        computadora.request();

        computadora.setStateComputadora(reiniciar);
        computadora.request();
    }
}
