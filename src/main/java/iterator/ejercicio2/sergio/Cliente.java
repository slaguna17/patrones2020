package iterator.ejercicio2.sergio;

import java.util.HashMap;
import java.util.Map;

public class Cliente {
    public static void main(String[] args) {

        Empleado e1 = new Empleado("phillip", 944848);
        Empleado e2 = new Empleado("rodolfo",5845895);
        Empleado e3 = new Empleado("juan", 487373);
        Empleado e4 = new Empleado("maria", 5478743);
        Empleado e5 = new Empleado("pedro", 449895);
        Empleado e6 = new Empleado("natalia", 87689 );
        Empleado e7 = new Empleado("bob", 87644);
        Empleado e8 = new Empleado("sergio", 874 );

        Arreglo1 empresa1 = new Arreglo1();
        Lista1 empresa2 = new Lista1();
        Vector1 empresa3 = new Vector1();
        Stack1 empresa4 = new Stack1();

        empresa1.add(e1);
        empresa1.add(e2);

        empresa2.add(e3);
        empresa2.add(e4);

        empresa3.add(e5);
        empresa3.add(e6);
        //repeticion
        empresa3.add(e1);

        empresa4.add(e7);
        empresa4.add(e8);



        Map<String , Empleado> empleadosFinal= new HashMap<String, Empleado>();

        // Iterator General
        Iterator iterator;

        iterator = empresa1.iterator();
        while (iterator.hasNext()){
            Empleado tmp= iterator.next();
            empleadosFinal.put(tmp.getNombre(),tmp);
        }

        iterator = empresa2.iterator();
        while (iterator.hasNext()){
            Empleado tmp=  iterator.next();
            empleadosFinal.put(tmp.getNombre(),tmp);
        }

        iterator = empresa3.iterator();
        while (iterator.hasNext()){
            Empleado tmp=  iterator.next();
            empleadosFinal.put(tmp.getNombre(),tmp);
        }

        iterator = empresa4.iterator();
        while (iterator.hasNext()){
            Empleado tmp=  iterator.next();
            empleadosFinal.put(tmp.getNombre(),tmp);
        }
        for (String key: empleadosFinal.keySet()) {
            System.out.println("Persona Nombre :"+ empleadosFinal.get(key).nombre );
            System.out.println("Persona CI :"+ empleadosFinal.get(key).ci );
        }
    }
}
