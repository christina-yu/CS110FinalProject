import java.io.*;
import javax.swing.*;
import java.awt.*;

/**
   WarGame class is the guts of the game
*/
public class WarGame
{
	Deck deck;	// full deck
	Hand p1;	// hold cards for player 1
	Hand p2;	// hold cards for player 2
	boolean gameOver;	// true if game is over, false otherwise

	/**
	   WarGame constructor creates two Hands and one Deck, sets gameOver to false
	   and distributes cards in the Deck into the Hands
	*/
	public WarGame()
	{
		gameOver = false;

		p1 = new Hand();
		p2 = new Hand();

		deck = new Deck();
		dealCards(deck, p1, p2);
	}

	/**
	   dealCards distributes all cards in fullDeck to p1 and p2 by calling
	   the dealCard method in CardPile
	   @param fullDeck A Deck full of all 52 cards
	   @param p1 A Hand to hold 26 cards
	   @param p2 A Hand to hold 26 cards
	*/
	public void dealCards(Deck fullDeck, Hand p1, Hand p2)
	{
		while(!deck.isEmpty())
		{
			p1.addCard(deck.dealCard());	// add random card from fullDeck to p1
			p2.addCard(deck.dealCard());	// add random card from fullDeck to p2
		}
	}

	/**
	   gameOver method returns the result of gameOver variable
	   @return True if gameOver is true, false otherwise
	*/
	public boolean gameOver()
	{
		return gameOver;
	}

	/**
	   getHand1 passes reference to p1's Hand
	   @return p1's Hand
	*/
	public Hand getHand1()
	{
		return p1;
	}

	/**
	   getHand2 passes reference to p2's Hand
	   @return p2's Hand
	*/
	public Hand getHand2()
	{
		return p2;
	}

	/**
	   turn method makes a move in the game by drawing the top cards from each Hand
	   and comparing the values to see which is higher; whichever hand has the higher card
	   takes both cards and returns them to the bottom of the deck;
	   if both cards have the same value, a war occurs
	*/
	public void turn()
	{
		Card p1Card1 = p1.drawCard();	// draw p1's top card
		Card p2Card1 = p2.drawCard();	// draw p2's top card

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
			Hand extras = new Hand();	// create a Hand to hold the already face-up cards
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
				}
				else if(p2.size() < 2)
				{
					System.out.println(p2.toString() + " does not have enough cards for war");
					gameOver = true;
				}
			}
		}
	}

	/**
	   war method takes the two hands and the "extra" cards and draws two facedown cards
	   then draws two face-up cards and compares values
	   @param p1 First Hand
	   @param p2 Second Hand
	   @param extras The face-up cards carried over
	*/
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
				}
				else if(p2.size() < 2)
				{
					System.out.println("Player 2 does not have enough cards for war");

					gameOver = true;
				}
			}
		}
	}

	/**
	   warWithTwoCardsLeft method is used in the situation that one of the hands has only
	   two cards left
	   @param p1 First Hand
	   @param p2 Second Hand
	   @param extras The face-up cards carried over
	*/
	public void warWithTwoCardsLeft(Hand p1, Hand p2, Hand extras)
	{
		// draw facedown cards
		Card p1_facedown = p1.drawCard();
		Card p2_facedown = p2.drawCard();

		// add facedown cards to extras pile
		extras.addCard(p1_facedown);
		extras.addCard(p2_facedown);

		Card p1_battleCard = p1.drawCard();	// face-up card
		Card p2_battleCard = p2.drawCard();	// face-up card

		if(p1_battleCard.compareRank(p2_battleCard) > 0)	// player 1's card is higher rank
		{
			p1.addCard(p1_battleCard);
			p1.addCard(p2_battleCard);
			System.out.println("p1 is higher");
			while(!extras.isEmpty())
				p1.addCard(extras.drawCard());

			if(p2.isEmpty())	// game is over if p2 has no more cards
				gameOver = true;
		}
		else if(p1_battleCard.compareRank(p2_battleCard) < 0)	// Player 2's card is higher rank
		{
			p2.addCard(p1_battleCard);
			p2.addCard(p2_battleCard);
			System.out.println("p1 is higher");
			while(!extras.isEmpty())
				p1.addCard(extras.drawCard());

			if(p1.isEmpty())	// game is over if p1 has no more cards
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