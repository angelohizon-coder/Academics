public class PostFix2
{ 
     public static void main(String[] args)  
    { 
        String exp = "(A+B)*(C/D)"; 
		String result1 = infixToPostfix(exp);
        
		System.out.println(result1); 
		System.out.println(getInfix(result1));
    } 
	
	static boolean isOperand(char x) 
	{ 
		return (x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z'); 
	} 
	
    static int Prec(char ch) 
    { 
        switch (ch) 
        { 
        case '+': 
        case '-': 
            return 1; break;
       
        case '*': 
        case '/': 
            return 2; break;
       
        case '^': 
            return 3; break;
        } 
        return -1; 
    } 
       
    static String infixToPostfix(String exp) 
    { 
        String result = new String(""); 
          
        Stack<Character> stack = new Stack<>(); 
          
        for (int i = 0; i<exp.length(); ++i) 
        { 
            char c = exp.charAt(i); 
              
            if (Character.isLetterOrDigit(c)) 
                result += c; 
               
            else if (c == '(') 
                stack.push(c); 
              
            else if (c == ')') 
            { 
                while (!stack.isEmpty() && stack.peek() != '(') 
                    result += stack.pop(); 
                  
                if (!stack.isEmpty() && stack.peek() != '(') 
                    return "Invalid Expression";           
                else
                    stack.pop(); 
            } 
            else 
            { 
                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())){ 
                    if(stack.peek() == '(') 
                        return "Invalid Expression"; 
                    result += stack.pop(); 
             } 
                stack.push(c); 
            } 
       
        } 
      
        while (!stack.isEmpty()){ 
            if(stack.peek() == '(') 
                return "Invalid Expression"; 
            result += stack.pop(); 
         } 
        return result; 
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
				String op1 = s.peek(); 
				s.pop(); 
				String op2 = s.peek(); 
				s.pop(); 
				s.push("(" + op2 + exp.charAt(i) + op1 + ")"); 
			} 
		} 
	  
		return s.peek(); 
	}
} 