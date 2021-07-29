public class LE5V2
{
	public static void main(String args[])
	{
		for(int i = 2;i <= 541;i++)
		{
			for(int j = 2;j <= i;j++)
			{
				if(i % j != 0)
					continue;
				else if(j == i)
					if(isEmirp(i) && isEmirp(reverse(i)) && i!= reverse(i))
						System.out.println(i + " and " + reverse(i));
				else
					break;
			}
		}
	}
	public static int reverse(int n)
	{
		int reverse = 0;
		while(n != 0)
     	{
          	reverse = reverse * 10;
          	reverse = reverse + n%10;
          	n = n/10;
      	}
		return reverse;
	}
	
	public static boolean isEmirp(int reverse)
	{
		if (reverse <= 1) 
            return false; 
        for (int y = 2; y < reverse; y++) 
        if (reverse % y == 0) 
                return false; 
        return true; 
	}
}