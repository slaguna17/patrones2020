package _parcial2.ej6;

public class Computadora {
    private IState stateComputadora;

    public Computadora(){
    }

    public IState getStateComputadora() {
        return stateComputadora;
    }

    public void setStateComputadora(IState stateComputadora) {
        this.stateComputadora = stateComputadora;
    }


    public void request(){
        stateComputadora.cambioDeEstado();
    }
}
