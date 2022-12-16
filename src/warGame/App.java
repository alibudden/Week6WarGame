package warGame;

public class App {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		Player playerOne = new Player("Player 1");
		Player playerTwo = new Player("Player 2");
		
		deck.shuffle();
		
		for(int i = 1; i<=26; i++) {
			playerOne.hand.add(deck.draw());
			playerTwo.hand.add(deck.draw());
		}
		
		playerOne.describe();
		playerTwo.describe();
		
		for(int i=0; i<26; i++) {
			Card playerOneCard = playerOne.flip();
			Card playerTwoCard = playerTwo.flip();
			
		if (playerOneCard.getValue() > playerTwoCard.getValue()) {
			playerOne.incrementScore();
		} else if (playerOneCard.getValue() < playerTwoCard.getValue()) {
			playerTwo.incrementScore();
		} else {
			System.out.println();
			
			
		}
		}
			System.out.println("****RESULTS****");
	
		if (playerOne.score > playerTwo.score) {
			System.out.println("The winner is Player 1!");
			System.out.println("Player 1 score: " + playerOne.score + " vs. " + "Player 2 score: " + playerTwo.score);
		} else if (playerTwo.score > playerOne.score) {
			System.out.println("The winner is Player 2!");
			System.out.println("Player 2 score: " + playerTwo.score + " vs. " + "Player 1 score: " + playerOne.score);
			
		} else {
			System.out.println("Draw");
		}
			
		}

}
