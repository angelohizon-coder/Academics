import java.util.Scanner;

public class MP1_8
{
	public static void main(String args[])
	{		
		int ctr = 0;
		int digit = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number of Items[1-10]: ");
		int index =  scan.nextInt();
		
		int[] array = new int[index];
		
		for(int i = 0; i < array.length; i++)
		{
			System.out.print("Enter item number " + (i+1) + ":");
			int num = scan.nextInt();
			
			array[i] = num;
			
			if (i+1 == array.length)
			{	
				System.out.print("Enter item number: ");
				digit = scan.nextInt();
				System.out.println("The number of items greater than zero: " + checker1(array, ctr, index));
				System.out.println("Item " + digit + " is found in index " + checker2(array, digit, i));
			}
		}
	}
	
	/*public static int checker1(int i, int ctr)
	{	
		if (i > 0)
		{
			ctr = ctr + 1;
			return ctr;
		}
		
		return ctr;
	}*/
	
	public static int checker1(int[] array, int ctr, int i)
	{	
		if (i == 0)
			return ctr;
		
		else if (array[i] > 0)
			return (checker1(array, ctr+1, i-1));
		
		else 
			return (checker1(array, ctr, i-1));
	}
	
	public static int checker2(int[] array, int digit, int i)
	{
		if (i == digit)
			return array[i];
		
		return (checker2(array, digit, i-1));
	}
}