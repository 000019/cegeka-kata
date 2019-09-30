package dis.will.be.epic.sauce;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {

    @Test
    public void constructorWorksCorrectly() {
        Player player = new Player(emptyList(), new Card(CardColor.GREEN, 1));
        Deck deck = new Deck();
        Game actual = new Game(asList(player, player), deck);

        assertThat(actual.getPlayers()).containsExactly(player, player);
        assertThat(actual.getDeck()).isEqualTo(deck);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructorVerifiesNumberOfPlayersIsAtLeast2() {
        Player player = new Player(emptyList(), new Card(CardColor.GREEN, 1));
        Deck deck = new Deck();
        new Game(asList(player), deck);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructorVerifiesNumberOfPlayersIsNotGreaterThan4() {
        Player player = new Player(emptyList(), new Card(CardColor.GREEN, 1));
        Deck deck = new Deck();
        new Game(asList(player, player, player, player, player), deck);
    }


}