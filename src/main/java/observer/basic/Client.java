package observer.basic;

public class Client {

    public static void main (String [] argsss){
        ConcreteSubject object = new ConcreteSubject();

        ObservadorConcrete1 upb1 = new ObservadorConcrete1();
        ObservadorConcrete1 upb2 = new ObservadorConcrete1();
        ObservadorConcrete2 upb3 = new ObservadorConcrete2();
        ObservadorConcrete2 upb4 = new ObservadorConcrete2();

        object.attach(upb1);
        object.attach(upb2);
        object.attach(upb3);
        object.attach(upb4);

        object.setAttribute1("seteando attributo 1");

    }
}
