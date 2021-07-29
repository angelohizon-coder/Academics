import java.util.Scanner;

public class ArrayExercise1
{
	public static void main(String[] args)
	{
		/*int sum = 0;
		int number[] = {77, 86, 86, 93, 91, 96, 98, 91, 95};
		
		for (int i = 0; i < number.length; i++)
		{
			sum = sum + number[i];
		}
		
		System.out.println (args(0));                                                  // Sum and average
		System.out.println (args{}) 
		
		double average = sum/number.length;
		
		System.out.println ("Sum: " + sum);
		System.out.println ("Average: " + average);*/

		/*for (int i = 0; i < args.length; i++)
	 	{
			int integer = Integer.parseInt(args[i]);
			
			int modulo = integer % 2;                                                  // Odd or Even
			
			if (modulo == 0)
				System.out.println (integer + " is even");
			
			else 
				System.out.println(integer + " is odd");
		}*/
		
		/*int sum = 0;
		
		for (int i = 0; i < args.length; i++)
		{
			sum = sum + Integer.parseInt(args[i]);
		}	
		
		System.out.println ("Sum: " + sum);*/
		
		/*(int number[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		for (int i = 0; i < number.length; i++)
		{	
			for (int j = 0; j < number.length; j++)
			{
				System.out.print(number[i] + " ");                                      //Commandline
			}
			
			System.out.println(number[i]);
		}*/
		
		/*int sum = 0;
		
		for (int i = 0; i < args.length; i++)
		{
			sum = sum + Integer.parseInt(args[i]);
		}
		
		System.out.print (sum/args.length);*/
		
		/*Scanner scan = new Scanner (System.in);
		
		System.out.print ("Enter a number: ");
		int number = scan.nextInt();                                                    //Array of a specific value
		
		int array[]	 = {22, 26, 27, 19, 3, 69};
		
		for (int i = 0; i < array.length; i++)
		{
			if (number == array[i])
				System.out.print (number + " = " + array[i]);
		}*/
		
		/*Scanner scan = new Scanner (System.in);
		
		System.out.print ("Enter a number: ");
		int number = scan.nextInt();
		
		int array[]	 = {22, 26, 27, 19, 3, 69};                                        //Position of a specific value within an array
		
		for (int i = 0; i < array.length; i++)
		{
			if (number == array[i])
				System.out.print (number + " has an index of " + i);
		}*/
			
		/*Scanner scan = new Scanner (System.in);
		
		System.out.print ("Enter a number: ");
		int number = scan.nextInt();
		
		int array[]	 = {22, 26, 27, 19, 3, 69};                                        //Position of a specific value within an array
		
		for (int i = 0; i < array.length; i++)
		{
			if (number == array[i])
				continue;
			
			System.out.print (array[i] + " 	");
		}*/
		
		int array[]	 = {22, 26, 27, 19, 77, 69};  
		int number[] = new int[6];
		
		System.arraycopy(array,0,number,0,array.length);
		
		for (int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
			System.out.println(number[i] + " ");
		}
	}
}