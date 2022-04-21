package command.basic;

public class Client {
    public static void main (String[]args){
        Receiver receiver = new Receiver();

        CommandConcrete1 commandConcrete1 = new CommandConcrete1(receiver);
        CommandConcrete2 commandConcrete2 = new CommandConcrete2(receiver);

        Invoker invoker = new Invoker();

        // agregando comandos concretos
        invoker.setCommand(commandConcrete1);
        invoker.setCommand(commandConcrete2);
        invoker.setCommand(commandConcrete2);
        invoker.setCommand(commandConcrete2);
        invoker.setCommand(commandConcrete2);
        invoker.setCommand(commandConcrete2);

        // ejecutar todos los comando

        invoker.runCommand();

    }

}
