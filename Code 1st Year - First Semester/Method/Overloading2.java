// var-args, java ver 5
public class Overloading2
{
	public static void main(String... args)
	{
		System.out.println(getSum("First: ", 100, 200));
		System.out.println(getSum("Second: ", 100, 200, 300));
		System.out.println(getSum("Third: ", 100, 200, 300, 400));
		System.out.println(getSum("Last: ", 10, 20, 30, 40, 50,
					  60, 70, 80, 90, 100));

	}
	public static int getSum(String str, int... num)
	{
		System.out.print(str);
		int sum = 0;
		for (int n : num)
		{
			sum += n;
		}
		return sum;
	}
}
