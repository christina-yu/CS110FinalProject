import java.util.LinkedList;
import java.util.Random;
import java.io.*;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

/**
   Creates a full deck of cards (except Jokers)
*/
public class Deck extends CardPile
{
	public Deck()
	{
		super();
		populateDeck();

	}

	public void populateDeck()
	{
		// add cards that are spades
		super.addCard(new Card(1, 2, new ImageIcon("2s.gif"), "front"));
		super.addCard(new Card(1, 3, new ImageIcon("3s.gif"), "front"));
		super.addCard(new Card(1, 4, new ImageIcon("4s.gif"), "front"));
		super.addCard(new Card(1, 5, new ImageIcon("5s.gif"), "front"));
		super.addCard(new Card(1, 6, new ImageIcon("6s.gif"), "front"));
		super.addCard(new Card(1, 7, new ImageIcon("7s.gif"), "front"));
		super.addCard(new Card(1, 8, new ImageIcon("8s.gif"), "front"));
		super.addCard(new Card(1, 9, new ImageIcon("9s.gif"), "front"));
		super.addCard(new Card(1, 10, new ImageIcon("10s.gif"), "front"));
		super.addCard(new Card(1, 11, new ImageIcon("js.gif"), "front"));
		super.addCard(new Card(1, 12, new ImageIcon("qs.gif"), "front"));
		super.addCard(new Card(1, 13, new ImageIcon("ks.gif"), "front"));
		super.addCard(new Card(1, 14, new ImageIcon("as.gif"), "front"));

		// add cards that are clubs
		super.addCard(new Card(2, 2, new ImageIcon("2c.gif"), "front"));
		super.addCard(new Card(2, 3, new ImageIcon("3c.gif"), "front"));
		super.addCard(new Card(2, 4, new ImageIcon("4c.gif"), "front"));
		super.addCard(new Card(2, 5, new ImageIcon("5c.gif"), "front"));
		super.addCard(new Card(2, 6, new ImageIcon("6c.gif"), "front"));
		super.addCard(new Card(2, 7, new ImageIcon("7c.gif"), "front"));
		super.addCard(new Card(2, 8, new ImageIcon("8c.gif"), "front"));
		super.addCard(new Card(2, 9, new ImageIcon("9c.gif"), "front"));
		super.addCard(new Card(2, 10, new ImageIcon("10c.gif"), "front"));
		super.addCard(new Card(2, 11, new ImageIcon("jc.gif"), "front"));
		super.addCard(new Card(2, 12, new ImageIcon("qc.gif"), "front"));
		super.addCard(new Card(2, 13, new ImageIcon("kc.gif"), "front"));
		super.addCard(new Card(2, 14, new ImageIcon("ac.gif"), "front"));

		// add cards that are hearts
		super.addCard(new Card(3, 2, new ImageIcon("2h.gif"), "front"));
		super.addCard(new Card(3, 3, new ImageIcon("3h.gif"), "front"));
		super.addCard(new Card(3, 4, new ImageIcon("4h.gif"), "front"));
		super.addCard(new Card(3, 5, new ImageIcon("5h.gif"), "front"));
		super.addCard(new Card(3, 6, new ImageIcon("6h.gif"), "front"));
		super.addCard(new Card(3, 7, new ImageIcon("7h.gif"), "front"));
		super.addCard(new Card(3, 8, new ImageIcon("8h.gif"), "front"));
		super.addCard(new Card(3, 9, new ImageIcon("9h.gif"), "front"));
		super.addCard(new Card(3, 10, new ImageIcon("10h.gif"), "front"));
		super.addCard(new Card(3, 11, new ImageIcon("jh.gif"), "front"));
		super.addCard(new Card(3, 12, new ImageIcon("qh.gif"), "front"));
		super.addCard(new Card(3, 13, new ImageIcon("kh.gif"), "front"));
		super.addCard(new Card(3, 14, new ImageIcon("ah.gif"), "front"));

		// add cards that are diamonds
		super.addCard(new Card(4, 2, new ImageIcon("2d.gif"), "front"));
		super.addCard(new Card(4, 3, new ImageIcon("3d.gif"), "front"));
		super.addCard(new Card(4, 4, new ImageIcon("4d.gif"), "front"));
		super.addCard(new Card(4, 5, new ImageIcon("5d.gif"), "front"));
		super.addCard(new Card(4, 6, new ImageIcon("6d.gif"), "front"));
		super.addCard(new Card(4, 7, new ImageIcon("7d.gif"), "front"));
		super.addCard(new Card(4, 8, new ImageIcon("8d.gif"), "front"));
		super.addCard(new Card(4, 9, new ImageIcon("9d.gif"), "front"));
		super.addCard(new Card(4, 10, new ImageIcon("10d.gif"), "front"));
		super.addCard(new Card(4, 11, new ImageIcon("jd.gif"), "front"));
		super.addCard(new Card(4, 12, new ImageIcon("qd.gif"), "front"));
		super.addCard(new Card(4, 13, new ImageIcon("kd.gif"), "front"));
		super.addCard(new Card(4, 14, new ImageIcon("ad.gif"), "front"));
	}
}