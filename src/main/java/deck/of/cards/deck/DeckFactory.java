package deck.of.cards.deck;

import deck.of.cards.card.Card;
import deck.of.cards.freanchdeck.FrenchCard;
import deck.of.cards.freanchdeck.FrenchFace;
import deck.of.cards.freanchdeck.FrenchSuit;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DeckFactory {

  public static Deck createDeck(DeckTypes type) {
    switch (type) {
      case FRENCH:
        return createFrenchDeck();
      default:
        return new Deck();
    }
  }

  private static Deck createFrenchDeck() {
    Set<Card> cardList = new HashSet<>();
    Stream.of(FrenchSuit.values())
      .forEach(suit -> Stream.of(FrenchFace.values()).forEach(
        face -> cardList.add(new FrenchCard(face, suit))
      ));
    return new Deck(cardList);
  }

}
