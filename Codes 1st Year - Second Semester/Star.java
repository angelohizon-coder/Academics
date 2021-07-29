public class Star
{
	public static void main(String[] args)
	{		
		for(int i = 0; i < 6; i++)
		{
			System.out.print("*");

			for(int j = i; j != 0; j--)
				System.out.print("*");

			System.out.print("\n");
		}

		for(int i = 0; i < 6; i++)
		{
			String star = "******";
			char[] starArray = star.toCharArray();

			for(int j = 0; j != i; j++)
				starArray[j] = ' ';

			for(int j = 0; j != 6; j++)
				System.out.print(starArray[j]);

			System.out.print("\n");
		}
	}
}