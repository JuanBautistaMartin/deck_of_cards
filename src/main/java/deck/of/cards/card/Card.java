package deck.of.cards.card;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Card {

    private ICardFaceValue faceValue;
    private CardSuit suit;

    @Override
    public String toString() {
        return faceValue + " of " + suit;
    }

}
