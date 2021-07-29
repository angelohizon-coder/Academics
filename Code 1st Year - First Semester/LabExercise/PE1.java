import java.util.Scanner;
public class PE1
{
	public static void main (String args[])
	{
		Scanner scan = new Scanner (System.in);
		
		System.out.println ("Enter your birthday");
		System.out.print ("Month: ");
		String month = scan.next();
		System.out.print ("Day: ");
		int day = scan.nextInt();
		System.out.print ("Year: ");
		int year = scan.nextInt();
		
		int leap = year % 4;
		
		switch (leap)
		{
			case 0: System.out.println ("You birthday is on " + month + " " + day + ", " + year + ", " + "it is a leap year.");
			break;
			default : System.out.println ("You birthday is on " + month + " " + day + ", " + year + ", " + "it is NOT a leap year.");
		}
	}
}
