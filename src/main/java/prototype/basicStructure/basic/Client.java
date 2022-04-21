package prototype.basicStructure.basic;

public class Client {

    public static void main (String [] args){

        ConcretePrototype ejemplo1 = new ConcretePrototype();
        ejemplo1.setAttributo1("eynar");
        ejemplo1.setAttributo2(50);

        System.out.println("Ejemplo1 : eynar ---> " +ejemplo1.getAttributo1());
        System.out.println("Ejemplo1 : 50 ----> " +ejemplo1.getAttributo2());

        ConcretePrototype ejemplo2= (ConcretePrototype) ejemplo1.clone();

        ejemplo2.setAttributo2(9999);
        ejemplo2.setAttributo1("Ejemplo2");

        System.out.println("Ejemplo1 : eynar --->" +ejemplo1.getAttributo1());
        System.out.println("Ejemplo1 : 50 --->" +ejemplo1.getAttributo2());

        System.out.println("Ejemplo2 : Ejemplo2 ---> " +ejemplo2.getAttributo1());
        System.out.println("Ejemplo2 : 9999 --->" +ejemplo2.getAttributo2());
    }

}
