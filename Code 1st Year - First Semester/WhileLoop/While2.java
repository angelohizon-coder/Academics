// while loop
import java.util.Scanner;
public class While2
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
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

		s.close();
	}
}
