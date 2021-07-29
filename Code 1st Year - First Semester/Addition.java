public class Addition
{
	public static void main(String args[])
	{
		int a = 0;
		int b = 37;
		
		System.out.print(Addition(a,b));
	}
	
	public static int Addition(int a, int b)
	{
		int c = a + b;
		
		if (c == 61)
			return c;
		
		return 0;
	}
}