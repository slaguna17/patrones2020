package chainOfResponsability.example;

import singleton.basicStructure.Singleton3;

public class Client {

    public static void main(String []argss){

        Banco bnb=  new Banco();


        Thread laPaz = new Thread(new Runnable() {
            @Override
            public void run() {
                bnb.prestamo(new Persona("juan1","123",5));
            }
        });

        Thread cbba = new Thread(new Runnable() {
            @Override
            public void run() {
                bnb.prestamo(new Persona("juan2","345",15));
            }
        });

        Thread staCruz = new Thread(new Runnable() {
            @Override
            public void run() {
                bnb.prestamo(new Persona("juan3","1233",25));
            }
        });

        Thread oruro = new Thread(new Runnable() {
            @Override
            public void run() {
                bnb.prestamo(new Persona("juan4","35435",75));
            }
        });

        Thread tarija = new Thread(new Runnable() {
            @Override
            public void run() {
                bnb.prestamo(new Persona("juan5","1235",-50));
            }
        });

        laPaz.start();
        cbba.start();
        staCruz.start();
        tarija.start();
        oruro.start();
    }
}
