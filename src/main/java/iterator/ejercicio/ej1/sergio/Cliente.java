package iterator.ejercicio.ej1.sergio;

public class Cliente {
    public static void main(String[] args) {
        Arreglo empleados1 = new Arreglo();
        Lista empleados2 = new Lista();
        Vector empleados3 = new Vector();
        Persona p1 = new Persona("juan", 11111);
        Persona p2 = new Persona("pedro", 23333);
        Persona p3 = new Persona("ignacio", 444444);
        Persona p4 = new Persona("natalia", 2666666);
        Persona p5 = new Persona("maria", 8888888);
        empleados1.add(p1);
        empleados1.add(p2);
        empleados1.add(p3);
        empleados1.add(p4);
        empleados1.add(p5);

        empleados2.add(p1);
        empleados2.add(p2);
        empleados2.add(p3);
        empleados2.add(p4);
        empleados2.add(p5);


        empleados3.add(p1);
        empleados3.add(p2);
        empleados3.add(p3);
        empleados3.add(p4);
        empleados3.add(p5);

        Iterator iterator;
        iterator = empleados1.iterator();
        while (iterator.hasNext()){
            System.out.println("Sistema1 > nombre : "+ iterator.next());
        }

// l
        iterator = empleados2.iterator();
        while (iterator.hasNext()){
           System.out.println("Sistema2 > nombre : "+ iterator.next());
        }

        iterator = empleados3.iterator();
        while (iterator.hasNext()){
            System.out.println("Sistema3 > nombre : "+ iterator.next());
        }
    }
}
