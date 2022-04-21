package _parcial1.abstractFactory;

public class Client {
    public static void main (String []args){

        FactoryControl.make("combobox").crear();
        FactoryControl.make("checkbox").crear();
        FactoryControl.make("table").crear();
        FactoryControl.make("link").crear();
        FactoryControl.make("textbox").crear();
    }
}

