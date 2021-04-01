package War;

import java.util.ArrayList;
import java.util.List;

public class Player {

//defining the people playing this game.  Name of player, score, and list of card Values.  Each player is assigned some number of Cards
	private String name;
	private List<Cards> card;
	private int score;

	public Player(String name) { // this makes it easier to set players for you to set the name instead of two
									// lines on the main app
		this.name = name;
		this.card = new ArrayList<Cards>();
	}

	public String getName() { // private class requires a get function to return the name inputted while
								// keeping this class private
		return name;
	}

	public void setName(String name) { // private class necessitates you have an option to set names by passing data
										// into this class
		this.name = name;
	}

	public List<Cards> getcard() {
		return card;
	}

	public void setcard(List<Cards> card) {
		this.card = card;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void describe() { // the significance of .this is to make a distinction between this.name and
								// name. on the right name comes from
		// right as parameter, this.name is stating it's the class of an attribute.
		// this.name is accessing the class variable name
		System.out.println("Player Name: " + this.name);

		for (Cards ds : this.card) {
			ds.Describe(); // oop is at work, your card is an array list of CardVal which is a class. The
							// class contains in this case
			// a 'variable' cds and card as you're iterating through the list.
			// A lot of data in a single unit. If this class was not there, you'd have to
			// create two extra variables and add them.
		}
	}

	public Cards draw() {
		return this.card.remove(0); // this is the draw
	}

	public void draw(Deck deck) // deck's in front of you, you're drawing cards, so the player needs deck of
								// cards
	{ // how does a player pick? They draw, strength here
		Cards ds = deck.draw();

		this.card.add(ds);
	}

	public void incrementScore() {// short way is this.score += 1;
		this.score = this.score + 1;
	}
}