package _parcial1.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatJuego implements Mediator {

    private List<Jugador> team1 = new ArrayList<>();
    private List<Jugador> team2 = new ArrayList<>();

    @Override
    public void sendTeam(String msg, Player player) {
        switch (player.getTeam().toUpperCase()){
            case "A":
                System.out.println(" <Chat Msg> ");
                for (int i = 0; i < team1.size(); i++) {
                    if (team1.get(i).getName() != player.getName())
                        team1.get(i).messageReceived(msg);
                }
                break;
            case "B":
                System.out.println(" <Chat Msg> ");
                for (int i = 0; i < team2.size(); i++) {
                    if (team2.get(i).getName() != player.getName())
                        team2.get(i).messageReceived(msg);
                }
                break;
        }
    }

    @Override
    public void sendPlayer(String msg, Player colleague, Player to) {
         to.messageReceived(msg);
    }


    public void addplayer(Player player) {
        switch (player.getTeam().toUpperCase()){
            case "A":
                team1.add((Jugador) player);
                break;
            case "B":
                team2.add((Jugador) player);
                break;

        }
    }
}
