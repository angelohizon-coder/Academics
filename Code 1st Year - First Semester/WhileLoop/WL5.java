public class WL5
{
	public static void main (String [] args)
	{
		int number = 1;
		int counter = 0;
		int result = 0;
		
		while (counter != 10)
		{
			result = result + number;
			number = number + 1; 
			counter = counter + 1;
		}
		
		System.out.print ("Sum: " + result);
	}
}