package _parcial2.ej6;

public class Reiniciar implements IState {
    @Override
    public void cambioDeEstado() {
        System.out.println("Estado: Reiniciando, Programas abiertos = 0 (cerrandose), Uso de Recursos  0%)");
    }
}
