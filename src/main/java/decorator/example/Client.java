package decorator.example;

/**
 * @autor : eynar.pari
 * @date : 25/06/2020.
 **/
public class Client {

    public static void main (String [] sada){
        IDE eclipseV1 = new Eclipse();
        IDE intelliJ = new IntelliJIdea("community");

        System.out.println("--------------------------------");

        eclipseV1.ejecucionCode();
        intelliJ.ejecucionCode();

        System.out.println("--------------------------------");

        intelliJ= new Library(intelliJ);
        intelliJ= new Tools(intelliJ);
        intelliJ = new Plugins(intelliJ);

        eclipseV1 = new Library(eclipseV1);

        eclipseV1.ejecucionCode();
        intelliJ.ejecucionCode();



    }

}
