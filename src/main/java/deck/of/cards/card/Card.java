package deck.of.cards.card;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Card {

    private ICardFace faceValue;
    private ICardSuit suit;

    @Override
    public String toString() {
        return faceValue + " of " + suit;
    }

}
