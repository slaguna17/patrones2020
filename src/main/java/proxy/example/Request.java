package proxy.example;

/**
 * @autor : eynar.pari
 * @date : 23/06/2020.
 **/
public class Request {

    private String host;
    private int port;
    private String msg;

    public Request(String host, int port, String msg){
        this.host=host;
        this.port=port;
        this.msg=msg;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
