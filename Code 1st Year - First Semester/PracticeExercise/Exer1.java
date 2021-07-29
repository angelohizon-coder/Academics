public class Exer1
{
	public static void main (String args[])
	{
		{
			int num = 123;
			
			int hunds = num / 100; // 1
			int temp = num % 100; // 23
			
			int tens = temp / 10; // 2
			int ones = temp % 10; // 3
			
			System.out.println ("The reseverrse of " + num + " is " + ones + "" + tens + "" + hunds);
			System.out.println (" ");
		}
		
		int x = 123;
		
		int a = x%122;
		int b = x%121;
		int c = x%120;
		
		System.out.println ("The given value is: " + x + "\nThe reverse of the given value is: " + c + b + a);
	}
}