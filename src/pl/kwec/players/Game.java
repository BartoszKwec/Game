package pl.kwec.players;

import pl.kwec.NullStatistics;
import pl.kwec.players.Player;
import pl.kwec.statistics.Statistics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
    private List<Player> players = new ArrayList();
    private Random r = new Random();
    public final Statistics stats;

    public Game() {
        this(null);
    }

    public Game(Statistics stats) {
        if (stats != null) {
            this.stats = stats;
        } else {
            this.stats = new NullStatistics();
        }
    }

    public void addPlayer(Player player){
        if (!nameExists(player.getName())) {
            players.add(player);
        } else {
            player.setName(player.getName() + r.nextInt(10));
            addPlayer(player);
        }
    }

    private boolean nameExists(String name){
        for (Player player : players) {
            if (player.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void play(){
        int computer, playerNumber;
        boolean repeat;

        do {
            repeat=true;
            System.out.println("---------------------");
            computer=r.nextInt(6)+1;
            System.out.println("Komputer: "+computer);

            for(Player player : players){
                playerNumber=player.draw();
                System.out.println("Gracz "+player.getName()+": "+playerNumber);
                if(playerNumber != computer) {
                    System.out.println("Pudło!");

                }
                else {
                    System.out.println("Udało się!");
                    repeat=false;
                    stats.andTheWinnerIs(player);
                }
            }

        }while(repeat);

    }
    public void printPlayers() {
        System.out.println("### PLAYERS ###");
        for (Player player : players) {
            System.out.println(player.getName());
        }
    }
    public void removePlayer(String name) {
        players.removeIf( (Player player) -> player.getName().equals(name) );
    }
}
