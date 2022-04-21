package decorator.basic;

/**
 * @autor : eynar.pari
 * @date : 25/06/2020.
 **/
public class DecoratorConcretoA extends Decorator {
    private String attribute1;
    public DecoratorConcretoA(Componente componente) {
        super(componente);
    }

    public void operation() {
        this.attribute1="agregando nueva funcionalidad";
        super.operation();
        System.out.println("Decorando nueva funcionalidad con DecoratorConcretoA");
    }

}
