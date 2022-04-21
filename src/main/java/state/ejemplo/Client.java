package state.ejemplo;

public class Client {
    public static void main(String [] abc){

        IState apagar = new Apagado();
        IState encendido = new Encendido();
        IState himbernacion = new Himbernacion();

        Computadora computadora = new Computadora();
        computadora.setStateComputadora(apagar);
        computadora.request();

        computadora.setStateComputadora(encendido);
        computadora.request();

        computadora.setStateComputadora(himbernacion);
        computadora.request();
    }

}
