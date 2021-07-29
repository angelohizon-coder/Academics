public class Sum
{
	public static void main (String args[])
	{
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		int arrayLength = array.length;
		
		System.out.println(sum1(array, arrayLength));
		System.out.println(sum2(array, arrayLength));
		System.out.println(sum3(array, arrayLength));
	}
	
	public static int sum1(int[] array, int arrayLength)
	{
		if (arrayLength > 0)
			return (sum1(array, arrayLength-1) + array[arrayLength-1]);
		
		return 0;
	}
	
	public static int sum2(int[] array, int arrayLength)
	{
		if (arrayLength > 1)
		{
			int length = array[arrayLength-1];
			
			if (length > 0)
				return (sum2(array, arrayLength-1) + array[arrayLength-1]);
	
			else if (length < 0)
				return 0;
		}	
		
		return 0;
	}
	
	public static int sum3(int[] array, int arrayLength)
	{
		int q = arrayLength/2;
		
		//if (arrayLength > q)
			//return (sum3(array, arrayLength-1) + array[arrayLength-1]);

		//else if (q > 0)
			//return (sum3(array, q-1) + array[q-1]);
		
		//else 
			//return 0;
	}	
}