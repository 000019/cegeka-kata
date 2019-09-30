package dis.will.be.epic.sauce;

import com.google.common.base.Preconditions;

import java.util.List;
import java.util.Objects;

public class Game {

    private List<Player> players;
    private Deck deck;

    public Game(List<Player> players, Deck deck) {
        Objects.requireNonNull(players);
        Objects.requireNonNull(deck);
        Preconditions.checkArgument(players.size() > 1);
        Preconditions.checkArgument(players.size() < 5);
        this.players = players;
        this.deck = deck;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public Deck getDeck() {
        return deck;
    }
}
