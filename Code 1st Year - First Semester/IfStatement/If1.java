import java.util.Scanner;                                                //accept input from the user

public class If1
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);                              //scanner object
		System.out.print("Enter a year: ");
		int year = s.nextInt();                                          //accepting a value

		// check if the year is a leap year or NOT.
		if (year % 4 == 0)  {
			System.out.println(year + " is a leap year.");
		}
		else {
			System.out.println(year + " is NOT a leap year.");
		}
	
		s.close();
	}
}

// char ch = s.next ().chart (0) // 0 indicates the first letter of the word
// .nextInt().nextInt().nextInt(); // 3 numbers are required to be input by the user