package examen1SergioLaguna.ej5;

public abstract class Equipo {
    protected Mediator mediator;

    protected String name;
    protected String role;


    public Equipo(Mediator mediator){
        this.mediator=mediator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public abstract void send(String msg);
    public abstract void messageReceived(String msg);
}
