package deck.of.cards.freanchdeck;

import deck.of.cards.card.Card;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class FrenchCard extends Card {

    private FrenchFace face;
    private FrenchSuit suit;

}
