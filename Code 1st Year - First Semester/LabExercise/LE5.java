public class LE5
{
	public static void main (String [] args)
	{
		int i;
		int j;
		int k;
		
		for (i = 2; i <= 541; i++)                       //(declaration; condition; change of state) declaration -> condition -> statement -> change of state -> 
		{				
			for (j = 2; i >= j; j++)					 //condition -> end or repeat
			{
				int modulo = i % j;
				
				while (modulo != 0)
				{
					j++;
					modulo = i % j;
				}
				
				if (i == j && modulo == 0)
				{
					if (isEmirp(i) == true)
					{
						System.out.print(i + " ");
					}
				}
				
				else if (i != j && modulo == 0)
				{
					break;
				}
			}
		}
	}	

	public static boolean isEmirp(int a)
	{
		int j;	
		int w = a/100; 
		int x = (a/10)%10*10;
		int y = (a%10)*100;
		int z = 0;
		
		if (a <= 9)
		{
			z = a;
		}
		
		else if (a >= 10 && a <= 99)
		{
			z = x + y;
			z = z/10;
		}
		
		else if (a >= 100)
		{
			z = w + x + y;
		}
			
		for (j = 2; z >= j; j++)					 //condition -> end or repeat
		{
			int modulo = z % j;
			
			while (modulo != 0)
			{
				j++;
				modulo = z % j;
			}
				
			if (z == j && modulo == 0)
			{
				return true;
			}
				
			else if (z != j && modulo == 0)
			{
				break;
			}
		}
		
		return false;
	}
}