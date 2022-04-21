package decorator.example;

/**
 * @autor : eynar.pari
 * @date : 25/06/2020.
 **/
public class Library extends Decorator {
    public Library(IDE componente) {
        super(componente);
    }

    public void ejecucionCode() {

        super.ejecucionCode();
        System.out.println("Utilizando Library");
    }

}
