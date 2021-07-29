public class MethodExample1
{
	public static void main(String args[])
	{
		int a, b, c;
		int x = getSum(10, 20);
		System.out.println(getSum('a', 'b'));
		System.out.println(getDiff(100, 200));
		System.out.println(getProd(100, 200));
		System.out.println(getQuo(100, 200));
	}
	public static int getSum(int a, int b)
	{
		return a + b;
	}
	public static int getDiff(int a, int b)
	{
		return a - b;
	}
	public static int getProd(int a, int b)
	{
		return a * b;
	}
	public static double getQuo(int a, int b)
	{
		return (double)a / b;
	}
}
