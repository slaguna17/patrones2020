package singleton.basicStructure;

public class Singleton4 implements Cloneable {

    private  static Singleton4 instance= null;

    private Singleton4(){
        System.out.println("creating instance Singleton3");
    }

    private synchronized static void makeInstance(){
        if (instance == null)
            instance = new Singleton4();
    }

    public static Singleton4 getInstance(){
        if (instance == null)
            makeInstance();

        return instance;
    }

    public void action1(){
        System.out.println("accion 1 Singleton3");
    }

    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
