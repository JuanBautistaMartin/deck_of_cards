package deck.of.cards.deck;

import deck.of.cards.card.Card;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Deck {

    private List<Card> cardDeck;
    private List<Card> shuffledDeck;

    public Deck(List<Card> cardDek) {
        this.cardDeck = cardDek;
    }

    public void shuffle() {
        int index;
        this.shuffledDeck = copyDeck();
        for(int i=0; i < cardDeck.size(); i++) {
            index = (int) (Math.random() * cardDeck.size());
            this.shuffledDeck.set(index, cardDeck.get(i));
        }
    }

    public Optional<Card> dealOneCard() {
        int index = (int) (Math.random() * cardDeck.size());
        Card card = this.shuffledDeck.get(index);
        this.shuffledDeck.remove(index);
        return Optional.ofNullable(card);
    }

    private List<Card> copyDeck() {
        return new ArrayList<>(cardDeck);
    }

    @Override
    public String toString() {
        return cardDeck.stream()
          .map(Card::toString)
          .collect(Collectors.joining("\n"));
    }
}
