import java.util.Scanner;

public class PostFixEval2
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);	
		
		String decision = " "; 
		
		do
		{
			System.out.print("Expression: ");
			String expression = scan.nextLine();
			
			System.out.println(evalExp(expression));
			
			System.out.print("Again? ");
			decision = scan.nextLine();
		} while ("Yes".equals(decision));	
		
		scan.close();
	}
	
	static int evalExp(String expression)
	{
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i < expression.length(); i++)
		{
			char c = expression.charAt(i);
			
			System.out.print("Token " + c + "\t");
			
			if(Character.isDigit(c))
			{
				System.out.print("Push " + c);
				stack.push(c - '0');
			}
			
			else if(expression.charAt(i) == '~')
			{
				int first = stack.peek();
				int negate = (stack.peek()*-1);
				stack.pop();
				System.out.print("Pop " + expression.charAt(i-1) + " ");
				stack.push(negate);
				System.out.print("Push -" + expression.charAt(i-1));
				
			}
			
			else
			{
				int first = stack.peek();
				System.out.print("Pop " + first + "\t");
				stack.pop();
				
				int second = stack.peek();
				System.out.print("Pop " + second + "\t");
				stack.pop();
				
				if(!stack.isEmpty() && (c == '+' || c == '-' || c == '*' || c == '/'))
					System.out.println("Output Error");break;
				
				else
				{
					switch(c)
					{
						case '+': int add = second+first;
								  System.out.print("Push " + add);
								  stack.push(add);break;
						case '-': int subtract = second - first;
								  System.out.print("Push " + subtract);
								  stack.push(subtract);break;
						case '*': int multiply = second*first;
								  System.out.print("Push " + multiply);
								  stack.push(multiply);break;
						case '/': int divide = second/first;
								  System.out.print("Push " + divide);
								  stack.push(divide);break;
					}
				}
			}
			
			System.out.print("\n");
		}
		
		return stack.peek();
	}
}