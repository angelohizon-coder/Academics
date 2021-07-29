// display a word value for each vowel
import java.util.Scanner;
public class Switch2
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = s.next().charAt(0);

		switch(ch)
		{
			case 65 : ;
			case 'a': System.out.println("Alpha"); break;
			case 'E':
			case 'e': System.out.println("Echo"); break;
			case 'I':
		
			default : System.out.println("not a vowel.");

			case 'i': System.out.println("India"); break;
			case 'O':
			case 'o': System.out.println("Oscar"); break;
			case 'U':
			case 'u': System.out.println("Uniform"); break;
		}

		s.close();
	}
}

