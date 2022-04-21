package decorator.example;

/**
 * @autor : eynar.pari
 * @date : 25/06/2020.
 **/
public class Decorator implements IDE {

    private IDE componente;

    public Decorator (IDE componente){
        this.componente=componente;
    }

    @Override
    public void ejecucionCode() {
        this.componente.ejecucionCode();
    }
}
