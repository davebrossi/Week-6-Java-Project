package War;

public class Cards {
	// two data points and a describe method

	// box of cards, random values to both players, need attributes, private ones,
	// not
	// visible outside the class
	// Attributes here; by default in the world they are private. These are't class,
	// they're variables, so they are private Methods are
	// public
	private int cardVal; // value of your or placeholder of item 2-14 on your card deck, set for setters
							// and getters now!
	private String Suit; // face value of the card as an example! these two variables belong to the
							// class, no one modifies them

	public int getCardVal() { // if you want to know the value of CardValue you call on this value; card
								// number? this value
		return cardVal;
	}

	public void setCardVal(int cardVal) { // if you want to update the Card Number, you call this one!
		this.cardVal = cardVal;
	}

	public String getSuit() { // by proxy if you want to know the card name, you call this, passive, get data
		return Suit;
	}

	public void setCardValName(String suit) { // if you want to update the face card name diamonds, clubs, etc, here!
		this.Suit = suit;

	}

	public void Describe() {
		System.out.println("Suit: " + Suit + " has the value of " + cardVal + "points");
//cardVal is just a form of value; it's a unit of measurement to determine 'worth'.  So be prepared to adjust
	}

}
