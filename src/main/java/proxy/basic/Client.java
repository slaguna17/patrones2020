package proxy.basic;

/**
 * @autor : eynar.pari
 * @date : 23/06/2020.
 **/
public class Client {

    public static void main (String []args){
        ISubject proxy= new Proxy(" REAL asdsad");
        proxy.request();
    }


}
