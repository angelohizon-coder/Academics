public class Factorial_Recursion
{
	public static void main (String args [])
	{
		int num1 = 5;
		int num2 = 4;
		
		System.out.println ("The factorial of " + num1 + "! is: " + getFactorial(num1, num2));
	}
	
	public static int getFactorial(int a, int b)
	{
		if (b == 1)
			return a;
		
		else
		{	
			a = a * b;
			b = b - 1;
			return getFactorial(a, b);
		}
	}
}