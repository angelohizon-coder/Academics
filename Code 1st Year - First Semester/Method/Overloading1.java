public class Overloading1
{
	public static void main(String args[])
	{
		System.out.println(getSum('a', 'b'));
		System.out.println(getSum(100, 200));
		System.out.println(getSum(100, 200, 300));
		System.out.println(getSum(100, 200, 300, 400));
	}
	public static int getSum(int a, int b)
	{
		return a + b;
	}
	public static int getSum(int a, int b, int c)
	{
		return a + b + c;
	}
	public static int getSum(int a, int b, int c, int d)
	{
		return a + b + c + d;
	}
}
