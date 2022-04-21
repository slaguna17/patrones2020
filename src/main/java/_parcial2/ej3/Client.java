package _parcial2.ej3;

public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        Disparar disparar = new Disparar(receiver);
        Atacar atacar = new Atacar(receiver);
        Defensa defensa = new Defensa(receiver);

        Invoker invoker = new Invoker();

        invoker.setCommand(atacar);
        invoker.setCommand(disparar);
        invoker.setCommand(disparar);
        invoker.setCommand(disparar);
        invoker.setCommand(defensa);


        // ejecutar todos los comando

        invoker.runCommand();
    }
}
