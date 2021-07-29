import java.util.Scanner;
public class LE3
{
	public static void main (String args[])
	{
		Scanner scan = new Scanner (System.in);
		
		System.out.print ("Please enter a number: ");
		int number = scan.nextInt();
		
		//Numbers greater or equal to -999 and less or equal to -1
		if (number >= -999 && number <= -1)
		{
			//Negative print out
			System.out.print ("negative ");
			
			//Formula for hundred place
			int hundreds = (number / 100)*-1;
			
			//Choices for the hundred place
			switch (hundreds)
			{
				case 1: System.out.print ("one hundred "); break;
				case 2: System.out.print ("two hundred "); break;
				case 3: System.out.print ("three hundred "); break;
				case 4: System.out.print ("four hundred "); break;
				case 5: System.out.print ("five hundred "); break;
				case 6: System.out.print ("six hundred "); break;
				case 7: System.out.print ("seven hundred "); break;
				case 8: System.out.print ("eight hundred "); break;
				case 9: System.out.print ("nine hundred "); break;
			}
			
			//Formula for ten place
			int tens = (number % 100)*-1;
			
			//Option a(11 to 19), b(10), and c(20,30,40,50,60,70,80,90 and one digit numbers)
			if (tens >= 11 && tens <= 19)
			{
				//Option A
				switch (tens)
				{
					case 11: System.out.print ("eleven"); break;
					case 12: System.out.print ("twelve"); break;
					case 13: System.out.print ("thitreen"); break;
					case 14: System.out.print ("fourteen"); break;
					case 15: System.out.print ("fifteen"); break;
					case 16: System.out.print ("sixteen"); break;
					case 17: System.out.print ("seventeen"); break;
					case 18: System.out.print ("eighteen"); break;
					case 19: System.out.print ("nineteen"); break;
				}
			}
			
			else
			{
				//Option B
				if (tens == 10)
				{
					System.out.println ("ten");
				}
				
				else 
				{
					//Option C
					tens = ((number % 100) / 10)*-1;
					
					//Choices for ten places for option c
					switch (tens)
					{
						case 2: System.out.print ("twenty "); break;
						case 3: System.out.print ("thirty "); break;
						case 4: System.out.print ("fourty "); break;
						case 5: System.out.print ("fifty "); break;
						case 6: System.out.print ("sixty "); break;
						case 7: System.out.print ("seventy "); break;
						case 8: System.out.print ("eighty "); break;
						case 9: System.out.print ("ninety "); break;
					}
					
					int ones = ((number % 100) % 10)*-1;
					
					//Choices for one places for option c
					switch (ones)
					{
						case 1: System.out.print ("one"); break;
						case 2: System.out.print ("two"); break;
						case 3: System.out.print ("three"); break;
						case 4: System.out.print ("four"); break;
						case 5: System.out.print ("five"); break;
						case 6: System.out.print ("six"); break;
						case 7: System.out.print ("seven"); break;
						case 8: System.out.print ("eight"); break;
						case 9: System.out.print ("nine"); break;
					}
				}
			}	
		}
		
		//Numbers greater or equal to 1 and less or equal to 999
		else if (number >= 1 && number <= 999)
		{
			int hundreds = number / 100;
			
			switch (hundreds)
			{
				case 1: System.out.print ("one hundred "); break;
				case 2: System.out.print ("two hundred "); break;
				case 3: System.out.print ("three hundred "); break;
				case 4: System.out.print ("four hundred "); break;
				case 5: System.out.print ("five hundred "); break;
				case 6: System.out.print ("six hundred "); break;
				case 7: System.out.print ("seven hundred "); break;
				case 8: System.out.print ("eight hundred "); break;
				case 9: System.out.print ("nine hundred "); break;
			}
			
			//Getting the ten place value of the number including the one place
			int tens = (number % 100);
			
			//Values greater than or equal to 11 and less than or equal to 11
			if (tens >= 11 && tens <= 19)
			{
				switch (tens)
				{
					case 11: System.out.print ("eleven"); break;
					case 12: System.out.print ("twelve"); break;
					case 13: System.out.print ("thitreen"); break;
					case 14: System.out.print ("fourteen"); break;
					case 15: System.out.print ("fifteen"); break;
					case 16: System.out.print ("sixteen"); break;
					case 17: System.out.print ("seventeen"); break;
					case 18: System.out.print ("eighteen"); break;
					case 19: System.out.print ("nineteen"); break;
				}
			}
			
			//If the value is not filtered from the previous switch case then it will continue to proceed here
			else
			{
				//Exlusive valu for tens as it does not have any one place digit
				if (tens == 10)
				{
					System.out.println ("ten");
				}
				
				//Choices for the ten place digit
				else 
				{
					tens = (number % 100) / 10;
					
					switch (tens)
					{
						case 2: System.out.print ("twenty "); break;
						case 3: System.out.print ("thirty "); break;
						case 4: System.out.print ("fourty "); break;
						case 5: System.out.print ("fifty "); break;
						case 6: System.out.print ("sixty "); break;
						case 7: System.out.print ("seventy "); break;
						case 8: System.out.print ("eighty "); break;
						case 9: System.out.print ("ninety "); break;
					}
					
					int ones = (number % 100) % 10;
					
					//Choices for the single place digit
					switch (ones)
					{
						case 1: System.out.print ("one"); break;
						case 2: System.out.print ("two"); break;
						case 3: System.out.print ("three"); break;
						case 4: System.out.print ("four"); break;
						case 5: System.out.print ("five"); break;
						case 6: System.out.print ("six"); break;
						case 7: System.out.print ("seven"); break;
						case 8: System.out.print ("eight"); break;
						case 9: System.out.print ("nine"); break;
					}
				}
			}	
		}
		
		//Number equals to 0
		else if (number == 0)
		{
			System.out.println ("zero");
		}
		
		//Number greater than 1000 or less than -1000
		else if (number > 1000 || number < -1000)
		{
			System.out.println ("Invalid Value");
		}
	}
}