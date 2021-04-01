package War;
//as a note, this was a creation which resulted from viewing previous lectures.  While I understand the nature of what was created, the 
//original design is not mine, nor was it solved by paying someone else.  I wrote the code as I viewed the lecture and modified to meet the 
//criteria set out in the project dossier.  
public class App {

	public static void main(String[] args) {
		// we have to create objects here to test these three classes;

		Deck deck = new Deck(); // list of cards gets created; in the deck class, every time an object is
								// initiated, you get one!
		// deck of cards gets filled
		Player elizabethRossi = new Player("Elizabeth Rossi"); // so we need properties
		// elizabethrossi.setName("Elizabeth Rossi"); //could also set a constructor
		// that takes some default values, so in player ->>>
		Player nikkiPrudden = new Player("Nikki Prudden");
		// you can have empty constructors or you can have constructor that have
		// something being passed. Now to shuffle the deck
		deck.shuffle();
		// now the players need to draw

		// elizabethRossi.draw(deck); //right now there are 52 items in the deck. It
		// needs to be 52, so 26 each side
		for (int i = 1; i < 53; i++) {
			// the For loop above allows us to hard code between 1 and 53 in the deck. We
			// also need to divide odd and even numbers in turns
			// modulus here, remember dividing by 2, i%2 = 0 is even, i%2 != 0 is odd. Helps
			// write a program to determine which
			if (i % 2 == 0) {
				elizabethRossi.draw(deck);
			} else {
				nikkiPrudden.draw(deck); // each player goes to the deck and picks one up.
			}
		}
		// now we have to indicate how many times we're running the game.
		for (int i = 1; i < 3; i++) {
			Cards elizabethRossiDS = elizabethRossi.draw();
			Cards nikkiPruddenDS = nikkiPrudden.draw();
			// the player who is losing gets nothing, the other player does, how do we
			// display this?
			if (elizabethRossiDS.getCardVal() > nikkiPruddenDS.getCardVal()) {
				elizabethRossi.incrementScore();

			} else if (elizabethRossiDS.getCardVal() < nikkiPruddenDS.getCardVal()) {

				nikkiPrudden.incrementScore();
			} else {
				elizabethRossi.incrementScore();
				nikkiPrudden.incrementScore();
			}
		}
		// to get score
		int elizabethRossiScore = elizabethRossi.getScore();
		int nikkiPruddenScore = nikkiPrudden.getScore();

		if (elizabethRossiScore == nikkiPruddenScore) {
			System.out.println("both power levels are OVERRRRRR 9000!");
		} else if (elizabethRossiScore > nikkiPruddenScore) {
			System.out.println(elizabethRossi.getName() + " is Queen of Awesome!");
		} else {
			System.out.println(nikkiPrudden.getName() + " is Queen of Awesome!");
		}
	}

}
