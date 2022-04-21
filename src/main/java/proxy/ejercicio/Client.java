package proxy.ejercicio;

/**
 * @autor : eynar.pari
 * @date : 23/06/2020.
 **/
public class Client {

    public static void main (String []args){
        Servidor proxy= new Proxy();

        proxy.upload(new File("mypc1","rar"));
        proxy.upload(new File("mypc2","zip"));
        proxy.upload(new File("mypc3","jpg"));
        proxy.upload(new File("mypc4","pdf"));

        proxy.download("mypc1");

    }


}
