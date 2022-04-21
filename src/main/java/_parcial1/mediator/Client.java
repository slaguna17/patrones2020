package _parcial1.mediator;

public class Client {


    public static void main (String [] arg) {
        ChatJuego juegoDota = new ChatJuego();

        Jugador t1 = new Jugador(juegoDota);
        t1.setName("jose");
        t1.setTeam("A");
        Jugador t2 = new Jugador(juegoDota);
        t2.setName("juan");
        t2.setTeam("A");
        Jugador t22 = new Jugador(juegoDota);
        t22.setName("juan1");
        t22.setTeam("A");

        Jugador t23 = new Jugador(juegoDota);
        t23.setName("juan2");
        t23.setTeam("A");

        Jugador t3 = new Jugador(juegoDota);
        t3.setName("maria");
        t3.setTeam("B");
        Jugador t4 = new Jugador(juegoDota);
        t4.setName("maria2");
        t4.setTeam("B");
        Jugador t5 = new Jugador(juegoDota);
        t5.setName("mari3");
        t5.setTeam("B");

        juegoDota.addplayer(t1);
        juegoDota.addplayer(t2);
        juegoDota.addplayer(t3);
        juegoDota.addplayer(t4);
        juegoDota.addplayer(t5);
        juegoDota.addplayer(t22);
        juegoDota.addplayer(t23);

        t1.sendTeam("Hi ALL team");

        t1.sendPlayer("Hola Enemigo",t5);



    }

}
