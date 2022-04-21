package singleton.basicStructure;

public class Singleton3 {

    private  static Singleton3 instance= null;

    private Singleton3(){
        System.out.println("creating instance Singleton3");
    }

    private synchronized static void makeInstance(){
        if (instance == null)
            instance = new Singleton3();
    }

    public static Singleton3 getInstance(){
        if (instance == null)
            makeInstance();

        return instance;
    }

    public void action1(){
        System.out.println("accion 1 Singleton3");
    }
}
