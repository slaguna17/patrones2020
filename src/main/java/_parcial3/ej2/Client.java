package _parcial3.ej2;

public class Client {

    public static void main(String[] args) {

        MotoElectrica motoElectrica = new MotoElectrica(64);

        Diesel autoDiesel = new Diesel(80);
        Gasolina gasolina = new Gasolina(20);
        GasolinaEspecial gasolinaEspecial = new GasolinaEspecial(70);
        AdapterMotoElectrica adapterMotoElectrica = new AdapterMotoElectrica(motoElectrica);

        motoElectrica.cargarBateria(10);
        adapterMotoElectrica.cargarCombustible(20);

        System.out.println("Combustible: Moto a diesel " + autoDiesel.estadoCombustible());
        System.out.println("Combustible: Moto a gasolina " + gasolina.estadoCombustible());
        System.out.println("Combustible: Moto a gasolina especial " + gasolinaEspecial.estadoCombustible());
        System.out.println("Combustible: Moto electrica " + adapterMotoElectrica.estadoCombustible());
    }
}
