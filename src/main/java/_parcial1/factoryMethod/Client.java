package _parcial1.factoryMethod;


public class Client {

    public static void main (String [] args){

        new CheckBoxCreator().factoryMethodProduct().crear("XL","cuarado");
        new ComboBoxCreator().factoryMethodProduct().crear("XL","cuarado");
        new LinkCreator().factoryMethodProduct().crear("XL","cuarado");
        new TextBoxCreator().factoryMethodProduct().crear("XL","cuarado");
        new TableCreator().factoryMethodProduct().crear("XL","cuarado");
   }
}
