import java.util.Scanner;

public class FibonacciIterative
{
	public static void main(String args[])
	{		
		long start = System.nanoTime();		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		long a = scan.nextInt();
		long x = 1;
		long y = 1;
		long z = 0;
		
		System.out.println("Fibonacci(Iterative): " + fibonacciIterative(a, x, y, z));
		
		scan.close();
		
		long end = System.nanoTime();
		long elapsedTime = (end - start)/1000000000;
		
		System.out.println("Elapsed time in seconds: " + elapsedTime);
	}
	
	public static long fibonacciIterative(long a, long x, long y, long z)
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
}