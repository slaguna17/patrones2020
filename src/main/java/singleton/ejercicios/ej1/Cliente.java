package singleton.ejercicios.ej1;

public class Cliente {
    public static void main (String []args){

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Persona Jose = new Persona("jose");
                Jose.getDinero(100);
            }
        });


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Persona Juan = new Persona("juan");
                Juan.getDinero(200);
            }
        });


        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                Persona Pedro = new Persona("pedro");
                Pedro.getDinero(300);
            }
        });

        thread.start();
        thread1.start();
        thread3.start();


    }
}
