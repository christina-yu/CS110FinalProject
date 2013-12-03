import java.util.LinkedList;
import java.util.Random;
import java.io.*;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

	/**
  	   Creates a full deck of cards (except Jokers)
  	*/
public class Deck
{
	private LinkedList<Card> deck;
	private int suit;
	private int rank;

	/**
	   Constructor creates a LinkedList of Cards and populates it with a full deck of cards
	*/
	public Deck()
	{
		deck = new LinkedList<Card>();

		// add cards that are spades
		deck.add(new Card(1, 2, new ImageIcon("2s.jpg")));
		deck.add(new Card(1, 3, new ImageIcon("3s.jpg")));
		deck.add(new Card(1, 4, new ImageIcon("4s.jpg")));
		deck.add(new Card(1, 5, new ImageIcon("5s.jpg")));
		deck.add(new Card(1, 6, new ImageIcon("6s.jpg")));
		deck.add(new Card(1, 7, new ImageIcon("7s.jpg")));
		deck.add(new Card(1, 8, new ImageIcon("8s.jpg")));
		deck.add(new Card(1, 9, new ImageIcon("9s.jpg")));
		deck.add(new Card(1, 10, new ImageIcon("10s.jpg")));
		deck.add(new Card(1, 11, new ImageIcon("jacks.jpg")));
		deck.add(new Card(1, 12, new ImageIcon("queens.jpg")));
		deck.add(new Card(1, 13, new ImageIcon("kings.jpg")));
		deck.add(new Card(1, 14, new ImageIcon("aces.jpg")));

		// add cards that are clubs
		deck.add(new Card(2, 2, new ImageIcon("2c.jpg")));
		deck.add(new Card(2, 3, new ImageIcon("3c.jpg")));
		deck.add(new Card(2, 4, new ImageIcon("4c.jpg")));
		deck.add(new Card(2, 5, new ImageIcon("5c.jpg")));
		deck.add(new Card(2, 6, new ImageIcon("6c.jpg")));
		deck.add(new Card(2, 7, new ImageIcon("7c.jpg")));
		deck.add(new Card(2, 8, new ImageIcon("8c.jpg")));
		deck.add(new Card(2, 9, new ImageIcon("9c.jpg")));
		deck.add(new Card(2, 10, new ImageIcon("10c.jpg")));
		deck.add(new Card(2, 11, new ImageIcon("jackc.jpg")));
		deck.add(new Card(2, 12, new ImageIcon("queenc.jpg")));
		deck.add(new Card(2, 13, new ImageIcon("kingc.jpg")));
		deck.add(new Card(2, 14, new ImageIcon("acec.jpg")));

		// add cards that are hearts
		deck.add(new Card(3, 2, new ImageIcon("2h.jpg")));
		deck.add(new Card(3, 3, new ImageIcon("3h.jpg")));
		deck.add(new Card(3, 4, new ImageIcon("4h.jpg")));
		deck.add(new Card(3, 5, new ImageIcon("5h.jpg")));
		deck.add(new Card(3, 6, new ImageIcon("6h.jpg")));
		deck.add(new Card(3, 7, new ImageIcon("7h.jpg")));
		deck.add(new Card(3, 8, new ImageIcon("8h.jpg")));
		deck.add(new Card(3, 9, new ImageIcon("9h.jpg")));
		deck.add(new Card(3, 10, new ImageIcon("10h.jpg")));
		deck.add(new Card(3, 11, new ImageIcon("jackh.jpg")));
		deck.add(new Card(3, 12, new ImageIcon("queenh.jpg")));
		deck.add(new Card(3, 13, new ImageIcon("kingh.jpg")));
		deck.add(new Card(3, 14, new ImageIcon("aceh.jpg")));

		// add cards that are diamonds
		deck.add(new Card(4, 2, new ImageIcon("2d.jpg")));
		deck.add(new Card(4, 3, new ImageIcon("3d.jpg")));
		deck.add(new Card(4, 4, new ImageIcon("4d.jpg")));
		deck.add(new Card(4, 5, new ImageIcon("5d.jpg")));
		deck.add(new Card(4, 6, new ImageIcon("6d.jpg")));
		deck.add(new Card(4, 7, new ImageIcon("7d.jpg")));
		deck.add(new Card(4, 8, new ImageIcon("8d.jpg")));
		deck.add(new Card(4, 9, new ImageIcon("9d.jpg")));
		deck.add(new Card(4, 10, new ImageIcon("10d.jpg")));
		deck.add(new Card(4, 11, new ImageIcon("jackd.jpg")));
		deck.add(new Card(4, 12, new ImageIcon("queend.jpg")));
		deck.add(new Card(4, 13, new ImageIcon("kingd.jpg")));
		deck.add(new Card(4, 14, new ImageIcon("aced.jpg")));
	}

	/**
	   The deal method returns a random card from the deck
	   @return A random Card from the deck
	*/
	public Card deal()
	{
		Random rand = new Random();	// create random number generator

		Card card = deck.get(rand.nextInt(deck.size()));	// generate random number and retrieve the card from the random slot in the deck
		deck.remove(card);

		return card;
	}
}