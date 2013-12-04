import java.util.Random;
import java.io.*;
import javax.swing.*;
import java.awt.*;

public class War
{
	public static void main(String[] args)
	{
		Deck fullDeck = new Deck();
		Hand player1 = new Hand();
		Hand player2 = new Hand();

		dealCards(fullDeck, player1, player2);

		while(!player1.isEmpty() && !player2.isEmpty())
		{
			compare(player1, player2);	// draw card from each deck and compare
			System.out.println("player 1: " + player1.size() + "\tplayer 2: " + player2.size());
		}

		if(player1.isEmpty())
			System.out.println("Player 1 is out of cards.");
		else
			System.out.println("Player 2 is out of cards.");

		System.out.println("Game over.");
	}

	public static void dealCards(Deck deck, Hand p1, Hand p2)
	{
		while(!deck.isEmpty())
		{
			p1.addCard(deck.dealCard());
			p2.addCard(deck.dealCard());
		}
	}

	public static void compare(Hand p1, Hand p2)
	{
		// draw card from top of deck
		Card p1_card1 = p1.drawCard();
		Card p2_card1 = p2.drawCard();

		int compareVal;	// holds number after comparing Cards

		compareVal = p1_card1.compareRank(p2_card1);

		if(compareVal > 0)	// player 1's card is higher rank
		{
			p1.addCard(p1_card1);
			p1.addCard(p2_card1);
		}
		else if(compareVal < 0)	// player 2's card is higher rank
		{
			p2.addCard(p1_card1);
			p2.addCard(p2_card1);
		}
		else	// War!
		{
			Hand extras = new Hand();	// create deck to hold the carryover cards
			extras.addCard(p1_card1);
			extras.addCard(p2_card1);

			if(p1.size() >= 3 && p2.size() >= 3)
			{
				System.out.println("War Level1");
				war(p1, p2, extras);
			}
			else if(p1.size() == 2 || p2.size() == 2)
			{
				System.out.println("WarWith2Cards Level1");
				warWithTwoCardsLeft(p1, p2, extras);
			}
			else	// if one player does not have enough cards for a war
			{
				if(p1.size() < 2)
				{
					System.out.println("Player 1 does not have enough cards for war");
					// empty player 1's deck of cards into the extra deck
					while(!p1.isEmpty())
						extras.addCard(p1.drawCard());
				}
				else if(p2.size() < 2)
				{
					System.out.println("Player 2 does not have enough cards for war");
					// empty player 1's deck of cards into the extra deck
					while(!p2.isEmpty())
						extras.addCard(p2.drawCard());
				}
			}
		}
	}

	public static void war(Hand p1, Hand p2, Hand extras)
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

		int compareVal = p1_battleCard.compareRank(p2_battleCard);

		if(compareVal > 0)	// player 1's card is higher rank
		{
			p1.addCard(p1_battleCard);
			p1.addCard(p2_battleCard);
			while(!extras.isEmpty())
				p1.addCard(extras.drawCard());
		}
		else if(compareVal < 0)	// Player 2's card is higher rank
		{
			p2.addCard(p1_battleCard);
			p2.addCard(p2_battleCard);
			while(!extras.isEmpty())
				p1.addCard(extras.drawCard());
		}
		else	// War!
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
					// empty player 1's deck of cards into the extra deck
					while(!p1.isEmpty())
						extras.addCard(p1.drawCard());
				}
				else if(p2.size() < 2)
				{
					System.out.println("Player 2 does not have enough cards for war");
					// empty player 1's deck of cards into the extra deck
					while(!p2.isEmpty())
						extras.addCard(p2.drawCard());
				}
			}
		}
	}

	public static void warWithTwoCardsLeft(Hand p1, Hand p2, Hand extras)
	{
		int flag = 0;

		// draw facedown cards
		Card p1_facedown = p1.drawCard();
		Card p2_facedown = p2.drawCard();

		// add facedown cards to extras pile
		extras.addCard(p1_facedown);
		extras.addCard(p2_facedown);

		Card p1_battleCard = p1.drawCard();	// face-up card
		Card p2_battleCard = p2.drawCard();	// face-up card

		int compareVal = p1_battleCard.compareRank(p2_battleCard);

		if(compareVal > 0)	// player 1's card is higher rank
		{
			p1.addCard(p1_battleCard);
			p1.addCard(p2_battleCard);
			while(!extras.isEmpty())
				p1.addCard(extras.drawCard());

			if(p2.isEmpty())	// set flag to -1 if player 2's deck is empty
				flag = -1;
		}
		else if(compareVal < 0)	// Player 2's card is higher rank
		{
			p2.addCard(p1_battleCard);
			p2.addCard(p2_battleCard);
			while(!extras.isEmpty())
				p1.addCard(extras.drawCard());

			if(p1.isEmpty())	// set flag to -1 if player 1's deck is empty
				flag = -1;
		}
		else	// War!
		{
			if(flag != -1)
			{
				System.out.println("ComingOutFromTwoCardsOnlyWar");
				war(p1, p2, extras);
			}
		}
	}
}