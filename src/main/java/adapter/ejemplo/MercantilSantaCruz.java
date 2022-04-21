package adapter.ejemplo;

public class MercantilSantaCruz {
    String carnet;
    int saldo;

    public MercantilSantaCruz(String carnet, int saldo){
        this.carnet= carnet;
        this.saldo=saldo;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
