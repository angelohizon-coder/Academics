// consonant or vowels or numbers or symbols
import java.util.Scanner;
public class If3
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = s.next().toLowerCase().charAt(0);
	

		if (Character.isLetter(ch))  {
			// System.out.println(ch + " is a letter");
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println(ch + " is a vowel.");
			}
			else  {
				System.out.println(ch + " is a consonant.");
			}	
		}
		else if (Character.isDigit(ch)) {
			System.out.println(ch + " is a number.");
		}
		else {
			System.out.println(ch + " is a symbol.");
		}

		s.close();
	}
}

