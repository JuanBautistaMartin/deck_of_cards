package deck.of.cards.deck;

import deck.of.cards.card.Card;
import deck.of.cards.freanchdeck.FrenchCard;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class DeckTest {

  @Test
  void dealOneCard() {
    Deck deck = DeckFactory.createDeck(DeckTypes.FRENCH);
    deck.shuffle();
    Optional<Card> dealedCard = deck.dealOneCard();

    assertInstanceOf(FrenchCard.class, dealedCard.get());
    assertEquals(51, deck.getShuffledDeck().size());
  }

}
