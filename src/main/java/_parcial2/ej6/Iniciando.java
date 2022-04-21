package _parcial2.ej6;

public class Iniciando implements IState{
    @Override
    public void cambioDeEstado() {
        System.out.println("Estado: Iniciando, Programas abiertos = 0,  Uso de Recursos > 10%");
    }
}
