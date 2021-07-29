import java.util.Scanner;

public class Palindrome
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		Stack<Character> s1 = new Stack<Character>(20);
		Queue<Character> q1 = new Queue<Character>(20);
		
		Character stack = ' ';
		Character queue = ' ';
		
		System.out.print("Enter a word: ");
		String word = scan.next();
		
		for(int i = 0; i < word.length(); i++)
		{
			s1.push(word.charAt(i));
			q1.enqueue(word.charAt(i));
		}
		
		while(!s1.isEmpty())
		{
			if(s1.pop() == q1.dequeue())
				continue;
			
			else
				break;
		}
		
		if(s1.isEmpty())
			System.out.println("The word is a palindrome");
		
		else
			System.out.println("The word is NOT a palindrome");
		
		scan.close();
	}
}