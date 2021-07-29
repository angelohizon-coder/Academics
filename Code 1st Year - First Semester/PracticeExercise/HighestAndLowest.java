public class HighestAndLowest
{
	public static void main (String args[])
	{
		int x = 3;
		int y = 70;
		int z = 10;
		
		int average = (x + y + z)/3;
		
		System.out.println ((x > y) ? "The lowest highest is: " + x : "The highest value is: " + y);
		System.out.println ((x > z) ? "The lowest value is: " + z : "The lowest value is: " + x);
		System.out.println ("The average of the given is: " + average);
		
	}
}