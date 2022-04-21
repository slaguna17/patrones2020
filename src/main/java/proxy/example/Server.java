package proxy.example;

/**
 * @autor : eynar.pari
 * @date : 23/06/2020.
 **/
public class Server implements IServidor {

   private Request request;

    public Server(){
    }

    @Override
    public void request() {
        System.out.println("INFO> peticion recibida");
        System.out.println("INFO> RealSubject :host  "+ this.request.getHost());
        System.out.println("INFO> RealSubject :port  "+ this.request.getPort());
        System.out.println("INFO> RealSubject :msg  "+ this.request.getMsg());
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }
}
