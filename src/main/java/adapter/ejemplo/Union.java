package adapter.ejemplo;

public class Union implements IPayPal {
    String documentoIdentidad;
    int monto;

    public Union(String documentoIdentidad, int monto){
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
