// arrays are immutable, but we can reuse
// the same ref variable to make an array
// appear longer or shorter
public class Array3
{
	public static void main(String args[])
	{
		// declare and initialize
		int quiz[] = {100, 80, 90, 75, 85};
		int temp[] = new int[7];
		
		System.arraycopy(quiz, 0, temp, 0, quiz.length);
		
		quiz = temp;
		temp = null;
		
		for (int q : quiz)
		{
			System.out.println(q);
		}
	}
}
