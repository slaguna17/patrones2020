package iterator.ejercicio.ej1;

import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main (String [] args){
        ListS1 listaEmpleadosSistema1= new ListS1();

        listaEmpleadosSistema1.add(new Persona("juan1111111111111111","1231"));
        listaEmpleadosSistema1.add(new Persona("juan2","1232"));
        listaEmpleadosSistema1.add(new Persona("juan3","1233"));
        listaEmpleadosSistema1.add(new Persona("juan4","1234"));
        listaEmpleadosSistema1.add(new Persona("juan5","1235"));

        ListS2 listaEmpleadosSistema2= new ListS2();
        listaEmpleadosSistema2.add(new Persona("jose1","3336"));
        listaEmpleadosSistema2.add(new Persona("jose2","3337"));
        listaEmpleadosSistema2.add(new Persona("jose3","3338"));
        listaEmpleadosSistema2.add(new Persona("jose4","3339"));
        listaEmpleadosSistema2.add(new Persona("mjose5","3331"));

        ListS3 listaEmpleadosSistema3= new ListS3();
        listaEmpleadosSistema3.add(new Persona("juan1111111111111111","1231"));
        listaEmpleadosSistema3.add(new Persona("maria2","222"));
        listaEmpleadosSistema3.add(new Persona("maria3","223"));
        listaEmpleadosSistema3.add(new Persona("maria4","224"));
        listaEmpleadosSistema3.add(new Persona("maria5","225"));

        Map <String ,Persona> NewSistema= new HashMap<String, Persona>();
        
        // Iterator General
        Iterator iterator;
        
        iterator = listaEmpleadosSistema1.iterator();
        while (iterator.hasNext()){
            Persona tmp= iterator.next();
            NewSistema.put(tmp.getNombre(),tmp);
        }

        iterator = listaEmpleadosSistema2.iterator();
        while (iterator.hasNext()){
            Persona tmp=  iterator.next();
            NewSistema.put(tmp.getNombre(),tmp);
        }

        iterator = listaEmpleadosSistema3.iterator();
        while (iterator.hasNext()){
            Persona tmp=  iterator.next();
            NewSistema.put(tmp.getNombre(),tmp);
        }

        for (String key:NewSistema.keySet()) {
            System.out.println("Persona Nombre :"+ NewSistema.get(key).nombre );
            System.out.println("Persona CI :"+ NewSistema.get(key).ci );
        }
    }
}
