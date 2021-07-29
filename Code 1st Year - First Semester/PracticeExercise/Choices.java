import java.util.Scanner;
public class Choices
{
	public static void main (String args [])
	{
		System.out.println("What brand is your laptop");
		Scanner laptop = new Scanner (System.in);
		String brand = laptop.nextLine();
		
		System.out.println ("Nice your laptop brand is " + brand);
	}
}