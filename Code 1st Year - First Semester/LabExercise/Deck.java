/*
 * Hizon, Angelo Louis L. Hizon
 * 1-CSD
 * LE6
 */

import java.util.Random;

public class Deck
{
	String suit[];
	String rank[];
	String playingCards[][];
	String shuffledDeck[];
	
	Deck()
	{
		suit = new String[] {"H", "C", "D", "S"};
		rank = new String[] {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	}

	public void initializeDeck(String r[], String s[])
	{
		playingCards = new String[r.length][s.length];
		
		for (int i = 0; i < r.length; i++)
		{
			for (int j = 0; j < s.length; j++)
			{
				playingCards [i][j] = rank [i] + suit [j];                                               //merges the two array into one creating a 2-dimensional array
			}	
		}
	}

	public void displayPlayingCards()
	{
		for (int i = 0; i < playingCards.length; i++)
		{
			for (int j = 0; j < playingCards[i].length; j++)
			{
				System.out.print(playingCards[i][j] + "\t");                                             //per row prints the four suit with one rank and changes per row
			}
			System.out.println();
		}
		System.out.println();	
	}
	public void mergeToASingleDeck()
	{		 
		 shuffledDeck = new String [52];
		 
		 for (int i = 0; i < shuffledDeck.length; i++)
		 {
			 shuffledDeck[i] = rank[i%13] + suit [i/13];                                                 //assign the new value of shuffledDeck to 52 cards and pair them
		 }
	}	
	
	public void showDeck()
	{
		for (int i = 0; i < shuffledDeck.length; i++)
		{
			System.out.println("Card " + (i + 1) + " = " + shuffledDeck[i]);                             //prints the paired rank and suit also the reshuffledDeck
		}
		System.out.println();
	}
	
	public String[] shuffle(String[] array)
	{
		Random r = new Random();
		
		for (int i = 0; i < shuffledDeck.length; i++)
		{
			int index = (int)(r.nextInt(shuffledDeck.length));  										//assign new index using random
			
			String reshuffledDeck = shuffledDeck[index];       										    //random value                                        
			shuffledDeck[index] = shuffledDeck[i];              										//switches the random value and the arranged value
			shuffledDeck[i] = reshuffledDeck;                										    //assign random value to the shuffledDeck
		}
		return array;                                                                                   //returns the value to the main method then goes to showDeck method
	}

	// you are not allowed to edit the main method
	public static void main(String args[])
	{
		Deck d = new Deck();
		d.initializeDeck(d.rank, d.suit);
		
		// before Shuffle
		System.out.println("Before Shuffle");
		d.displayPlayingCards();
	
		// merging to a single deck
		System.out.println("After Merging to a Single Deck");
		d.mergeToASingleDeck();
		d.showDeck();

		// shuffle the deck
		System.out.println("After Shuffling the Deck");
		d.shuffledDeck = d.shuffle(d.shuffledDeck);
		d.showDeck();
	}
}

