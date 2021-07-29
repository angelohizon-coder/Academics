public class PreFixEval2
{
	public static void main(String args[])
	{
		String expression = "+9*26";
		
		System.out.println(evalExp(expression));
	}
	
	static Boolean isOperand(char c)
	{
		if(c >= 48 && c <= 57)
			return true;
		
		else
			return false;
	}
	
	static int evalExp(String expression)
	{
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i = expression.length() - 1; i >= 0 ; i--)
		{
			if(isOperand(expression.charAt(i)))
				stack.push((int)(expression.charAt(i) - 48));
			
			else
			{
				int first = stack.peek();
				stack.pop();
				
				int second = stack.peek();
				stack.pop();
				
				switch(expression.charAt(i))
				{
					case '+': stack.push(first+second);break;
					case '-': stack.push(first-second);break;
					case '*': stack.push(first*second);break;
					case '/': stack.push(first/second);break;
				}
			}
		}
		
		return stack.peek();
	}
}