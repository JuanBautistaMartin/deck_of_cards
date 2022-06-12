package deck.of.cards;

import deck.of.cards.card.Card;
import deck.of.cards.deck.Deck;
import deck.of.cards.deck.DeckFactory;
import deck.of.cards.deck.DeckTypes;

import java.util.Optional;
import java.util.logging.Logger;

public class Main {

  private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

  public static void main(String[] args) {

    Deck frenchDeck = DeckFactory.createDeck(DeckTypes.FRENCH);

    // printing new created deck
    LOGGER.info("French deck: ");
    LOGGER.info(frenchDeck.toString());
    LOGGER.info("=========================================\n");

    frenchDeck.shuffle();
    frenchDeck.getShuffledDeck().forEach(System.out::println);
    LOGGER.info("=========================================\n");

    Optional<Card> cardOptional = frenchDeck.dealOneCard();
    if(cardOptional.isPresent()) {
      LOGGER.info(cardOptional.get().toString());
    } else {
      LOGGER.info("No delaed card.");
    }

  }

}
