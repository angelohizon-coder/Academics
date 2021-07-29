public class LE4
{
	public static void main (String [] args)
	{
		int i;
		int j;
		
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
					System.out.print ("\t" + i);
				}
				
				else if (i != j && modulo == 0)
				{
					break;
				}
			}
		}
	}		
}