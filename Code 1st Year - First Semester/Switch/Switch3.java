// display a word value for each vowel ver2
import java.util.Scanner;
public class Switch3
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = s.next().charAt(0);

		switch(ch)
		{
			default : System.out.println("not a vowel."); break;
			
			case 'O':
			case 'o': System.out.println("Oscar"); break;

			case 'E':
			case 'e': System.out.println("Echo"); break;
			
			case 'I':
			case 'i': System.out.println("India"); break;
			
			case 'U':
			case 'u': System.out.println("Uniform"); break;
	
			case 65:
			case 97: System.out.println("Alpha");
		}

		s.close();
	}
}


