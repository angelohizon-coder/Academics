import java.util.Scanner;

public class Fibonacci
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int a = scan.nextInt();
		int x = 1;
		int y = 1;
		int z = 0;
		
		System.out.println("Fibonacci(Iterative): " + fibonacciIterative(a, x, y, z));
		System.out.println("Fibonacci(Recursion): " + fibonacciRecursion(a));
		
		scan.close();
	}
	
	public static int fibonacciIterative(int a, int x, int y, int z)
	{	
		if (a == 0)
			return 1;

		for (int ctr = 0; ctr < a; ctr++)
		{
			x = y;
			y = z;
			z = x + y;
		}
		
		return z;
	}
	
	public static int fibonacciRecursion(int a)
	{				
		if (a >= 3)
			return fibonacciRecursion(a - 1) + fibonacciRecursion(a - 2);
		
		else
			return 1;
	}
}