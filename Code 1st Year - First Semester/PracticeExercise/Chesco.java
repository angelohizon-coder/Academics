import java.util.Scanner;
import java.util.*;

public class Chesco
{
	public static void main(String args[])
	{
		//variable
		int counterLetter = 0;
		int counterSpace = 0;
		int counterDigit = 0;
		int counterOther = 0;

		//array
		char letter[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 
						   'x', 'y', 'z'};
		char number[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};		
		char other[] = {'.', '?', '!', ',', ';', ':', '-', '[', ']', '{', '}', '(', ')', '"', '\'', '@', '#', '$', '%', '^', '&', '*', '_', '+', '=', 
					   '+', '|', '\\', '/', '`', '~'};
		char space[] = {' '};
		
		//input scan 
		Scanner scan = new Scanner(System.in).useDelimiter("\n");
		
		System.out.print ("Enter a String: ");
		String input = scan.next();
		
		//convert string to character array
		char inputConverted[] = input.toCharArray();
		
		for (int i = 0; i < input.length(); i++)
		{
			for (int j = 0; j < letter.length; j++)
			{
				if (inputConverted[i] == letter[j])
					counterLetter++; 
				
				else if (inputConverted[i] != letter[j])
					continue;
			}
			
			for (int j = 0; j < number.length; j++)
			{
				if (inputConverted[i] == number[j])
					counterDigit++;
				
				else if (inputConverted[i] != number[j])
					continue;
			}
			
			for (int j = 0; j < other.length; j++)
			{
				if (inputConverted[i] == other[j])
					counterOther++;
				
				else if (inputConverted[i] != other[j])
					continue;
			}
			
			for (int j = 0; j < space.length; j++)
			{
				if (inputConverted[i] == space[j])
					counterSpace++;
				
				else if (inputConverted[i] != space[j])
					continue;
			}
		}
		
		double sum = counterDigit + counterLetter + counterOther + counterSpace;
		double percentageLetter = (counterLetter/sum) * 100;
		double percentageSpace = (counterSpace/sum) * 100;
		double percentageDigit = (counterDigit/sum) * 100;
		double percentageOther = (counterOther/sum) * 100;
		
		System.out.println ("Category"  + "\t" +  "How Many?" + "\t" + "% of file");
		System.out.println ("______________________________________");
		System.out.println ("Letters" + "\t" + "\t   " + counterLetter + "\t   " + "\t  " + percentageLetter);
		System.out.println ("WhiteSpaces" + "\t   " + counterSpace + "\t   " + "\t  " + percentageSpace);
		System.out.println ("Digits" + "\t" + "\t   " + counterDigit + "\t   " + "\t  " + percentageDigit);
		System.out.println ("Punctuations" + "\t   " + counterOther + "\t   " + "\t  " + percentageOther);
		System.out.println ("Total" + "\t" +  "\t" +  "\t" +  "\t  " + (percentageLetter + percentageSpace + percentageDigit + 
							percentageOther));
		
	}
}