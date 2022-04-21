package decorator.basic;

/**
 * @autor : eynar.pari
 * @date : 25/06/2020.
 **/
public class Decorator implements Componente {

    private Componente componente;

    public Decorator (Componente componente){
        this.componente=componente;
    }

    @Override
    public void operation() {
        this.componente.operation();
    }
}
