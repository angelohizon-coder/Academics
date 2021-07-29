import java.util.Scanner;

public class MultipleChoice
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner (System.in);
		
		System.out.println ("Instruction: Enter a letter from a-e ");
		System.out.print ("Enter your answer: ");
		char answer = scan.next().toLowerCase().charAt(0);
		
		// char answer = scan.next().charAt(0).toLowerCase(); there will be an error that will pop-out saying "dereference" 
		
		switch (answer)
		{
			case 'a': case 'A': System.out.println ("READ MANGA"); break;
			case 'b': case 'B': System.out.println ("READ MANHWA/WEBTOON"); break;
			case 'c': case 'C': System.out.println ("READ MANHUA"); break;
			case 'd': case 'D': System.out.println ("WATCH ANIME"); break;
			case 'e': case 'E': System.out.println ("WATCH YOUTUBE"); break;
			default: System.out.println ("INVALID ANSWER"); break;
		}

		
	}
}