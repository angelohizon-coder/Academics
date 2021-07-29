public class FooBarBaz
{
	public static void main(String args[])
	{
		for (int i = 1; i <= 50; i++)
		{
			System.out.print(i);
			if (i % 3 == 0)
				System.out.print(" java");
			if (i % 5 == 0)
				System.out.print(" rocks");
			if (i % 7 == 0)
				System.out.print(" forever");
			System.out.println();
		}
	}
}
