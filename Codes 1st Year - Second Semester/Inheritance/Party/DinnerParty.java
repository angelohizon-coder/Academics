public class DinnerParty extends Party					//inherited attributes and behavior from party
{
	private int dinnerChoice;
	
	public void setDinnerChoice(int choice)
	{
		dinnerChoice = choice;
	}
	
	public int getDinnerChoice()
	{
		return dinnerChoice;
	}
}