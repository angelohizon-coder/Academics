public class Recursion
{
	/*public static void main (String args[])
	{
		int n = 730;
	
		System.out.println (n + " = " + getRecursion(n));
	}
	
	public static int getRecursion(int a)
	{
		if (a < 10)
			return a;
		
		else
			return  getRecursion(a/10) + a%10;
		
	}*/
	
	/*public static void main (String args [])
	{
		int n = 12;
		
		System.out.println (n + " = " + getRecursion(n));
	}
	
	public static int getRecursion(int a)
	{
		if (a == 0)
			return a;
		
		else
			return getRecursion(a-1) + a;
	}*/
	
	public static void main (String args [])
	{
		int x = 5;
		int y = 4;
		
		System.out.println(x + " x " + y + " = " + getRecursion(x, y));
	}
	
	public static int getRecursion(int a, int b)
	{
		if (b == 1)
			return a;
		
		else
			return a + getRecursion(a, b - 1);
	}
}
	
	/*public static void main (String args[])
	{
		int x = 5;
		int y = 3	;
		
		System.out.println (x + " raised to " + y + " = " + getRecursion(x,y));
	}
	
	public static int getRecursion(int a, int b)
	{
		if (b == 1)
			return a;
		
		else 
			return a * getRecursion(a, b - 1);
	}*/
	
	/*public static void main (String args[])
	{
		int i = 100;
		int j = 2;
		
		System.out.println (i + " " + j + getRecursion(i, j));
	}
	
	public static int getRecursion(int a, int b)
	{
		if (a == 1)
			return 1;
		if (a % b == 0)
			return 0;
		else 
			return getRecursion(a, b - 1);
	}
}*/

/*import java.util.Scanner;

public class Recursion {

	// method to check number is prime or not
	static boolean isPrime(int num) {
		boolean flag = true;
		for (int i = 2; i <= (num / 2); i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		int n = 541;

		for (int loop = 2; loop <= n; loop++) {
			if (isPrime(loop) == true)
				System.out.print(loop + " ");
		}
	}
}*/

/*public class Recursion
{
	public static void main (String args [])
	{
		
	}
}*/