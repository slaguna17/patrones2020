package visitor.ejercicio;

public class Argentina implements IPais {
    private Moneda moneda;
    private String simboloMoneda="Pesos Argentinos";
    private double amount=0;


    // implementando patron visitor

    public Argentina(){
        moneda= new Moneda(69.62,simboloMoneda);
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
