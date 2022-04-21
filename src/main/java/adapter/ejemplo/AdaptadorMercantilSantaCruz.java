package adapter.ejemplo;

public class AdaptadorMercantilSantaCruz implements IPayPal {
    // caracteristica
    private MercantilSantaCruz adaptee;

    public AdaptadorMercantilSantaCruz(MercantilSantaCruz adaptee){
        this.adaptee= adaptee;
    }


    @Override
    public int getMonto() {
       return this.adaptee.getSaldo();
    }

    @Override
    public String getDocumentoIdentidad() {
        return this.adaptee.getCarnet();
    }
}
