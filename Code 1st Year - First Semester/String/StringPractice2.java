import java.util.Scanner;
public class StringPractice2
{
	public static void main (String args [])
	{
		/* 
			WITHOUT STRING BUFFER REVERSE
	    String original, reverse = "";
   		Scanner in = new Scanner(System.in);

    	System.out.println("Enter a string to reverse");
   		original = in.nextLine();

    	int length = original.length();

    	for (int i = length - 1 ; i >= 0 ; i--)
     		reverse = reverse + original.charAt(i);

    	if(original.equalsIgnoreCase(reverse))
    		System.out.println(reverse + " is a palendrome");
  		*/

    	//STRING BUFFER REVERSE

    	StringBuffer original = new StringBuffer();
   		Scanner in = new Scanner(System.in);
   		System.out.println("Palendrome String Checker \nInput a String Value: ");
   		original.append(in.nextLine());

   		if(original.equals(original.reverse()))
   		{
   			System.out.println(original + " is a palendrome");
   		}
	}
}