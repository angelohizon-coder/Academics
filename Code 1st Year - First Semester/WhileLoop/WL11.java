import java.util.Scanner;
public class WL11
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner (System.in);
		
		System.out.print ("Enter a number: ");
		double number = scan.nextInt();
	
		double denominator = 1;
		double a = 0;
		double b = 0;
		double c = 0;
		double given = number;
		double counter = number;
		
		while (counter != 0)
		{
			a = 1/denominator;
			b = c;
			c = a + b;
			denominator = denominator + 1;
			counter = counter - 1;
		}
		
		System.out.print ("Result: " + c);
	}
}