import java.util.Scanner;
public class NLE1
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print ("Enter the first number: ");
		int f_number = scan.nextInt();
		System.out.print ("Enter the second number: ");
		int s_number = scan.nextInt();
		
		int counter1 = 0;
		int counter2 = 0;
		int product = 0;
		int quotient = f_number;
		
		while (counter1 != s_number)
		{
			product = product + f_number;
			counter1 = counter1 + 1;
		}
		
		System.out.print ("The product of " + f_number + " and " + s_number + " is: " + product);
		System.out.println ();
		
		if (f_number > s_number)
		{	
			while (quotient > s_number)
			{
				quotient = quotient - s_number;
				counter2 = counter2 + 1;
			}
			
			System.out.print ("The quotient of " + f_number + " and " + s_number + " is: " + counter2);
		}
		
		else if (s_number > f_number)
		{
			while (quotient > s_number)
			{
				quotient = quotient - s_number;
				counter2 = counter2 + 1;
			}
			
			System.out.print ("The quotient of " + f_number + " and " + s_number + " is: " + counter2);
		}
		
		else		
		{
			System.out.print ("The quotient of " + f_number + " and " + s_number + " is: 1");
			quotient = 0;	
		}
	
		System.out.println();
		System.out.println ("The modulo of " + f_number + " and " + s_number + " is: " + quotient);
	}
}