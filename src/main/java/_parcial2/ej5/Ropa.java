package _parcial2.ej5;

public class Ropa {
    private IStrategy strategy;
    private String tipo;
    private int precio;

    public Ropa(){}

    public void execute(){
        this.strategy.execute(precio, this);
    }

    public IStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
