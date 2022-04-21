package _parcial1.mediator;

public class Jugador extends Player {

    public Jugador(Mediator mediator) {
        super(mediator);
        this.team ="no team";
    }

    @Override
    public void sendTeam(String msg) {
        mediator.sendTeam("[msg send] "+this.team +" "+this.name+" : "+msg,this);
    }

    @Override
    public void sendPlayer(String msg, Player player) {
        mediator.sendPlayer("[msg send] "+this.team +" "+this.name+" : "+msg,this,player);
    }

    @Override
    public void messageReceived(String msg) {
        System.out.println("[msg received] "+this.team +" "+this.name+" < "+msg);
    }
}
