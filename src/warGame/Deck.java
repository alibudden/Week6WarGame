package warGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	List<Card> deck = new ArrayList<Card>();
	
	public void shuffle() {
		Collections.shuffle(deck);
	}

	public Card drawCard() {
		Card drawnCard = this.deck.get(0);
		this.deck.remove(0);
		return drawnCard;
		}
	
	public Deck() {
		for(int a = 2; a <= 14; a++) {
			for(int i = 0; i < 4; i++) {
				deck.add(new Card(i,a));
			}
		}
	}

	
	
	public List<Card> getCards() {
		return deck;
	}
	
	public void setCards(List<Card> deck) {
		this.deck = deck;
	}
	public Card draw() {
		if(deck.isEmpty()) {
			System.out.println("All out of cards!");
			return null;
		} else {
			Card drawTop = deck.get(0);
			deck.remove(0);
			return drawTop;
			
			
		}
	
	}
}
