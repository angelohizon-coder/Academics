import java.util.Scanner;
public class WL12
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter letter A or a: ");
		char letter = scan.next().charAt(0);
		
		for (char i = letter; i < (letter + 26); i++)
		{
			System.out.print (i + " ");
		}
		
		System.out.println();
		System.out.println ("In reverse: ");
		
		for (char i = (char)(letter + 25); i>=letter; i--)
		{
			System.out.print (i + " ");
		}
		
		System.out.println();
		System.out.println ("Consonants only");
		
		for (char i = letter; i < (letter + 26); i++)
		{				
			if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u')
			{
				continue;
			}
			
			System.out.print (i + " ");
		}
		
		System.out.println();
		System.out.println ("In reverse consonants only: ");

		for (char i = (char)(letter + 25); i>= letter; i--)
		{
			if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u')
			{
				continue;
			}
			
			System.out.print (i + " ");
		}
		
		System.out.println();
		System.out.println ("Vowels only");
		
		for (char i = letter; i <= (letter + 26); i++)
		{				
			if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u')
			{
				System.out.print (i + " ");
			}
			
			else
			{
				continue;
			}
		}
		
		System.out.println();
		System.out.println ("In reverse vowels only: ");

		for (char i = (char)(letter + 25); i>= letter; i--)
		{
			if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u')
			{
				System.out.print (i + " ");;
			}
			
			else
			{
				continue;
			}
		}
	}
}