import java.util.Scanner;

public class MP1_8
{
	public static void main(String args[])
	{		
		int ctr = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number of Items[1-10]: ");
		int index =  scan.nextInt();
		
		int[] array = new int[index];
		
		System.out.println("Enter item number: ");
		int digit = scan.nextInt();
		
		for(int i = 0; i < array.length; i++)
		{
			System.out.print("Enter item number " + (i+1) + ":");
			int num = scan.nextInt();
			ctr = (checker1(num, ctr));
			digit = (checker2(i, digit));
			
			if (i+1 == array.length)
			{	
				System.out.println("The number of items greater than zero: " + ctr);
				System.out.println("Item " + digit + " is found in index " + i);
			}
		}
	}
	
	public static int checker1(int i, int ctr)
	{	
		if (i > 0)
		{
			ctr = ctr + 1;
			return ctr;
		}
		
		return ctr;
	}
	
	
	public static int checker2(int num, int digit)
	{
		if (num == digit)
		{
			return digit;
		}
		
		return 0;
	}
}