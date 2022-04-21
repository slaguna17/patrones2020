package prototype.basicStructure.ejercicios.ej1;

public class Cliente {
    public static void main(String[] args) {
        int vuelo = 20;
        String destino = "MIA";
        String origen ="LP";
        int horas =4;
        int costo = 800;
        Pasaje p1 = new Pasaje(vuelo,destino,origen,horas,costo);
        p1.setNombreP("Eduardo");
        p1.setAsiento(990);
        p1.setCi(456789);

        Pasaje p2 = (Pasaje) p1.clone();
        p2.setNombreP("Jose");
        p2.setCi(565485);
        p2.setAsiento(3);

        Pasaje p3 = (Pasaje) p1.clone();
        p3.setNombreP("Maria");
        p3.setAsiento(55);
        p3.setCi(6758675);

        Pasaje p4 = (Pasaje) p1.clone();
        p4.setNombreP("Sergio");
        p4.setAsiento(17);
        p4.setCi(57496875);

        Pasaje p5 = (Pasaje) p1.clone();
        p5.setNombreP("Carlos");
        p5.setAsiento(66);
        p5.setCi(897549589);

        System.out.println("Informacion del vuelo: Vuelo:" + vuelo + " origen: " + origen + " destino: " + destino + " horas de vuelo: " + horas + " con un costo de: " + costo) ;
        System.out.println("Pasaje1 cliente: "+p1.getNombreP() + " con ci : " + p1.getCi() + " numero de asiento: "+ p1.getAsiento() ) ;
        System.out.println("Pasaje2 cliente: "+p2.getNombreP() + " con ci " + p2.getCi() + " numero de asiento: "+ p2.getAsiento() ) ;
        System.out.println("Pasaje3 cliente: "+p3.getNombreP() + " con ci " + p3.getCi() + " numero de asiento: "+ p3.getAsiento() ) ;
        System.out.println("Pasaje4 cliente: "+p4.getNombreP() + " con ci " + p4.getCi() + " numero de asiento: "+ p4.getAsiento() ) ;
        System.out.println("Pasaje5 cliente: "+p5.getNombreP() + " con ci " + p5.getCi() + " numero de asiento: "+ p5.getAsiento() ) ;

    }
}
