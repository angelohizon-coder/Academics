import java.util.Scanner;
public class WL8
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner (System.in);
		int positive = 0;
		int negative = 0;
		int zero = 0;
		char repeat = ' ';
			
		do
		{	
			System.out.print ("Enter a number: ");
			int number = scan.nextInt();
			
			if (number > 0)
			positive = positive + 1;
			
			else if (number < 0)
			negative = negative + 1;
			
			else 
			zero = zero + 1;
		
			System.out.print ("Would you like to enter another number? [Y/N]: ");
			repeat = scan.next().toLowerCase().charAt(0);
		} while (repeat == 'y');
		
		System.out.print ("Positive: " + positive + "\nNegative: " + negative + "\n    Zeros: " + zero);
	}
}