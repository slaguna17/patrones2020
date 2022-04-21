package _parcial1.builder;

public class Tira extends Builder {


    @Override
    public void buildTipoCarne() {
        this.product.setTipoCarne("tira");
    }

    @Override
    public void buildRefresco() {
        this.product.setSaborRefresco("cocacola");
    }

    @Override
    public void buildGuarnicion() {
        this.product.setGuarniciones("fideo");
    }
}
