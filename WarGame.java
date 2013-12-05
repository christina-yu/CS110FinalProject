import java.util.Random;
import java.io.*;
import javax.swing.*;
import java.awt.*;

public class WarGame
{
	Deck deck;
	Hand p1;
	Hand p2;
	boolean gameOver;

	public WarGame()
	{
		gameOver = false;

		p1 = new Hand("Player 1");
		p2 = new Hand("Player 2");

		deck = new Deck();
		dealCards(deck, p1, p2);
	}

	public void dealCards(Deck fullDeck, Hand p1, Hand p2)
	{
		while(!deck.isEmpty())
		{
			p1.addCard(deck.dealCard());
			p2.addCard(deck.dealCard());
		}
	}

	public boolean gameOver()
	{
		return gameOver;
	}

	public Hand getHand1()
	{
		return p1;
	}

	public Hand getHand2()
	{
		return p2;
	}

	public void turn()
	{
		Card p1Card1 = p1.drawCard();
		Card p2Card1 = p2.drawCard();

		if(p1Card1.compareRank(p2Card1) > 0)	// p1 has higher card
		{
			p1.addCard(p1Card1);
			p1.addCard(p2Card1);
			System.out.println("p1 is higher");
		}
		else if(p1Card1.compareRank(p2Card1) < 0)	// p2 has higher card
		{
			p2.addCard(p1Card1);
			p2.addCard(p2Card1);
			System.out.println("p2 is higher");
		}
		else	// war
		{
			Hand extras = new Hand();
			extras.addCard(p1Card1);
			extras.addCard(p2Card1);

			if(p1.size() >= 3 && p2.size() >= 3)	// both players have enough cards for war
			{
				System.out.println("War Level1");
				war(p1, p2, extras);
			}
			else if(p1.size() == 2 || p2.size() == 2)	// one player has only two cards left
			{
				System.out.println("WarWith2Cards Level1");
				warWithTwoCardsLeft(p1, p2, extras);
			}
			else	// one player does not have enough cards for a war
			{
				if(p1.size() < 2)
				{
					System.out.println(p1.toString() + " does not have enough cards for war");
					gameOver = true;
//					// empty player 1's deck of cards into the extra deck
//					while(!p1.isEmpty())
//						extras.addCard(p1.drawCard());
				}
				else if(p2.size() < 2)
				{
					System.out.println(p2.toString() + " does not have enough cards for war");
					gameOver = true;
//					// empty player 1's deck of cards into the extra deck
//					while(!p2.isEmpty())
//						extras.addCard(p2.drawCard());
				}
			}
		}
	}

	public void war(Hand p1, Hand p2, Hand extras)
	{
		// draw facedown cards
		Card p1_facedown = p1.drawCard();
		Card p2_facedown = p2.drawCard();

		// add facedown cards to extras pile
		extras.addCard(p1_facedown);
		extras.addCard(p2_facedown);

		Card p1_battleCard = p1.drawCard();	// face-up card
		Card p2_battleCard = p2.drawCard();	// face-up card

		//int compareVal = p1_battleCard.compareRank(p2_battleCard);

		if(p1_battleCard.compareRank(p2_battleCard) > 0)	// player 1's card is higher rank
		{
			p1.addCard(p1_battleCard);
			p1.addCard(p2_battleCard);
			System.out.println("p1 is higher");
			while(!extras.isEmpty())	// add all cards to p1's deck
				p1.addCard(extras.drawCard());
		}
		else if(p1_battleCard.compareRank(p2_battleCard) < 0)	// Player 2's card is higher rank
		{
			p2.addCard(p1_battleCard);
			p2.addCard(p2_battleCard);
			System.out.println("p2 is higher");
			while(!extras.isEmpty())	// add all cards to p2's deck
				p1.addCard(extras.drawCard());
		}
		else	// another war
		{
			extras.addCard(p1_battleCard);
			extras.addCard(p2_battleCard);

			if(p1.size() >= 3 && p2.size() >= 3)	// if both players have enough cards
			{
				System.out.println("War Level2");
				war(p1, p2, extras);
			}
			else if(p1.size() == 2 || p2.size() == 2)	// if one player has two cards left
			{
				System.out.println("WarWith2Cards Level2");
				warWithTwoCardsLeft(p1, p2, extras);
			}
			else	// if one player does not have enough cards for a war
			{
				if(p1.size() < 2)
				{
					System.out.println("Player 1 does not have enough cards for war");

					gameOver = true;
//					// empty player 1's deck of cards into the extra deck
//					while(!p1.isEmpty())
//						extras.addCard(p1.drawCard());
				}
				else if(p2.size() < 2)
				{
					System.out.println("Player 2 does not have enough cards for war");

					gameOver = true;
//					// empty player 1's deck of cards into the extra deck
//					while(!p2.isEmpty())
//						extras.addCard(p2.drawCard());
				}
			}
		}
	}

	public void warWithTwoCardsLeft(Hand p1, Hand p2, Hand extras)
	{
		//int flag = 0;

		// draw facedown cards
		Card p1_facedown = p1.drawCard();
		Card p2_facedown = p2.drawCard();

		// add facedown cards to extras pile
		extras.addCard(p1_facedown);
		extras.addCard(p2_facedown);

		Card p1_battleCard = p1.drawCard();	// face-up card
		Card p2_battleCard = p2.drawCard();	// face-up card

		//int compareVal = p1_battleCard.compareRank(p2_battleCard);

		if(p1_battleCard.compareRank(p2_battleCard) > 0)	// player 1's card is higher rank
		{
			p1.addCard(p1_battleCard);
			p1.addCard(p2_battleCard);
			System.out.println("p1 is higher");
			while(!extras.isEmpty())
				p1.addCard(extras.drawCard());

			if(p2.isEmpty())	// set flag to -1 if player 2's deck is empty
				gameOver = true;
		}
		else if(p1_battleCard.compareRank(p2_battleCard) < 0)	// Player 2's card is higher rank
		{
			p2.addCard(p1_battleCard);
			p2.addCard(p2_battleCard);
			System.out.println("p1 is higher");
			while(!extras.isEmpty())
				p1.addCard(extras.drawCard());

			if(p1.isEmpty())	// set flag to -1 if player 1's deck is empty
				gameOver = true;
		}
		else	// another war
		{
			if(!gameOver)
			{
				System.out.println("ComingOutFromTwoCardsOnlyWar - War Level2");
				war(p1, p2, extras);
			}
		}
	}
}