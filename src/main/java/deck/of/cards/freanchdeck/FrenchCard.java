package deck.of.cards.freanchdeck;

import deck.of.cards.card.Card;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class FrenchCard extends Card {

    private FrenchFace face;
    private FrenchSuit suit;

}
