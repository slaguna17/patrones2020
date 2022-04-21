package _parcial1.mediator;

public abstract class Player {

    protected Mediator mediator;

    protected String name;
    protected String team;


    public Player(Mediator mediator){
        this.mediator=mediator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public abstract void sendTeam(String msg);
    public abstract void sendPlayer(String msg,Player player);
    public abstract void messageReceived(String msg);

}
