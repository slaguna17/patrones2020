package decorator.basic;

/**
 * @autor : eynar.pari
 * @date : 25/06/2020.
 **/
public class DecoratorConcretoB extends Decorator {
    private String attribute1;
    public DecoratorConcretoB(Componente componente) {
        super(componente);
    }

    public void operation() {
        this.attribute1="agregando nueva funcionalidad 2";
        super.operation();
        System.out.println("Decorando nueva funcionalidad con DecoratorConcretoB");
    }

}
