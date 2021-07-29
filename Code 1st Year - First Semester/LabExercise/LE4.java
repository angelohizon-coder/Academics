public class LE4
{
	public static void main (String [] args)
	{
		for (int i = 2; i != 541; i++)
		{
			for (int j = 2; j == i; i++)
			{
				System.out.print (i + "\t");
			}
			
			for (int j = 2; j != i; j++)
			{
				int modulo = i % j;
				if (modulo == 0)
				{
					if (i == j)
					{					
						System.out.print (i+ "\t");
					}
					
					else
					{
						break;
					}
				}
			}
		}
	}
}