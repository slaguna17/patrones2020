package command.ejercicio;

public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Invoker invoker = new Invoker();
        Usuario usuario = new Usuario("Sergio");
        Usuario usuario2 =new Usuario("Phillip");
        receiver.setUser(usuario);
        receiver.setHora("19:00");

        Apagar apagar = new Apagar(receiver);
        Reiniciar reiniciar = new Reiniciar(receiver);
        LogOut logOut = new LogOut(receiver);
        Suspender suspender = new Suspender(receiver);

        invoker.setCommand(suspender);
        invoker.setCommand(logOut);
        invoker.setCommand(reiniciar);
        invoker.setCommand(apagar);

        invoker.runCommand();
    }
}
