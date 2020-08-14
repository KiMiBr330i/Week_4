//-----------------------------------------------------------------------
// Lab 4 exercise 3 - CPSC-50100-002
// Kip Brower 08-13-20
// Card.java - class to generate a random card from a standard playing deck.
//-----------------------------------------------------------------------

import java.util.Random;

final class Card { // Card class
	static Random pull = new Random();
	static int SUIT = 0;
	static int VALUE = 0;

	public static void getCard() { // method to draw a random card, and output the card to the console.
		final int VALUE = pull.nextInt(13);
		final int SUIT = pull.nextInt(4);
		if (VALUE == 0)
			System.out.println("Ace");
		if (VALUE == 1)
			System.out.println("two");
		if (VALUE == 2)
			System.out.println("three");
		if (VALUE == 3)
			System.out.println("four");
		if (VALUE == 4)
			System.out.println("five");
		if (VALUE == 5)
			System.out.println("six");
		if (VALUE == 6)
			System.out.println("seven");
		if (VALUE == 7)
			System.out.println("eight");
		if (VALUE == 8)
			System.out.println("nine");
		if (VALUE == 9)
			System.out.println("ten");
		if (VALUE == 10)
			System.out.println("Jack");
		if (VALUE == 11)
			System.out.println("Queen");
		if (VALUE == 12)
			System.out.println("King");
		if (SUIT == 0)
			System.out.println(" of Spades");
		if (SUIT == 1)
			System.out.println(" of Clubs");
		if (SUIT == 2)
			System.out.println(" of Hearts");
		if (SUIT == 3)
			System.out.println(" of Diamonds");

	}

}
