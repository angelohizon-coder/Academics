import java.util.Scanner;
public class WL9
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner (System.in);
	
		int greater = 0;
		int lesser = 0;
		char repeat = ' ';
		
		do
		{
			System.out.print ("Enter a number: ");
			int number = scan.nextInt();
			
			if (number > greater)
			{
				greater = number;
			}
			
			else if (number < lesser)
			{
				lesser = number;
			}
			
			System.out.print ("Would you like to repeat? [Y/N]: ");
			repeat = scan.next().toLowerCase().charAt(0);
		} while (repeat == 'y');
		
		System.out.print ("Largest Number: " + greater + "\nSmallest Number: " + lesser);
	}
}