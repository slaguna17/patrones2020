package state.ejemplo;

public class Encendido implements  IState {
    @Override
    public void cambioDeEstado() {
        System.out.println("State Encendido > Memoria 80%");
    }
}
