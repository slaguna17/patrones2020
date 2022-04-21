package iterator.basic;

public class Client {
    public static void main (String [] args){
        ConcreteListA listaEmpleadosSistema1= new ConcreteListA();

        listaEmpleadosSistema1.add("juan1");
        listaEmpleadosSistema1.add("juan2");
        listaEmpleadosSistema1.add("juan3");
        listaEmpleadosSistema1.add("juan4");
        listaEmpleadosSistema1.add("juan5");

        ConcreteListB listaEmpleadosSistema2= new ConcreteListB();
        listaEmpleadosSistema2.add("maria1");
        listaEmpleadosSistema2.add("maria2");
        listaEmpleadosSistema2.add("maria3");
        listaEmpleadosSistema2.add("maria4");
        listaEmpleadosSistema2.add("maria5");



        Iterator iterator;
        iterator = listaEmpleadosSistema1.iterator();
        while (iterator.hasNext()){
            System.out.println("Sistema1 > nombre : "+ iterator.next());
        }


        iterator = listaEmpleadosSistema2.iterator();
        while (iterator.hasNext()){
            System.out.println("Sistema2 > nombre : "+ iterator.next());
        }


    }
}
