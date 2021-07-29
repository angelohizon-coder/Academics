public class Reverse
{
	public static void main (String args[])
	{
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		int start = 0;
		int end = array.length-1;
		
		reverseR1(array, start, end);
		
		for (int i = 0; i < array.length; i++)
				System.out.print(array[i] + " ");
	}
	
	public static void reverseR1(int[] array,int start,int end)
	{
		if (start==end)
			return;
		
		else if (start+1==end)
		{
			swap(array, start, end);
			return;
		}
		
		else
		{
			swap(array, start, end);
			reverseR1(array, start+1,end-1);
		}
	}
	
	public static void swap(int[] array,int start,int end)
	{
		int temp;
		
		temp = array[start];
		array[start] = array[end];
		array[end] = temp; 
	}
}