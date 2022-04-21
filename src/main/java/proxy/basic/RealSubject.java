package proxy.basic;

/**
 * @autor : eynar.pari
 * @date : 23/06/2020.
 **/
public class RealSubject implements  ISubject {

    private String attribute1;
    private int attribute2;

    public RealSubject (String attribute1){
        this.attribute1=attribute1;

    }

    @Override
    public void request() {
        System.out.println("INFO> RealSubject : "+ this.attribute1);
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }
}
