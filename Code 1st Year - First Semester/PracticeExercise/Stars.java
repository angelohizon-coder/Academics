public class Stars
{
	public static void main (String [] args)
	{
		/*int rows;
		int counter;
		
		for (rows = 5; rows >= 0; --rows)
		{
			for (counter = 10; counter >= 0; --counter)
			{
				System.out.print("*");
			}
			
			System.out.print("\n");
		}*/
		
		/*int rows;
		int counter;
		int limit = 0;
		
		for (rows = 1; rows <= 5; ++rows)
		{
			for (counter = 0; counter <= limit; ++counter)
			{
				System.out.print("*");
			}
			
			limit = limit + 1;
			System.out.print("\n");
		}*/
		
		/*int rows;
		int counter;
		int space;
		int limit = 0;
		int tab = 0;
		
		for (rows = 1; rows <=5; ++rows)
		{
			for (space = 3; space >= tab; --space)
			{
				System.out.print (" ");
			}
			
			for (counter = 0; counter <= limit; ++counter)
			{
				System.out.print ("*");
			}
			tab = tab + 1;
			limit = limit + 1;
			System.out.print("\n");
			
			continue outermost;
		}*/
		
		int rows;
		int counter;
		int counter2;
		int space;
		int limit = 0;
		int limit2 = 0;
		int tab = 0;
		
		for (rows = 1; rows <=5; ++rows)
		{
			for (space = 3; space >= tab; --space)
			{
				System.out.print (" ");
			}
			
			for (counter = 0; counter <= limit; ++counter)
			{
				System.out.print ("*");
			}
			
			for (counter2 = 0; counter2 < limit2; ++counter2)
			{
				System.out.print ("*");
			}
			limit2 = limit2 + 1;
			
			tab = tab + 1;
			limit = limit + 1;
			System.out.print("\n");
		}
	}
}