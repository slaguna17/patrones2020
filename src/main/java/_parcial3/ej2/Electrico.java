package _parcial3.ej2;

import java.util.Random;

public class Electrico {
    int carga;

    public void cargar(int cantidad) {
        if (cantidad % 2 == 0) {
            this.carga = cantidad;
            System.out.println("nueva carga :"+this.carga);

        } else {
            this.carga = cantidad + 1;
            System.out.println("La cantidad era impar y se le sumo 1 a la cantidad "+this.carga);
            System.out.println("nueva carga :"+this.carga);
        }
    }

    public int estadoDeElectricidad() {
        int random=new Random().nextInt((10 - 1) + 1) + 1;
        System.out.println("estado de la electricidad : "+random);
        return random;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }


}
