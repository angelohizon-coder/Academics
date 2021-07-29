	public class Exer2
{
	public static void main (String args[])
	{
		{
			int a = 30, b = 6, c = 5;
			
			int largest = 0, smallest = 0;
			
			double ave = (a + b + c)/3.0;
			
			largest = a < b ? b : a;
			largest = largest < c ? c : largest;
			
			smallest = a < b ? a : b;
			smallest = smallest < c ? smallest : c;
			
			System.out.println ("The largest value is: " + largest);
			System.out.println ("The smallest value is: " + smallest);
			System.out.println ("The average is: " + ave);
			System.out.println (" ");
		}
		int x = 3;
		int y = 70;
		int z = 10;
		
		int average = (x + y + z)/3;
		
		System.out.println ((x > y) ? "The lowest highest is: " + x : "The highest value is: " + y);
		System.out.println ((x > z) ? "The lowest value is: " + z : "The lowest value is: " + x);
		System.out.println ("The average of the given is: " + average);
		
	}
}