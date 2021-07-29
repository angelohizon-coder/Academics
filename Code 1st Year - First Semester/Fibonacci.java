import java.util.Scanner;

public class Fibonacci
{
	 public static void main(String[] args) 
	 {
	   
	  long start = System.nanoTime();		
		
	  Scanner scan = new Scanner(System.in);
	  System.out.print("Enter a number: ");
	  long length = scan.nextInt();
	   
	  System.out.println("FibonacciSeries Iterative...");
	  fibonacciSeriesIterative(length);
	
	  long end = System.nanoTime();
	  long elapsedTime = (end - start)/1000000000;
		
	  System.out.println("Elapsed time in seconds: " + elapsedTime);
	 }
	 
	 public static void fibonacciSeriesIterative(long length){
	  int a = -1;
	  int b =  1;
	   
	  int c = 0;
	  for (int i = 0; i < length; i++) 
	  {
	   c = a+b; 
	   System.out.print(c + ", ");
	   a = b;
	   b = c;
	  }
	 }
}
