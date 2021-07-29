import java.util.Scanner;
public class WL10
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print ("Enter a number [1-500]: ");
		int number = scan.nextInt();
		
		int given = number;
		int modulo = 0;
		int counter =  0;
		int ones = 0;
		int tens = 0;
		int hundreds = 0;
		
		
		while (number != 0)
		{
			modulo = number % 10;
			counter = counter + 1;
			
			if (counter == 1)
			{
				ones = modulo;
				ones = ones * ones * ones;
			}
			
			else if (counter == 2)
			{
				tens = modulo;
				tens = tens * tens * tens;
			}
			
			else if (counter == 3)
			{
				hundreds = modulo;
				hundreds = hundreds * hundreds * hundreds;
			}
			
			number = number / 10;
		}
		
		int answer = ones + tens + hundreds;
		
		if (given == answer)
		{
			System.out.print ("The given and result number " + answer + " is an Armstrong Number");
		}
		
		else
		{
			System.out.print ("Answer: " + answer);
		}
	}
}