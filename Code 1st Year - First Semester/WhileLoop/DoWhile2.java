// do-while loop
import java.util.Scanner;
public class DoWhile2
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		char response;
		do
		{
			System.out.print("Enter lower bounds: ");
			int lower = s.nextInt();

			System.out.print("Enter upper bounds: ");
			int upper = s.nextInt();

			System.out.print("Enter your intervals: ");
			int interval = s.nextInt();

			while(lower <= upper)
			{
				System.out.println(lower);
				lower += interval;
			}
			System.out.print("Would you like to try again? ");
			response = s.next().toLowerCase().charAt(0);	// yn
		}
		while(response == 'y');
		s.close();
	}
}

