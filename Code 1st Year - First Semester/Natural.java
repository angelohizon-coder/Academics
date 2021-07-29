public class Natural
{
	public static void main (String args[])
	{
		int naturalNumber = -1;
		
		if (naturalNumber < 0)
			System.out.println("Invalid Input");
		
		else
			System.out.print(natural(naturalNumber));
	}
	
	public static int natural(int naturalNumber)
	{
		int result = naturalNumber - 1;
		
		if (result == 0)
			return 0;
		
		return naturalNumber;
	}
}