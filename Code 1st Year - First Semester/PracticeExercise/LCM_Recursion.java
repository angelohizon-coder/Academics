public class LCM_Recursion
{
	public static void main (String args[])
	{
		int num1 = 24, num2 = 8;
		
		System.out.println ("The LCM of " + num1 + " and " + num2 + " is " + findLCM(num1, num2));
	}
	
	public static int findLCM (int a, int b)
	{
		if (a % b == 0)
			return a;
		else
			return findLCM(a + a, b);
	}
}