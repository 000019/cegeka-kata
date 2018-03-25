package dis.will.be.epic.sauce.wincondition;

import dis.will.be.epic.sauce.Card;
import dis.will.be.epic.sauce.Player;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MostOfOneNumberDeterminer implements WinConditionSpecificDeterminer {

    @Override
    public Integer determineWinner(Player player, Player opponent) {
        int mostOccurancesOfOneNumberForPlayer = getMostOccurancesOfOneNumberForPlayer(getTableauCardsAsNumber(player));
        int mostOccurancesOfOneNumberForOpponent = getMostOccurancesOfOneNumberForPlayer(getTableauCardsAsNumber(opponent));
        return determineScoreBasedOnBestResult(mostOccurancesOfOneNumberForPlayer, mostOccurancesOfOneNumberForOpponent);
    }

    @Override
    public Card determineHighestCardForWinCondition(Player player) {
        int maxOccuringNumber = determineMaxOccuringNumber(getTableauCardsAsNumber(player));
        return getHighestCardWithValue(maxOccuringNumber, player.getTableauCards());
    }

    private Card getHighestCardWithValue(int maxOccuringNumber, List<Card> tableauCards) {
        return highestCardUsingFilter(tableauCards, card -> card.getValue() == maxOccuringNumber);
    }

    private List<Integer> getTableauCardsAsNumber(Player player) {
        return getTableauCardsAsNumberStream(player)
                .collect(Collectors.toList());
    }
}
