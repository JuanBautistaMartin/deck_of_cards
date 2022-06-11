package deck.of.cards.freanchdeck;

import deck.of.cards.card.Card;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FrenchCard extends Card {

    private FrenchFace face;
    private FrenchSuit suit;

    public FrenchCard(FrenchFace face, FrenchSuit suit) {
        super(face, suit);
    }

}
