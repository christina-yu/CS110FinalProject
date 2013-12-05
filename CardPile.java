import java.util.LinkedList;
import java.util.Random;
import java.io.*;
import java.util.Scanner;

public class CardPile
{
	private LinkedList<Card> pile;
	int numCards;

	public CardPile()
	{
		pile = new LinkedList<Card>();
	}

	public void addCard(Card card)
	{
		pile.add(card);
		numCards++;
	}

	public Card drawCard()
	{
		numCards--;
		return pile.removeFirst();
	}

	public Card dealCard()
	{
		Random rand = new Random();	// create random number generator

		Card card = pile.get(rand.nextInt(pile.size()));	// generate random number and retrieve the card from the random slot in the deck
		pile.remove(card);

		numCards--;

		return card;
	}

	public int size()
	{
		return numCards;
	}

	public Card peek()
	{
		return pile.get(0);
	}

	public boolean isEmpty()
	{
		if(numCards == 0)
			return true;
		else return false;
	}
}