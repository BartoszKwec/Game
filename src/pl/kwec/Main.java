package pl.kwec;

import pl.kwec.players.Game;
import pl.kwec.players.PlayerComp;
import pl.kwec.statistics.WinStatistics;

public class Main {

    public static void main(String[] args){
        Game game = new Game(new WinStatistics());
        game.stats.clear();
        game.addPlayer(new PlayerComp("Janusz"));
        game.addPlayer(new PlayerComp("Ziuta"));
        game.printPlayers();

        for (int i=0; i<100; ++i) {
            game.play();
        }

        game.stats.print();
    }
}
