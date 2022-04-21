package visitor.ejercicio;

public class Moneda {

    private double tipoDeCambio;
    private String simbolo;


    public Moneda (double tipoDeCambio,String simbolo){
        this.tipoDeCambio=tipoDeCambio;
        this.simbolo=simbolo;
    }

    public double cambiarMonedaLocalaDolar(double cantidadMonedaLocal){
        return cantidadMonedaLocal/tipoDeCambio;
    }

    public double cambiarDolaraMonedaLocal(double cantidadEnDolar){
        return cantidadEnDolar*tipoDeCambio;
    }

    public double getTipoDeCambio() {
        return tipoDeCambio;
    }

    public void setTipoDeCambio(double tipoDeCambio) {
        this.tipoDeCambio = tipoDeCambio;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }
}
