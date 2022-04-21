package proxy.example;

/**
 * @autor : eynar.pari
 * @date : 23/06/2020.
 **/
public class Proxy implements IServidor {

    private Server server;
    private Request request;

    public Proxy(){
        server = new Server();
    }

    @Override
    public void request() {
        // condiciones / filtros
        if (request.getPort() == 80){
            this.server.setRequest(this.request);
            this.server.request();
        }else{
            System.out.println("The PORT is incorrect "+request.getPort());

        }

    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }
}
