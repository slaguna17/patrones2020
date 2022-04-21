package _parcial2.ej6;

import java.util.Random;

public class Encendido implements IState{
    Random r = new Random();
    int programas = r.nextInt(21);
    @Override
    public void cambioDeEstado() {
        System.out.println("Estado: Encendido, Programas abiertos ="+programas+" , Uso de recursos"+programas*5+"%");
    }
}
