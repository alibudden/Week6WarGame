package warGame;

import java.util.ArrayList;
import java.util.List;

public class Player {

	
	List<Card> hand = new ArrayList<Card>();
	int score;
	String name;
	
	public Player(String name) {
		this.name = name;
		this.score = 0;
	}
	
	public void describe() {
		System.out.println(name + " has these cards in their hand:");
		for (Card card : hand) {
			card.describe();
		}
	
		
		}
	
	public Card flip() {
		Card drawTop = hand.get(0);
		hand.remove(0);
		return drawTop;
		
	}
	
	public void draw (Deck deck) {
		Card card = deck.draw();
		hand.add(card);
	}
	
	public void incrementScore() {
		this.score++;
	}
	
	public int getScore() {
		return score;
		
	
	}
}
