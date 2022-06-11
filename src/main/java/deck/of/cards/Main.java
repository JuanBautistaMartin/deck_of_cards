package deck.of.cards;

import deck.of.cards.deck.Deck;

public class Main {

  public static void main(String[] args) {

    Deck frenchDeck = DeckFactory.createDeck(DeckTypes.FRENCH);

    // printing new created deck
    System.out.println("French deck: ");
    System.out.println(frenchDeck.toString());

  }

}
