public class Array1
{
	public static void main(String[] args)
	{
		// declare and create an array
		// int quiz[] = new int[5];
		
		// int[] quiz;		// declaration
		// quiz = new int[5];	// instantiation
		
		// declare and initialize
		int quiz[] = {100, 80, 90, 75, 85, 77, 88, 57, 98, 99};
		
		// for (int i = 0; i < 5; i++)
		for (int i = 0; i < quiz.length; i++)
		{
			System.out.println("quiz[" + i + "] = " 
							+ quiz[i]);
		} 
	
		System.out.println("Values in reverse: ");
		for (int i = quiz.length - 1; i >= 0; i--)
		{
			System.out.println("quiz[" + i + "] = " 
							+ quiz[i]);

		}
	}
}
