public class LE4V2
{
	public static void main (String [] args)
	{
		int i = 100;
		
		while (i <= 541)
		{
			int j = 2;
			int modulo = i % j;
			
			while (modulo != 0)
			{
				j++;
				modulo = i % j;
				System.out.println (modulo);
			}
			
			i++;
		}
	}
}