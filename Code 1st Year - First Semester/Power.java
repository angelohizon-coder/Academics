public class Power
{
	public static void main(String args[])
	{
		int base = 5;
		int exponent = 3;
		
		System.out.print(power(base, exponent));
	}
	
	public static int power(int base, int exponent)
	{
		if (exponent > 0)
			return power(base, exponent - 1) * base;
		
		else
			return 1;
	}
}
