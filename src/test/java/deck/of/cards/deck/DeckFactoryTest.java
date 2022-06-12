package deck.of.cards.deck;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeckFactoryTest {

  @Test
  void createFrenchDeck() {
    Deck frenchDeck = DeckFactory.createDeck(DeckTypes.FRENCH);

    assertEquals(52, frenchDeck.getCardDeck().size());
  }

}
