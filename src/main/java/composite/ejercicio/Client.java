package composite.ejercicio;

/**
 * @autor : eynar.pari
 * @date : 24/06/2020.
 **/
public class Client {
    public static void main (String [] args){
        Computadora pc1 = new Computadora();
        Computadora pc2 = new Computadora();
        Computadora pc3 = new Computadora();
        Computadora pc4 = new Computadora(100);

        pc1.setType("pc1");
        pc2.setType("pc2");
        pc3.setType("pc3");
        pc4.setType("pc4");


        AgrupadorDeObjetosElectronicos laboratorio1 = new AgrupadorDeObjetosElectronicos();
        laboratorio1.setType("Laboratorio 001");
        laboratorio1.add(pc1);
        laboratorio1.add(pc4);
        laboratorio1.add(pc2);
        laboratorio1.add(pc3);

        AgrupadorDeObjetosElectronicos laboratorio2 = new AgrupadorDeObjetosElectronicos();
        laboratorio2.setType("Laboratorio 002");
        laboratorio2.add(pc1);
        laboratorio2.add(pc4);
        laboratorio2.add(pc2);
        laboratorio2.add(pc3);

        AgrupadorDeObjetosElectronicos contenedor1 = new AgrupadorDeObjetosElectronicos();
        contenedor1.setType("contenedor 1");
        contenedor1.add(laboratorio1);
        contenedor1.add(laboratorio2);
        contenedor1.add(pc1);

        contenedor1.totalPrecio();


    }

}
