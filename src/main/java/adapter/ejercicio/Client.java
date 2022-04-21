package adapter.ejercicio;

public class Client {

    public static void main (String [] args){

        AutomovilElectrico adaptee = new AutomovilElectrico();

        AdapterAutomovilElectrico concreteAdapter= new AdapterAutomovilElectrico(adaptee);

        concreteAdapter.estadoDelCombustible();
        concreteAdapter.llenar(3);

        AutomovilDiesel concreteA= new AutomovilDiesel();
        concreteA.estadoDelCombustible();
        concreteA.llenar(20);

    }


}
