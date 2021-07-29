
public class GCD_Recursion
{
	public static void main(String args[])
	{
		int num1 = 54, num2 = 24;
		
		System.out.println("GCD of two numbers " + num1 +" and " 
                     + num2 +" is :" + findGCD(num1, num2));
	}

	private static int findGCD(int number1, int number2) {
        	if(number2 == 0)  {
	            return number1;
        	}
        	return findGCD(number2, number1 % number2);
    	}
}

