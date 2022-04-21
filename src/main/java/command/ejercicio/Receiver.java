package command.ejercicio;

public class Receiver {
    private String attribute1="Default";
    private int attribute2=0;
    private Usuario user;
    private String hora;

    public void reiniciar(){
        System.out.println("COMMAND > RESTART\n  Proceso realizado a las: " + hora + " por: " + user.getNombre());
    }

    public void apagar(){
        System.out.println("COMMAND > SHUT DOWN\n  Proceso realizado a las: " + hora + " por: " + user.getNombre());
    }

    public void suspender(){
        System.out.println("COMMAND > SUSPEND\n  Proceso realizado a las: " + hora + " por: " + user.getNombre());
    }

    public void logOut(){
        System.out.println("COMMAND > LOG OUT\n  Proceso realizado a las: " + hora + " por: " + user.getNombre());

    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public int getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(int attribute2) {
        this.attribute2 = attribute2;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
