package prototype.ejercicios.ej1;

// equivalente ConcretePrototype
public class PasajeAvion implements IPasaje {

    private String numeroVuelo;
    private String destino;
    private String origen;
    private String horasDeVuelo;
    private String numeroAsiento;
    private String costo;
    private Persona persona;


    @Override
    public Object clone() {
       PasajeAvion objClone= new PasajeAvion();
       objClone.setCosto(this.costo);
       objClone.setDestino(this.destino);
       objClone.setHorasDeVuelo(this.horasDeVuelo);
       objClone.setNumeroAsiento(this.numeroAsiento);
       objClone.setNumeroVuelo(this.numeroVuelo);
       objClone.setPersona(this.persona);
       objClone.setOrigen(this.origen);
       return objClone;
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getHorasDeVuelo() {
        return horasDeVuelo;
    }

    public void setHorasDeVuelo(String horasDeVuelo) {
        this.horasDeVuelo = horasDeVuelo;
    }

    public String getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(String numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }


    public void showData(){
        System.out.println("*******************************");
        System.out.println("numero de vuelo "+numeroVuelo);
        System.out.println("destino "+destino);
        System.out.println("origen "+origen);
        System.out.println("horas de vuelo "+horasDeVuelo);
        System.out.println("numero de asiento "+numeroAsiento);
        System.out.println("costo "+costo);
        System.out.println("nombre persona "+ persona.getNombre());
        System.out.println("ci persona "+ persona.getCi());

    }
}
