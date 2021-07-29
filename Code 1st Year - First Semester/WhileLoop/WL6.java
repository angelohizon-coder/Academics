import java.util.Scanner;
public class WL6
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner (System.in);
		
		System.out.print ("Enter a number: ");
		int number = scan.nextInt();
		
		System.out.print ("Enter a limit: ");
		int limit = scan.nextInt();
		
		if (number > 0)
		{
			int answer = 0;
			int counter = 0;
			int multiplier = 1;
		
			while (counter != limit)
			{
				answer = number * multiplier;
				System.out.println (number + "x" + multiplier + " = " + answer);
				multiplier = multiplier + 1;
				counter = counter + 1;
			}
		}
		
		else
		System.out.print ("Invalid Input");
	}
}


