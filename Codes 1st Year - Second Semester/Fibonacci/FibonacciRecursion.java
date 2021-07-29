import java.util.Scanner;

public class FibonacciRecursion
{
	public static void main(String args[])
	{
		long start = System.nanoTime();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		long a = scan.nextInt();

		System.out.println("Fibonacci(Recursion): " + fibonacciRecursion(a));
		
		scan.close();
		
		long end = System.nanoTime();
		long elapsedTime = (end - start)/1000000000;
		
		System.out.println("Elapsed time in seconds: " + elapsedTime);
	}
	
	public static long fibonacciRecursion(long a)
	{				
		if (a >= 3)
			return fibonacciRecursion(a - 1) + fibonacciRecursion(a - 2);
		
		else
			return 1;
	}
}