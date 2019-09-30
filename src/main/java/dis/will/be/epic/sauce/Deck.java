package dis.will.be.epic.sauce;

import java.util.List;

import static org.assertj.core.util.Lists.newArrayList;

public class Deck {

    private List<Card> cards;

    public Deck() {
        cards = newArrayList();
        for(CardColor color : CardColor.values()) {
            for (int value = 1; value < 8; value++) {
                cards.add(new Card(color, value));
            }
        }
    }

    public List<Card> getCards() {
        return cards;
    }

    public List<Card> deal7CardsFromTop() {
        List<Card> dealtCards = this.cards.subList(0, 7);
        cards = cards.subList(7, cards.size());
        return dealtCards;
    }
}
