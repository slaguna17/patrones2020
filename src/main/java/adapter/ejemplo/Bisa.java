package adapter.ejemplo;

public class Bisa implements IPayPal {
    String documentoIdentidad;
    int monto;

    public Bisa(String documentoIdentidad, int monto){
        this.documentoIdentidad=documentoIdentidad;
        this.monto=monto;
    }


    @Override
    public int getMonto() {
        return this.monto;
    }

    @Override
    public String getDocumentoIdentidad() {
        return this.documentoIdentidad;
    }
}
