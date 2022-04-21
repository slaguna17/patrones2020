package prototype.basicStructure.ejercicios.ej1;

import prototype.basicStructure.basic.IPrototype;

public class Pasaje implements IPrototype {
    private int nVuelo;
    private String destino;
    private String origen;
    private int horasDeVuelo;
    private int Asiento;
    private String nombreP;
    private int ci;
    private int costo;

    public Pasaje(int nVuelo, String destino, String origen, int horasDeVuelo, int costo) {
        this.nVuelo = nVuelo;
        this.destino = destino;
        this.origen = origen;
        this.horasDeVuelo = horasDeVuelo;
        this.costo = costo;
    }

    public int getnVuelo() {
        return nVuelo;
    }

    public String getDestino() {
        return destino;
    }

    public String getOrigen() {
        return origen;
    }

    public int getHorasDeVuelo() {
        return horasDeVuelo;
    }

    public int getAsiento() {
        return Asiento;
    }

    public String getNombreP() {
        return nombreP;
    }

    public int getCi() {
        return ci;
    }

    public int getCosto() {
        return costo;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public void setAsiento(int Asiento) {
        this.Asiento = Asiento;
    }

    public void setCi(int ci){
        this.ci=ci;
    }
    @Override
    public Object clone(){
        Pasaje pasaje = new Pasaje(nVuelo,destino,origen,horasDeVuelo,costo);
        pasaje.setAsiento(this.Asiento);
        pasaje.setNombreP(this.nombreP);
        pasaje.setCi(this.ci);
        return pasaje;
    }
}
