package dis.will.be.epic.sauce;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class DeckTest {

    @Test
    public void deckHas49Cards() {
        assertThat(new Deck().getCards()).hasSize(49);
    }

    @Test
    public void deal7Cards() {
        Deck deck = new Deck();
        List<Card> actual = deck.deal7CardsFromTop();
        assertThat(actual.size()).isEqualTo(7);
        assertThat(deck.getCards().size()).isEqualTo(42);
    }
}