package _parcial2.ej4;

public class Client {
    public static void main(String[] args) {
        Telefonica telefonica = new Telefonica();
        User user = new User(new Persona("Sergio"),"PRECIOS");
        User user2 = new User(new Persona("Sergio4"),"PROMOCIONES");
        User user3 = new User(new Persona("Sergio2"),"PREMIOS");
        User user4= new User(new Persona("Sergio3"),"AnyCategory");

        telefonica.attach(user);
        telefonica.attach(user2);
        telefonica.attach(user3);
        telefonica.attach(user4);
    }
}
