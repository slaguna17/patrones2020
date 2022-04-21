package state.ejemplo;


public class Himbernacion implements  IState {
    @Override
    public void cambioDeEstado() {
        System.out.println("State  Himbernacion > (Memoria 10%)");
    }
}
