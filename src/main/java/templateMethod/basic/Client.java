package templateMethod.basic;

public class Client {
    public static void main (String [] argsss){
        ConcreteClass1 concreteClass1 = new ConcreteClass1();

        concreteClass1.templateMethod1();
        concreteClass1.templateMethod2();
        concreteClass1.method1();
        concreteClass1.method2();


        ConcreteClass2 concreteClass2 = new ConcreteClass2();

        concreteClass2.templateMethod1();
        concreteClass2.templateMethod2();
        concreteClass2.method1();
        concreteClass2.method2();

    }
}
