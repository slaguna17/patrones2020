package decorator.basic;

/**
 * @autor : eynar.pari
 * @date : 25/06/2020.
 **/
public class ComponentConcrete implements Componente {
    @Override
    public void operation() {
        System.out.println("INFO  >  ComponentConcrete  ejecucion de su operacion original");
    }
}
