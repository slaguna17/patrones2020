package factoryMethod.examples.ej1;

public class PasajeAvion implements IPasaje {

    private Avion avion;
    private Lugar origen;
    private Lugar destino;
    private  Pasajero pasajero;
    private String numeroAsiento;
    private String numeroVuelo;
    private String costo;


    @Override
    public void comprar() {

    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Lugar getOrigen() {
        return origen;
    }

    public void setOrigen(Lugar origen) {
        this.origen = origen;
    }

    public Lugar getDestino() {
        return destino;
    }

    public void setDestino(Lugar destino) {
        this.destino = destino;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public String getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(String numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public void showData(){
        System.out.println("*******************************");
        System.out.println("numero de vuelo "+numeroVuelo);
        System.out.println("destino "+destino.getCiudad());
        System.out.println("destino "+destino.getPais());
        System.out.println("origen "+origen.getCiudad());
        System.out.println("origen "+destino.getPais());
        System.out.println("numero de asiento "+numeroAsiento);
        System.out.println("costo "+costo);
        System.out.println("avion marca  "+avion.getMarca());
        System.out.println("avion #asientos "+avion.getNumAsientos());
        System.out.println("nombre pasajero "+ pasajero.getNombre());
        System.out.println("ci pasajer "+ pasajero.getCi());

    }
}
