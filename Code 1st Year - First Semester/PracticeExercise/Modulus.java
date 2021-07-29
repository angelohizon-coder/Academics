public class Modulus
{
	public static void main (String args[])
	{	
		int x = 197;
		int y = 2;
		
		while (x > 1)
		{
			x -= y;
			System.out.print (x + ", ");
		}
	}
}