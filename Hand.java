public class Hand extends CardPile
{
	String name;

	public Hand()
	{
		super();
	}

	public Hand(String playerName)
	{
		super();

		name = playerName;
	}


	public String toString()
	{
		return name;
	}
}