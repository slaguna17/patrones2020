package adapter.ejercicio;

import java.util.Random;

public class AutomovilGasolinaEspecial implements IAutomoviles {

    int capacidad;

    @Override
    public void llenar(int capacidad) {
        if (capacidad > 0 && capacidad <= 100)
            this.capacidad = capacidad;
        else
            this.capacidad = 100;
        System.out.println("INFO > capacidad : "+this.capacidad);

    }

    @Override
    public int estadoDelCombustible() {
        int random=new Random().nextInt((100 - 1) + 1) + 1;
        System.out.println("INFO > Estado AutomovilGasolinaEspecial : "+random);
        return random;
    }
}
