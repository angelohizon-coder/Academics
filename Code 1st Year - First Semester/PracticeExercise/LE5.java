public class LE5
{
	public static void main (String args[])
	{
		int i;
		int j;
		int counter = 0;
		
		
		for (i = 2; i <= 541; i++)                       
		{				
			for (j = 2; i >= j; j++)					
			{
				int modulo = getReverse(i) % j;
				
				while (modulo != 0)
				{
					j++;
					modulo = i % j;
				}
				
				if (i == j && modulo == 0)
				{
					System.out.print (getReverse(i) + "\n");
				}
				
				else if (i != j && modulo == 0)
				{
					break;
				}
			}
		}
	}
	
	public static int getReverse(int a)
	{
		int w = a/100; 
		int x = ((a/10)%10)*10;
		int y = (a%10)*100;
		int z = 0;
		
		if (a >= 10 && a <= 99)
		{
			z = x + y;
			z = z/10;
		}
		
		else if (a >= 100)
		{
			z = w + x + y;
		}
		
		else
		{
			
		}
		
		return z;
	}
}