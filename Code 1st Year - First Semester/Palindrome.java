public class Palindrome
{
	public static void main(String args[])
	{
		int[] array1 = {1,2,1};
		int[] array2 = {1,2,1};
		int p = 0;
		int r = array1.length-1;
		
		palindrome(array1, p, r);
		
		for(int i = 0; i < array1.length; i++)
		{
			if (array1[i] == array2[i])
				System.out.print(array1[i] + " ");
			
			else
				break;
		}	
	}	
	
	public static void swap(int[] array, int p, int r)
	{
		int temp = array[r];
		array[p] = array[r];
		array[r] = temp;
	}
	
	public static void palindrome(int[] array, int p, int r)
	{
		if (p == r)
			return;
		
		swap(array, p, r);
		palindrome(array, p+1, r-1);
	}
}