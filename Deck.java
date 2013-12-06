import java.util.LinkedList;
import java.util.Random;
import java.io.*;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

/**
   Deck class creates a full deck of cards (except Jokers)
*/
public class Deck extends CardPile
{
	/**
	   Constructor creates a Deck and populates it with all 52 cards
	*/
	public Deck()
	{
		super();
		populateDeck();
	}

	/**
	   populateDeck method adds all 52 cards to the deck
	*/
	public void populateDeck()
	{
		// add cards that are spades
		super.addCard(new Card(1, 2, new ImageIcon("2s.gif")));
		super.addCard(new Card(1, 3, new ImageIcon("3s.gif")));
		super.addCard(new Card(1, 4, new ImageIcon("4s.gif")));
		super.addCard(new Card(1, 5, new ImageIcon("5s.gif")));
		super.addCard(new Card(1, 6, new ImageIcon("6s.gif")));
		super.addCard(new Card(1, 7, new ImageIcon("7s.gif")));
		super.addCard(new Card(1, 8, new ImageIcon("8s.gif")));
		super.addCard(new Card(1, 9, new ImageIcon("9s.gif")));
		super.addCard(new Card(1, 10, new ImageIcon("10s.gif")));
		super.addCard(new Card(1, 11, new ImageIcon("js.gif")));
		super.addCard(new Card(1, 12, new ImageIcon("qs.gif")));
		super.addCard(new Card(1, 13, new ImageIcon("ks.gif")));
		super.addCard(new Card(1, 14, new ImageIcon("as.gif")));

		// add cards that are clubs
		super.addCard(new Card(2, 2, new ImageIcon("2c.gif")));
		super.addCard(new Card(2, 3, new ImageIcon("3c.gif")));
		super.addCard(new Card(2, 4, new ImageIcon("4c.gif")));
		super.addCard(new Card(2, 5, new ImageIcon("5c.gif")));
		super.addCard(new Card(2, 6, new ImageIcon("6c.gif")));
		super.addCard(new Card(2, 7, new ImageIcon("7c.gif")));
		super.addCard(new Card(2, 8, new ImageIcon("8c.gif")));
		super.addCard(new Card(2, 9, new ImageIcon("9c.gif")));
		super.addCard(new Card(2, 10, new ImageIcon("10c.gif")));
		super.addCard(new Card(2, 11, new ImageIcon("jc.gif")));
		super.addCard(new Card(2, 12, new ImageIcon("qc.gif")));
		super.addCard(new Card(2, 13, new ImageIcon("kc.gif")));
		super.addCard(new Card(2, 14, new ImageIcon("ac.gif")));

		// add cards that are hearts
		super.addCard(new Card(3, 2, new ImageIcon("2h.gif")));
		super.addCard(new Card(3, 3, new ImageIcon("3h.gif")));
		super.addCard(new Card(3, 4, new ImageIcon("4h.gif")));
		super.addCard(new Card(3, 5, new ImageIcon("5h.gif")));
		super.addCard(new Card(3, 6, new ImageIcon("6h.gif")));
		super.addCard(new Card(3, 7, new ImageIcon("7h.gif")));
		super.addCard(new Card(3, 8, new ImageIcon("8h.gif")));
		super.addCard(new Card(3, 9, new ImageIcon("9h.gif")));
		super.addCard(new Card(3, 10, new ImageIcon("10h.gif")));
		super.addCard(new Card(3, 11, new ImageIcon("jh.gif")));
		super.addCard(new Card(3, 12, new ImageIcon("qh.gif")));
		super.addCard(new Card(3, 13, new ImageIcon("kh.gif")));
		super.addCard(new Card(3, 14, new ImageIcon("ah.gif")));

		// add cards that are diamonds
		super.addCard(new Card(4, 2, new ImageIcon("2d.gif")));
		super.addCard(new Card(4, 3, new ImageIcon("3d.gif")));
		super.addCard(new Card(4, 4, new ImageIcon("4d.gif")));
		super.addCard(new Card(4, 5, new ImageIcon("5d.gif")));
		super.addCard(new Card(4, 6, new ImageIcon("6d.gif")));
		super.addCard(new Card(4, 7, new ImageIcon("7d.gif")));
		super.addCard(new Card(4, 8, new ImageIcon("8d.gif")));
		super.addCard(new Card(4, 9, new ImageIcon("9d.gif")));
		super.addCard(new Card(4, 10, new ImageIcon("10d.gif")));
		super.addCard(new Card(4, 11, new ImageIcon("jd.gif")));
		super.addCard(new Card(4, 12, new ImageIcon("qd.gif")));
		super.addCard(new Card(4, 13, new ImageIcon("kd.gif")));
		super.addCard(new Card(4, 14, new ImageIcon("ad.gif")));
	}
}