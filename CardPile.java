import java.util.LinkedList;
import java.util.Random;
import java.io.*;

/**
   CardPile class creates a CardPile object which is able to store a list of Cards
*/
public class CardPile
{
	private LinkedList<Card> pile;
	int numCards;

	/**
	   Constructor creates an empty list of Cards
	*/
	public CardPile()
	{
		pile = new LinkedList<Card>();
	}

	/**
	   addCard method adds a Card to the pile
	   @param card The card object to be added to the pile
	*/
	public void addCard(Card card)
	{
		pile.add(card);
		numCards++;
	}

	/**
	   drawCard method returns the first card in the pile
	   @return The first card in the list
	*/
	public Card drawCard()
	{
		numCards--;
		return pile.removeFirst();
	}

	/**
	   dealCard method returns a randomly selected Card
	   @return A randomly chosen Card from the pile
	*/
	public Card dealCard()
	{
		Random rand = new Random();	// create random number generator

		Card card = pile.get(rand.nextInt(pile.size()));	// generate random number and retrieve the card from the random slot in the deck
		pile.remove(card);

		numCards--;

		return card;
	}

	/**
	   size method return the number of Cards in the pile
	   @return The number of Cards in the list
	*/
	public int size()
	{
		return numCards;
	}

	/**
		peek method returns the top Card in the pile without removing it from the pile
		@return The top Card in the list
	*/
	public Card peek()
	{
		return pile.get(0);
	}

	/**
	   isEmpty method return true if there are no Cards in the pile, false otherwise
	   @return True if no Cards in list, false otherwise
	*/
	public boolean isEmpty()
	{
		if(numCards == 0)
			return true;
		else return false;
	}
}