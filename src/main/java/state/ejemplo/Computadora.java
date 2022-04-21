package state.ejemplo;

public class Computadora {
    // agregar- cumpla patron state
    private IState stateComputadora;

    public Computadora(){
    }

    public IState getStateComputadora() {
        return stateComputadora;
    }

    public void setStateComputadora(IState stateComputadora) {
        this.stateComputadora = stateComputadora;
    }

    // agregar- cumpla patron state
    public void request(){
        stateComputadora.cambioDeEstado();
    }

}
