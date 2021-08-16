package pl.kwec;

import pl.kwec.players.Player;
import pl.kwec.statistics.Statistics;

public class NullStatistics implements Statistics {
    @Override
    public void andTheWinnerIs(Player player) {}

    @Override
    public void print() {}

    @Override
    public void clear() {}
}
