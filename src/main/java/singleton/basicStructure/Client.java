package singleton.basicStructure;

public class Client {

    public static void main (String [] args){

//        Singleton1.getInstance().action1();
//        Singleton1.getInstance().action1();
//        Singleton1.getInstance().action1();
//        Singleton1.getInstance().action1();
//        Singleton1.getInstance().action1();
//        Singleton1.getInstance().destroySingleton();
//        Singleton1.getInstance().action1();
//        Singleton1.getInstance().action1();
//
//
//        Singleton2.getInstance().action1();
//        Singleton2.getInstance().action1();
//        Singleton2.getInstance().action1();
//        Singleton2.getInstance().action1();
//        Singleton2.getInstance().action1();
//        Singleton2.getInstance().action1();

         Thread thread1 = new Thread(new Runnable() {
             @Override
             public void run() {
                 System.out.println("memory3 : "+Singleton3.getInstance().hashCode());
                 Singleton3.getInstance().action1();
             }
         });



        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("memory3 : "+Singleton3.getInstance().hashCode());
                Singleton3.getInstance().action1();
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("memory3 : "+Singleton3.getInstance().hashCode());
                Singleton3.getInstance().action1();
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
