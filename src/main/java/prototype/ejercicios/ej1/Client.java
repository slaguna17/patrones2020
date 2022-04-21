package prototype.ejercicios.ej1;

public class Client {

    public static void main (String []args){
        PasajeAvion pasaje1= new PasajeAvion();
        pasaje1.setOrigen("LPZ");
        pasaje1.setDestino("CBBA");
        pasaje1.setNumeroVuelo("10");
        pasaje1.setHorasDeVuelo("5h");
        pasaje1.setNumeroAsiento("32A");
        pasaje1.setCosto("500bs");
        pasaje1.setPersona(new Persona("juan","123456"));

        PasajeAvion pasaje2= (PasajeAvion) pasaje1.clone();
        pasaje2.setNumeroAsiento("33B");
        pasaje2.setPersona(new Persona("jose","33333"));

        PasajeAvion pasaje3= (PasajeAvion) pasaje1.clone();
        pasaje3.setNumeroAsiento("34B");
        pasaje3.setPersona(new Persona("eynar","44444"));

        PasajeAvion pasaje4= (PasajeAvion) pasaje1.clone();
        pasaje4.setNumeroAsiento("35B");
        pasaje4.setPersona(new Persona("rafael","5555"));

        PasajeAvion pasaje5= (PasajeAvion) pasaje1.clone();
        pasaje5.setNumeroAsiento("36B");
        pasaje5.setPersona(new Persona("joss","6666"));

        pasaje1.showData();
        pasaje2.showData();
        pasaje3.showData();
        pasaje4.showData();
        pasaje5.showData();
    }
}
