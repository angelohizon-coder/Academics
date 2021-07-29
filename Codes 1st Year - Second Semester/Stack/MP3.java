public class MP3
{
	public static void main(String args[])
	{
		String expression = "7~53+-";
		
		System.out.println(evalExp(expression));
	}
	
	static int evalExp(String expression)
	{
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i < expression.length(); i++)
		{
			char c = expression.charAt(i);
			
			if(Character.isDigit(c))
				stack.push(c - '0');
			
			else
			{
				int first = stack.peek();
				stack.pop();
				int second = stack.peek();
				stack.pop();
				
				switch(c)
				{
					case '+': System.out.println(stack.push(second+first));break;
					case '-': System.out.println(stack.push(second-first));break;
					case '*': System.out.println(stack.push(second*first));break;
					case '/': System.out.println(stack.push(second/first));break;
				}
			}
		}
		
		return stack.peek();
	}
}