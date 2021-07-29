// display the number in words for 1 to 5
import java.util.Scanner;
public class Switch1
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number from 1 to 5 only: ");
		int num = s.nextInt();

		switch(num)
		{
			case 1: System.out.println("One");
				break;
			case 2: System.out.println("Two");
				break;
			case 3: System.out.println("Three");
				break;
			case 4: System.out.println("Four");
				// break;
			case 5: System.out.println("Five");
				// break;
			default: System.out.println("Number is out of bounds, 1 to 5 only.");
		}
		s.close();
	}
}
