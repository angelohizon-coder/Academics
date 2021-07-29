import java.util.*;

public class UseDinnerParty
{
	public static void main(String[] args)
	{
		int choice;
		int guests;
		DinnerParty aDinnerParty = new DinnerParty();

		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter number of guests for the part >> ");
		guests = keyboard.nextInt();
		aDinnerParty.setGuests(guests);
		
		System.out.print("Enter the menu opttion -- 1 for chicken or 2 for beef >> ");
		choice = keyboard.nextInt();
		aDinnerParty.setDinnerChoice(choice);
		System.out.println("Menu option " + aDinnerParty.getDinnerChoice() + " will be saved");
		
		System.out.println("The party has " + aDinnerParty.getGuests() + " guests");
		
		aDinnerParty.displayInvitation();
		
		keyboard.close();
	}
}