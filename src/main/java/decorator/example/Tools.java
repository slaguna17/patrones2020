package decorator.example;

/**
 * @autor : eynar.pari
 * @date : 25/06/2020.
 **/
public class Tools extends Decorator {
    public Tools(IDE componente) {
        super(componente);
    }

    public void ejecucionCode() {
        super.ejecucionCode();
        System.out.println("Utilizando Tools");
    }

}
