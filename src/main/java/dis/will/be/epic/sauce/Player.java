package dis.will.be.epic.sauce;

import com.google.common.base.Preconditions;

import java.util.List;
import java.util.Objects;

import static com.google.common.collect.Lists.newArrayList;

public class Player {

    private List<Card> handCards;
    private List<Card> paletteCards;

    public Player(List<Card> handCards, Card startingPaletteCard) {
        Objects.requireNonNull(handCards);
        Objects.requireNonNull(startingPaletteCard);
        Preconditions.checkArgument(handCards.size() == 7);

        this.handCards = handCards;
        this.paletteCards = newArrayList(startingPaletteCard);
    }

    public List<Card> getHandCards() {
        return handCards;
    }

    public List<Card> getPaletteCards() {
        return paletteCards;
    }
}
