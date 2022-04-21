package templateMethod.basic;

public abstract class AbstractClass {

    abstract  void method1();
    abstract  void method2();

    public void templateMethod1(){
        System.out.println("AbstractClass templateMethod1");
    }

    //  no se sobre escribe en clases hijas
    public final void templateMethod2(){
        System.out.println(" AbstractClass templateMethod2");
    }
}
