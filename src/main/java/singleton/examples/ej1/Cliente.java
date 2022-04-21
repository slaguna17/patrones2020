package singleton.examples.ej1;

public class Cliente {

    public static void main (String []args){

        Persona juan= new Persona("juan","upb","upb");
        juan.getNombre();
        juan.setNombre("Juan");

        Persona carlos= new Persona("carlos","upb","upb");
        carlos.getNombre();
        carlos.setNombre("Carlos");

        Persona maria= new Persona("maria","upb","upb");
        maria.getNombre();
        maria.setNombre("Maria");

        Robot robot= new Robot("juan","upb","upb");
        robot.getNombre();
        robot.setNombre("Juan");

        Robot robot1= new Robot("juan","upb","upb");
        robot1.getNombre();
        robot1.setNombre("Juan");
    }

}
