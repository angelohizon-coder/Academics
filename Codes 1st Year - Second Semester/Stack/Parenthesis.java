import java.util.Scanner;

public class Parenthesis
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an expression: ");
		String expression = scan.nextLine();
		
		System.out.println(delimiters(expression));
		
		scan.close();
	}
	
	public static String delimiters(String s)
	{
		Stack<Character> stack = new Stack<>();
		
		String result = "";
		
		for(int i = 0; i < s.length(); ++i)
		{
			if(s.charAt(i) == '(')
			{
				stack.push(s.charAt(i));
			}
			
			else if(s.charAt(i) == ')')
			{
				if(stack.isEmpty())
				{
					result = "Invalid";
				}
				
				else if(!stack.isEmpty())
				{
					stack.pop();
					result = "Valid";
				}	
			}
		}
		
		if(!stack.isEmpty())
		{
			System.out.println("Incomplete Expression");
		}
		
		if(stack.isEmpty())
		{
			if(result == "Valid")
				System.out.println("Complete Expression");
			
			else
				System.out.println("Incomplete Expression");
		}
		
		return "";
	}
}