package proxy.ejercicio;

/**
 * @autor : eynar.pari
 * @date : 23/06/2020.
 **/
public class Proxy implements Servidor {

    private FileServer primaryServer;
    private FileServer backServer;

    public Proxy(){
        primaryServer= new FileServer();
        backServer= new FileServer();
    }

    @Override
    public void upload(File file) {

        if (file.getExtention().equals("rar") || file.getExtention()==("zip")){
            primaryServer.upload(file);
            backServer.upload(file);
        }else{
            System.out.println("ERROR > el archivo que trata de subir no es permitido : "+file
            .getName()+"."+file.getExtention());
        }

    }

    @Override
    public void download(String name) {
         primaryServer.download(name);
    }
}
