import java.util.Scanner;
public class WL1
{
	public static void main (String [] args)
	{		
		Scanner scan = new Scanner (System.in);
				
		System.out.print ("Enter the base: ");
		long base = scan.nextInt();
				
		System.out.print ("Enter the exponent: ");
		long exponent = scan.nextInt();
		
		long counter = 0;
		long result = 1;
			
		while (counter != exponent)
		{
			 result = result * base;
			 counter = counter + 1;
		}
		System.out.print (base + " raised to the " + exponent + " power is: " + result);
	}
}