package proxy.basic;

/**
 * @autor : eynar.pari
 * @date : 23/06/2020.
 **/
public class Proxy implements  ISubject {

    private RealSubject realSubject;
    private String attrib;

    public Proxy(String attribute1){
        this.attrib=attribute1;
        realSubject = new RealSubject(this.attrib);
    }

    @Override
    public void request() {
        if (this.attrib.contains("REAL")){

            this.realSubject.request();;

        }else{

            System.out.println("Datos no compatibles");
        }
    }
}
