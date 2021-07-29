import java.util.Scanner;

class Practice1
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		int num = scan.nextInt();
		
		if (practice(num) == 0)
			System.out.println(num + 1);
		
		else
			System.out.println(practice(num));
	}
	
	public static int practice(int num)
	{
		if (num == 0)
			return 0;
		
		else
			return (practice(num/10) + 1);
			
	}
}	