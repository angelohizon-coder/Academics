import java.util.Scanner;
public class ForExample3
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String value: ");
		String str = s.next();

		for (int i = 0; i < str.length(); i++)
		{
			System.out.println(str.charAt(i));
		}

		s.close();
	}
}
