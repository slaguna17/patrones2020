package singleton.basicStructure;

public class Singleton1 {

    // attribute del mismo tipo de la instancia
    private  static  Singleton1 instance=null;

    // constructor privado
    private Singleton1(){
        System.out.println("creating instance Singleton1");
    }

    // metodo publico estatico (controlar/garantizar) que la instancia sea unica
    public static Singleton1 getInstance(){
        if (instance ==null)
            instance= new Singleton1();

        return instance;
    }

    public void action1(){
        System.out.println("accion 1 Singleton1");
    }

    public void destroySingleton(){
        instance=null;
    }

}
