package factoryMethod.examples.ej1;



public class Client {

    public static void main (String [] args){

        PasajeAvionCreator creator = new PasajeAvionCreator();

        PasajeAvion pasajeAvion1= creator.factoryMethodPasaje();
        PasajeAvion pasajeAvion2= creator.factoryMethodPasaje();
        PasajeAvion pasajeAvion3= creator.factoryMethodPasaje();

        pasajeAvion1.setPasajero(new Pasajero("jose","12312"));
        pasajeAvion1.setNumeroAsiento("2B");

        pasajeAvion2.setPasajero(new Pasajero("juan","1233344412"));
        pasajeAvion2.setNumeroAsiento("3B");

        pasajeAvion3.setPasajero(new Pasajero("pedro","12312"));
        pasajeAvion3.setNumeroAsiento("5B");

        pasajeAvion1.showData();
        pasajeAvion2.showData();
        pasajeAvion3.showData();
    }

}
