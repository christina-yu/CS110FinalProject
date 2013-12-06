import javax.swing.*;

/**
   Card class creates an object that holds suit, rank, and ImageIcon
*/
public class Card
{
	// code values for each suit
	public final static int SPADES = 1;
	public final static int CLUBS = 2;
	public final static int HEARTS = 3;
	public final static int DIAMONDS = 4;

	// code values of face cards and aces
	public final static int ACE = 14;
	public final static int JACK = 11;
	public final static int QUEEN = 12;
	public final static int KING = 13;

	private int suit;	// holds the card's suit
	private int rank;	// holds the card's rank
	private ImageIcon cardpic;

	/**
      This constructor takes in a suit and rank to make a Card.
      @param soot The chosen suit of the to-be card.
      @param ranke The chosed rank of the to-be card.
      @param pic The image of the card.
    */
	public Card(int soot, int ranke, ImageIcon pic)
	{
		suit = soot;
		rank = ranke;
		cardpic = pic;
	}

	/**
      The method getSuit returns the number that the suit is equal to.
      @return The number the suit is equal to.
	*/
	public int getSuit()
	{
		return suit;
	}

	/**
      The method getRank returns the number that the rank is equal to.
      @return The number the rank is equal to.
	*/
	public int getRank()
	{
		return rank;
	}

	/**
      The method getImage returns the image of the card.
      @return The image of the card.
	*/
	public ImageIcon getImage()
  	{
    	return cardpic;
  	}

	/**
      The method equals compares the ranks of two card objects.
      @return 0 if the ranks are equal, 1 if this.Card has higher rank, or -1 if otherCard has higher rank.
	*/
	public int compareRank(Card otherCard)
	{
		if(this.getRank() > otherCard.getRank())
			return 1;
		else if(this.getRank() < otherCard.getRank())
			return -1;
		else
			return 0;
	}
}