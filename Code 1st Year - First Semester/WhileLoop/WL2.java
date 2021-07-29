import java.util.Scanner;
public class WL2
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner (System.in);
	
		int minus = 0;
		int result = 1;
		
		System.out.print ("Enter a number: ");
		int number = scan.nextInt();
		
		int given = number;
		int counter = number;
		
		if (number == 0)
		{
			System.out.print (given + "! is = 1");
		}
		
		else 
		{
			if (number < 0)
			{
				number = number * -1;
				counter = counter * -1;
				result = result * -1;
			}
			
			if (number > 0)
			{
				while (counter != 1)
				{
					result = result * number;
					number = number - 1;
					counter = counter - 1;
				}
			}
		}
		System.out.print (given + "! is = " + result);
	}
}