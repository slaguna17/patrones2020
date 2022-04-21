package state.ejercicio;

public class MaquinaDispensadora {
    // agregar- cumpla patron state
    private IState state;
    private int precioProduct = 100;
    private  int dineroIntroducido;

    public MaquinaDispensadora(){
    }

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }

    // agregar- cumpla patron state
    public void request(){
        state.handle();
    }


    public int getPrecioProduct() {
        return precioProduct;
    }

    public void setPrecioProduct(int precioProduct) {
        this.precioProduct = precioProduct;
    }

    public int getDineroIntroducido() {
        return dineroIntroducido;
    }

    public void setDineroIntroducido(int dineroIntroducido) {
        this.dineroIntroducido = dineroIntroducido;
    }
}
