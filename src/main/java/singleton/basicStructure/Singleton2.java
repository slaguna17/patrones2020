package singleton.basicStructure;

public class Singleton2 {

    private static final Singleton2 instance= new Singleton2();

    private Singleton2(){
        System.out.println("creating instance Singleton2");
    }

    public static Singleton2 getInstance(){
        return instance;
    }

    public void action1(){
        System.out.println("accion 1 Singleton2");
    }


}
