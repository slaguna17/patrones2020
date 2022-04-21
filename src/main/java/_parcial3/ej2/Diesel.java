package _parcial3.ej2;

import java.util.concurrent.ThreadLocalRandom;

public class Diesel implements IMotos {
    private int combustible;

    public Diesel(int combustible) {
        this.combustible = combustible;
    }

    @Override
    public int estadoCombustible() {
        return ThreadLocalRandom.current().nextInt(1, 100 + 1);
    }

    @Override
    public void cargarCombustible(int carga) {
        if (this.combustible + carga > 100) {
            combustible = 100;
        } else if (carga > 0) {
            combustible += carga;
        }
    }
}