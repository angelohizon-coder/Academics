import java.util.Scanner;

public class LuckyNumbers
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner (System.in);
		
		byte day = 0;
		byte month = 0;
		byte year = 0;
		char repeat = ' ';
		
		do
		{
			System.out.print ("Enter your month of birth (MM): ");
			month = scan.nextByte();
			if (month <= 12)
			{
				month = month;
				
				System.out.print ("Enter your date of birth (DD): ");
				day = scan.nextByte();
				
				if (day == 2 || day == 4 || day == 6 || day == 9 || day == 11)
				{
					if (day == 2)
					{
						if (day <= 28)
						{
							day = day;
						}
						
						else 
						{
							System.out.print ("Invalid Input");
							return;
						}
					}
					
					else 
					{
						if (day <= 30)
						{
							day = day;
						}
						
						else
						{
							System.out.print ("Invalid Input");
							return;
						}
					}
				}
				
				else 
				{
					if (day <= 31)
					{
						day = day;
					}
					
					else 
					{
						System.out.print ("Invalid Input");
						return;
					}
				}
			}
			else
			{
				System.out.print ("Invalid Input");
				return;

			}		

			System.out.print ("Enter your year of birth (YY): ");
			year = scan.nextByte();
			if (year <= 99 && year >= 00)
			{
				year = year;
			}
			
			else 
			{
				System.out.print ("Invalid Input");
				return;
			}
			
			System.out.println ("Lucky 3 numbers! Itaya mo na yan!!");
			System.out.print (month << 2);
			System.out.print (", ");
			System.out.print (day >> 2);
			System.out.print (", ");
			System.out.println (((day/month) * year) % 5 + 10);
			
			System.out.print ("Repeat(Y/N)");
			repeat = scan.next().charAt(0);
			if (repeat == 'Y' || repeat == 'y' || repeat == 'N' || repeat == 'n')
			{
				repeat = repeat;
			}
			
			else
			{
				System.out.print ("Invalid Input");
				return;
			}
		} while (repeat == 'Y' || repeat == 'y');
	}
}