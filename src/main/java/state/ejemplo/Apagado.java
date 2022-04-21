package state.ejemplo;



public class Apagado implements  IState {
    @Override
    public void cambioDeEstado() {
        System.out.println("State  Apagado > Memoria 0%");
    }
}
