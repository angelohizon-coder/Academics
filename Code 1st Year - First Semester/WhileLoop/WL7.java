import java.util.Scanner;
public class WL7
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner (System.in);
		
		System.out.print ("Enter a number: ");
		int number = scan.nextInt();
		
		int result = 0;
		
		while (number != 0)
		{
			result = number % 10;
			System.out.print (result);
			number = number / 10;
		}
	}
}