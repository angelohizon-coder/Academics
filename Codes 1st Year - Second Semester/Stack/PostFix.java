public class PostFix
{
	public static void main(String [] args)
	{
		String expression = "(A+B)*(C/D)";
		String result = inToPost(expression);
		
		System.out.println("Given Expression: " + expression);
		System.out.println("Postfix Expression: " + result);
		System.out.println("Infix Expression: " + getInfix(result));
		
	}
	
	static String inToPost(String expression)
	{
		Stack<Character> stack = new Stack<>();
		
		String result = "";
		
		for(int i = 0; i < expression.length(); i++)
		{
			char c = expression.charAt(i);
			
			if(Character.isLetterOrDigit(c))
				result = result + c;
			
			else if (c == '(')
				stack.push(c);
			
			else if (c == ')')
			{
				while(!stack.isEmpty() && stack.peek() != '(')
					result += stack.pop();

				if(!stack.isEmpty() && stack.peek() != '(')
					return "Invalid Expression";
				
				else
					stack.pop();
			}
			
			else
			{
				while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek()))
				{ 
                    if(stack.peek() == '(') 
                        return "Invalid Expression"; 
                   
				   result += stack.pop(); 
				} 
                stack.push(c); 
			}
		}
		
		while (!stack.isEmpty())
		{ 
            if(stack.peek() == '(') 
                return "Invalid Expression"; 
         
			result += stack.pop(); 
         } 
		 
        return result; 
	}
	
	static int precedence(char c)
	{
		switch (c) 
        { 
        case '+': 
        case '-': 
            return 1;
       
        case '*': 
        case '/': 
            return 2;
       
        case '^': 
            return 3;
        } 
        return -1; 
	}
	
	static String getInfix(String exp) 
	{ 
		Stack<String> s = new Stack<String>(); 
	  
		for (int i = 0; i < exp.length(); i++) 
		{ 
			if (isOperand(exp.charAt(i))) 
			{ 
				s.push(exp.charAt(i) + ""); 
			} 
	 
			else
			{ 
				String op1 = s.pop(); 
				String op2 = s.pop();  
				s.push("(" + op2 + exp.charAt(i) + op1 + ")"); 
			} 
		} 
	  
		return s.peek(); 
	}
	
	static boolean isOperand(char x) 
	{ 
		return (x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z'); 
	} 
}
