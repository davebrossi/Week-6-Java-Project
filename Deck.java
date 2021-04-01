package War;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

	// consists of deck, so 2, 12, 14 points these are drawn out at random so
	// players can use them!
	private List<Cards> cardVal; // this is empty right now, we need to assign something to this box between
									// players so they can use it
	// when ever an object of the Deck class is instantiated, we want this array
	// list to have some values inside. Any time you want
	// to do something, you'll need a constructor, a special method/function
	// executed every single time an object is created, by default it
	// gets added to the default of the class or list created. Here we want to
	// initialize this list so we create a constructor

	public Deck() {// default right now, if you want to write code, you'll do it on your own, as
					// soon as your object is created, its here.
		// similar to deck class we want to create all those 52 cards. you could write
		// all those combos, but there are other ways!

		this.cardVal = new ArrayList<Cards>();
		// similar to card value and name. List is empty, how to make this added to the
		// array list?
		// This list now has a single object in it. So over and over.

		Cards d1 = new Cards();
		d1.setCardVal(2);
		d1.setCardValName("2 of Hearts");
		this.cardVal.add(d1);

		Cards d2 = new Cards();
		d2.setCardVal(3);
		d2.setCardValName("3 of Hearts");
		this.cardVal.add(d2);

		Cards d3 = new Cards();
		d3.setCardVal(4);
		d3.setCardValName("4 of Hearts");
		this.cardVal.add(d3);

		Cards d4 = new Cards();
		d4.setCardVal(5);
		d4.setCardValName("5 of Hearts");
		this.cardVal.add(d4);

		Cards d5 = new Cards();
		d5.setCardVal(6);
		d5.setCardValName("6 of Hearts");
		this.cardVal.add(d5);

		Cards d6 = new Cards();
		d6.setCardVal(7);
		d6.setCardValName("7 of Hearts");
		this.cardVal.add(d6);

		Cards d7 = new Cards();
		d7.setCardVal(8);
		d7.setCardValName("8 of Hearts");
		this.cardVal.add(d7);

		Cards d8 = new Cards();
		d8.setCardVal(9);
		d8.setCardValName("9 of Hearts");
		this.cardVal.add(d8);

		Cards d9 = new Cards();
		d9.setCardVal(10);
		d9.setCardValName("10 of Hearts");
		this.cardVal.add(d9);

		Cards d10 = new Cards();
		d10.setCardVal(11);
		d10.setCardValName("Jack of Hearts");
		this.cardVal.add(d10);

		Cards d11 = new Cards();
		d11.setCardVal(12);
		d11.setCardValName("Queen of Hearts");
		this.cardVal.add(d11);

		Cards d12 = new Cards();
		d12.setCardVal(13);
		d12.setCardValName("King of Hearts");
		this.cardVal.add(d12);

		Cards d13 = new Cards();
		d13.setCardVal(14);
		d13.setCardValName("Ace of Hearts");
		this.cardVal.add(d13);

		Cards d14 = new Cards();
		d14.setCardVal(2);
		d14.setCardValName("2 of Diamonds");
		this.cardVal.add(d14);

		Cards d15 = new Cards();
		d15.setCardVal(3);
		d15.setCardValName("3 of Diamonds");
		this.cardVal.add(d15);

		Cards d16 = new Cards();
		d16.setCardVal(4);
		d16.setCardValName("4 of Diamonds");
		this.cardVal.add(d16);

		Cards d17 = new Cards();
		d17.setCardVal(5);
		d17.setCardValName("5 of Diamonds");
		this.cardVal.add(d17);

		Cards d18 = new Cards();
		d18.setCardVal(6);
		d18.setCardValName("6 of Diamonds");
		this.cardVal.add(d18);

		Cards d19 = new Cards();
		d19.setCardVal(7);
		d19.setCardValName("7 of Diamonds");
		this.cardVal.add(d19);

		Cards d20 = new Cards();
		d20.setCardVal(8);
		d20.setCardValName("8 of Diamonds");
		this.cardVal.add(d20);

		Cards d21 = new Cards();
		d21.setCardVal(9);
		d21.setCardValName("9 of Diamonds");
		this.cardVal.add(d21);

		Cards d22 = new Cards();
		d22.setCardVal(10);
		d22.setCardValName("10 of Diamonds");
		this.cardVal.add(d22);

		Cards d23 = new Cards();
		d23.setCardVal(11);
		d23.setCardValName("Jack of Diamonds");
		this.cardVal.add(d23);

		Cards d24 = new Cards();
		d24.setCardVal(12);
		d24.setCardValName("Queen of Diamonds");
		this.cardVal.add(d24);

		Cards d25 = new Cards();
		d25.setCardVal(13);
		d25.setCardValName("King of Diamonds");
		this.cardVal.add(d25);

		Cards d26 = new Cards();
		d26.setCardVal(14);
		d26.setCardValName("Ace of Diamonds");
		this.cardVal.add(d26);

		Cards d27 = new Cards();
		d27.setCardVal(2);
		d27.setCardValName("2 of Clubs");
		this.cardVal.add(d27);

		Cards d28 = new Cards();
		d28.setCardVal(3);
		d28.setCardValName("3 of clubs");
		this.cardVal.add(d28);

		Cards d29 = new Cards();
		d29.setCardVal(4);
		d29.setCardValName("4 of Clubs");
		this.cardVal.add(d29);

		Cards d30 = new Cards();
		d30.setCardVal(5);
		d30.setCardValName("5 of Clubs");
		this.cardVal.add(d30);

		Cards d31 = new Cards();
		d31.setCardVal(6);
		d31.setCardValName("6 of Clubs");
		this.cardVal.add(d31);

		Cards d32 = new Cards();
		d32.setCardVal(7);
		d32.setCardValName("7 of Clubs");
		this.cardVal.add(d32);

		Cards d33 = new Cards();
		d33.setCardVal(8);
		d33.setCardValName("8 of Clubs");
		this.cardVal.add(d33);

		Cards d34 = new Cards();
		d34.setCardVal(9);
		d34.setCardValName("9 of Clubs");
		this.cardVal.add(d34);

		Cards d35 = new Cards();
		d35.setCardVal(10);
		d35.setCardValName("10 of Clubs");
		this.cardVal.add(d35);

		Cards d36 = new Cards();
		d36.setCardVal(11);
		d36.setCardValName("Jack of Clubs");
		this.cardVal.add(d36);

		Cards d37 = new Cards();
		d37.setCardVal(12);
		d37.setCardValName("Queen of Clubs");
		this.cardVal.add(d37);

		Cards d38 = new Cards();
		d38.setCardVal(13);
		d38.setCardValName("King of Clubs");
		this.cardVal.add(d38);

		Cards d39 = new Cards();
		d39.setCardVal(14);
		d39.setCardValName("Ace of Clubs");
		this.cardVal.add(d39);

		Cards d40 = new Cards();
		d40.setCardVal(2);
		d40.setCardValName("2 of Spades");
		this.cardVal.add(d40);

		Cards d41 = new Cards();
		d41.setCardVal(3);
		d41.setCardValName("3 of Spades");
		this.cardVal.add(d41);

		Cards d42 = new Cards();
		d42.setCardVal(4);
		d42.setCardValName("4 of Spades");
		this.cardVal.add(d42);

		Cards d43 = new Cards();
		d43.setCardVal(5);
		d43.setCardValName("5 of Spades");
		this.cardVal.add(d43);

		Cards d44 = new Cards();
		d44.setCardVal(6);
		d44.setCardValName("6 of Spades");
		this.cardVal.add(d44);

		Cards d45 = new Cards();
		d45.setCardVal(7);
		d45.setCardValName("7 of Spades");
		this.cardVal.add(d45);

		Cards d46 = new Cards();
		d46.setCardVal(8);
		d46.setCardValName("8 of Spades");
		this.cardVal.add(d46);

		Cards d47 = new Cards();
		d47.setCardVal(9);
		d47.setCardValName("9 of Spades");
		this.cardVal.add(d47);

		Cards d48 = new Cards();
		d48.setCardVal(10);
		d48.setCardValName("10 of Spades");
		this.cardVal.add(d48);

		Cards d49 = new Cards();
		d49.setCardVal(11);
		d49.setCardValName("Jack of Spades");
		this.cardVal.add(d49);

		Cards d50 = new Cards();
		d50.setCardVal(12);
		d50.setCardValName("Queen of Spades");
		this.cardVal.add(d49);

		Cards d51 = new Cards();
		d51.setCardVal(13);
		d51.setCardValName("King of Spades");
		this.cardVal.add(d51);

		Cards d52 = new Cards();
		d52.setCardVal(14);
		d52.setCardValName("Ace of Spades");
		this.cardVal.add(d52);

		// right now, you start brute force; look for efficiency next. You show case that
		// you can code, and then go back and fix it.
		// you build confidence by at least solving it; don't worry about shortcuts at
		// first. The hint is a for loop here, how do I create
		// a way to combine these strings? You just want it run. Every time your game
		// starts.
	}

	public List<Cards> getCardVal() {
		return cardVal;
	}

	public void setCardVal(List<Cards> cardVal) {
		this.cardVal = cardVal;
	}

	// shuffle is another one required for the card game; you want to randomize the
	// box, so that random Cards come out, how to shuffle?
	// couple of ways to shuffle, there is a method in collection framework called
	// shuffle. Any
	public void shuffle() {

		// Collections.shuffle(this.hitPoints); this would be the best way; they want
		// you to mess around with the list manually so try another
		// manual set of logic

		Random random = new Random();

		random.nextInt(53); // gives you the next random integer, up to 2 mil. Not good, so we put a number
							// in the (). (10) would be random 0-10
		// 0 is inclusive, to 5 exclusive, 0 is possible! Never 5 though. So in a deck
		// of 52, 53 would be the max.
		for (int i = cardVal.size() - 1; i > 0; i--) {
			// need to swap items in the array list. started with int j = random, then ran
			// loop backwards from 52, 51, 50 etc.
			int j = random.nextInt(i + 1); // this keeps you from erroring out. You don't have a 0 card. It adds up in
											// the list.

			Cards cardValAtIndexI = this.cardVal.get(i); // the value starts at 53, but that's not valid, since the list
															// size is 52, index is
			// 0-53, so we exited the for loop to add -1 to this.hitPoints.size().
			Cards cardValAtIndexJ = this.cardVal.get(j); // some random index, we want to swap these two

			this.cardVal.set(i, cardValAtIndexJ); // this is how you swap positions on and on until the loop ends. If
													// you want to shuffle
			this.cardVal.set(j, cardValAtIndexI); // this is how you do it at the start. Write it this way for the card
													// game.
		}
	}

	// also need one for 'draw' pulling a card from the deck going to a player. Here
	// a player draws a card; it needs to return a card in war
	// it takes from the deck above.
	public Cards draw() {
		return this.cardVal.remove(0); // remove picks up and deletes the item from the array. It returns the value
										// then removes it from the
		// deck from the first index of the array.

	}
}
