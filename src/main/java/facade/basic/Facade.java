package facade.basic;

/**
 * @autor : eynar.pari
 * @date : 26/06/2020.
 **/
public class Facade {

    private  ConcreteObjectA concreteObjectA = new ConcreteObjectA();
    private  ConcreteObjectB concreteObjectB = new ConcreteObjectB();
    private  ConcreteObjectC concreteObjectC = new ConcreteObjectC();
    private  ConcreteObjectD concreteObjectD = new ConcreteObjectD();

    public void operation(){
        concreteObjectA.operationA();
        concreteObjectB.operationB();
        concreteObjectC.operationC();
        concreteObjectD.operationD();

    }


}
