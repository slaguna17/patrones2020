package _parcial1.builder;

public class Lomito extends Builder {

    @Override
    public void buildTipoCarne() {
        this.product.setTipoCarne("lomito");
    }

    @Override
    public void buildRefresco() {
        this.product.setSaborRefresco("pepsi");
    }

    @Override
    public void buildGuarnicion() {
        this.product.setGuarniciones("arroz");
    }
}
