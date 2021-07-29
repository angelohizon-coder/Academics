public class TernaryOptr2
{
	public static void main(String args[])
	{
		int febNoOfDays;
		int year = 2016;

		/*if (year % 4 == 0)
			febNoOfDays = 29;
		else 
			febNoOfDays = 28;*/

		febNoOfDays = (year % 4 == 0) ? 29 : 28;


		System.out.println("In the year " + year + 
			", February has " + febNoOfDays + " days.");
	}
}
