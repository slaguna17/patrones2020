package state.ejercicio;

public class MontoSuperior implements IState {
    @Override
    public void handle() {
        System.out.println("State > MontoSuperior");
    }
}
