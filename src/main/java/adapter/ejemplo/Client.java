package adapter.ejemplo;

public class Client {

    public static void main (String [] args){

        MercantilSantaCruz mercantilSantaCruz = new MercantilSantaCruz("99999999 CBBA",1000);

        // misma familia
        BCP bcpInternacional = new BCP("6666666 URU",8000);
        Bisa bisaInternacional = new Bisa("6666666 URU",8000);
        Union unionInternacional = new Union("6666666 URU",8000);
        AdaptadorMercantilSantaCruz mercantilSantaCruzInternacional= new AdaptadorMercantilSantaCruz(mercantilSantaCruz);

        System.out.println("Documento Identidad : BCP "+bcpInternacional.getDocumentoIdentidad());
       System.out.println("Documento Identidad : BISA "+bisaInternacional.getDocumentoIdentidad());
       System.out.println("Documento Identidad : UNION "+unionInternacional.getDocumentoIdentidad());
       System.out.println("Documento Identidad : MERCANTIL"+mercantilSantaCruzInternacional.getDocumentoIdentidad());




    }


}
