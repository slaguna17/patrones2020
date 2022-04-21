package factoryMethod.examples.ej1;

public class PasajeAvionCreator extends Creator {

    @Override
    public PasajeAvion factoryMethodPasaje() {
        PasajeAvion pasajeAvion = new PasajeAvion();
        Avion avion= new Avion("B44","100");

        pasajeAvion.setAvion(avion);
        pasajeAvion.setCosto("50");

        Lugar destino= new Lugar("BOL","LP");
        Lugar origen= new Lugar("BOL","CBBA");

        pasajeAvion.setDestino(destino);
        pasajeAvion.setNumeroAsiento("0");
        pasajeAvion.setNumeroVuelo("20");
        pasajeAvion.setOrigen(origen);
        pasajeAvion.setPasajero(new Pasajero("",""));

        return pasajeAvion;
    }
}
