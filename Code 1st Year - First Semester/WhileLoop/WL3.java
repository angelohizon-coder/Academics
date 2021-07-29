import java.util.Scanner;
public class WL3
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner (System.in);
		
		System.out.print ("Enter a number: ");
		int number = scan.nextInt();
		
		int counter = number;
		int a = 1;
		int b = 1;
		int c = 0;
		
		while (counter != 0)
		{
			if (number == 1)
			{
				System.out.print (a);
				counter = counter - 1;
				return;
			}
			
			else if (number == 2)
			{
				System.out.print (b);
				counter = counter - 2;
				return;
			}
			
			else
			{
				a = b;
				b = c;
				c = a + b;
				counter = counter - 1;
			}
		}
		
		System.out.print (c);
		scan.close();
	}
}