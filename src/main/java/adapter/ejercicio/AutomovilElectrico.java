package adapter.ejercicio;

import java.util.Random;

public class AutomovilElectrico {
    int carga;

    public AutomovilElectrico() {

    }

    public void cargar(int cantidad) {
        if (cantidad % 2 == 0) {
            this.carga = cantidad;
            System.out.println("INFO > cantidad cargada :"+this.carga);

        } else {
            this.carga = cantidad + 1;
            System.out.println("La cantidad a cargar era impar :"+cantidad+ " ,  se sumo 1 a la cantidad "+this.carga);
            System.out.println("INFO > cantidad cargada :"+this.carga);
        }
    }

    public int estadoDeElectricidad() {
        int random=new Random().nextInt((10 - 1) + 1) + 1;
        System.out.println("INFO > Estado De Electricidad Auto Electrico : "+random);
        return random;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }


}
