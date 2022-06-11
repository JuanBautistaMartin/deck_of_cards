package deck.of.cards.deck;

import deck.of.cards.card.Card;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Deck {
    private Set<Card> cardSet;

    @Override
    public String toString() {
        return cardSet.stream()
          .map(Card::toString)
          .collect(Collectors.joining("\n"));
    }
}
