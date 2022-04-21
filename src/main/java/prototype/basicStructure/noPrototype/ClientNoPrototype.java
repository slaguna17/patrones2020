package prototype.basicStructure.noPrototype;

public class ClientNoPrototype {
    public static void main (String [] arg){
        NoPrototype ejemplo1 = new NoPrototype();
        ejemplo1.setAttributo1("eynar");
        ejemplo1.setAttributo2(50);

        System.out.println("Ejemplo1 : eynar ---> " +ejemplo1.getAttributo1());
        System.out.println("Ejemplo1 : 50 ----> " +ejemplo1.getAttributo2());

        NoPrototype ejemplo2 = new NoPrototype();

        ejemplo2=ejemplo1;
        ejemplo2.setAttributo2(9999);
        ejemplo2.setAttributo1("Ejemplo2");

        System.out.println("Ejemplo1 : eynar --->" +ejemplo1.getAttributo1());
        System.out.println("Ejemplo1 : 50 --->" +ejemplo1.getAttributo2());

        System.out.println("Ejemplo2 : eynar ---> " +ejemplo2.getAttributo1());
        System.out.println("Ejemplo2 : 9999 --->" +ejemplo2.getAttributo2());

    }

}
