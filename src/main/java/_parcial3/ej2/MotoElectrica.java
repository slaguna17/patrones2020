package _parcial3.ej2;

import java.util.concurrent.ThreadLocalRandom;

public class MotoElectrica {
    int estadoDeBateria;

    public MotoElectrica(int estadoDeBateria) {
        this.estadoDeBateria = estadoDeBateria;
    }

    public int getEstadoDeBateria() {
        return ThreadLocalRandom.current().nextInt(1, 10 + 1);
    }

    public void cargarBateria(int carga) {
        if (this.estadoDeBateria + carga > 100) {
            estadoDeBateria = 100;
        } else {
            estadoDeBateria += carga;
        }
    }
}
