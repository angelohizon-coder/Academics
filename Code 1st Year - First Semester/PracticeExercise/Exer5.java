import java.util.Scanner;
public class Exer5
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner (System.in);
		
		System.out.print ("Input first number: ");
		int x = scan.nextInt();
		scan.nextLine();
		
		System.out.print ("Input second number: ");
		int y = scan.nextInt();
		scan.nextLine();
		
		System.out.println (x + " x " + y + " = " +(x*y));
	}
}