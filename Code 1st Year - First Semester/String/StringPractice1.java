import java.util.Scanner;
public class StringPractice1

{
	public static void main (String args[])
	{
		Scanner myNumbers = new Scanner(System.in);
		String [] arrayNumbers = new String [5];
		System.out.println("Enter five words ");
		for (int counter = 0; counter<arrayNumbers.length; counter++)
		{
			// System.out.println("number " + (counter+1) + ":");
			arrayNumbers[counter] = myNumbers.nextLine();
		}

		System.out.println();
		System.out.println("The following words ends with letter 's' ");

		for(int i = 0; i<arrayNumbers.length; i++)
		{
			if (arrayNumbers[i].charAt(arrayNumbers[i].length()-1)=='s'|| 
				arrayNumbers[i].charAt(arrayNumbers[i].length()-1)=='S')
			{
				System.out.println(arrayNumbers[i]);
			}	
		}
	}
}