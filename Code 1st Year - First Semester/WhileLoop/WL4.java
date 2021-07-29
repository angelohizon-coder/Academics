import java.util.Scanner;
public class WL4
{
	public static void main (String [] args)
	{		
		char repeat = ' ';
		
		do
		{
			Scanner scan = new Scanner (System.in);
			
			int counter = 0;
			int number = 1;
			
			while (counter != 9)
			{
				System.out.print (number + ", ");
				number = number + 1;
				counter = counter + 1;
			}
			
			System.out.println (number);
			
			System.out.print ("Would you like to repeat? [Y/N]: ");
			repeat = scan.next().toLowerCase().charAt(0);
			
		} 
		while (repeat == 'y');
	}
}