package _parcial1.mediator;

public interface Mediator {
    void sendTeam(String msg, Player colleague);
    void sendPlayer(String msg, Player colleague, Player to);
}
