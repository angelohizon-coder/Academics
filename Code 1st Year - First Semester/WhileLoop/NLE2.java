import java.util.Scanner;
public class NLE2
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner (System.in);
		
		System.out.print ("Enter the first number: ");
		int first = scan.nextInt();
		
		System.out.print ("Enter the second number: ");
		int second = scan.nextInt();
		
		int counter = 0;
		int product;
		int quotient = 0;
		int modulo = first;
		
		/*while (counter != second)
		{
			product = product + first;
			counter = counter + 1;
		}*/
		
		for (product = 0; counter != second; counter++)
		{
			product = product + first;
		}
		
		System.out.println ();
		System.out.print ("The product of " + first + " and " + second + " is: " + product);
		
		if (first > second || first < second)
		{
			while (modulo > second)
			{
				modulo = modulo - second;
				quotient = quotient + 1;
			}
			
		}
		
		else
		{
			quotient = 1;
			modulo = 0;
		}
		
		System.out.println ();
		System.out.print ("The quotient of " + first + " and " + second + " is: " + quotient);
		System.out.println ();
		System.out.print ("The modulo of " + first + " and " + second + " is: " + modulo);
	}
}