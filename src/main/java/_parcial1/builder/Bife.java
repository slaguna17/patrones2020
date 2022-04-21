package _parcial1.builder;

public class Bife extends Builder {


    @Override
    public void buildTipoCarne() {
        this.product.setTipoCarne("bife");
    }

    @Override
    public void buildRefresco() {
        this.product.setSaborRefresco("cocacola");
    }

    @Override
    public void buildGuarnicion() {
        this.product.setGuarniciones("papasfritas");
    }
}
