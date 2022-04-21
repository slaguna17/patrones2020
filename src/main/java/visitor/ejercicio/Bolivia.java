package visitor.ejercicio;

public class Bolivia implements IPais {
    private Moneda moneda;
    private String simboloMoneda="Bolivianos";

    private double amount=0;

    public Bolivia(){
        moneda= new Moneda(6.97,simboloMoneda);
    }

    @Override
    public double accept(IVisitor visitor,TipoCambio tipoCambio) {
        return visitor.visit(this,tipoCambio);
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
