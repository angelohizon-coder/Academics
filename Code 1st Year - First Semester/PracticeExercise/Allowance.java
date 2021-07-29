public class Allowance
{
	public static void main (String args[])
	{
		{	
			int allowance = 1000;
			int additionalallowance = 500;
			boolean passedthesemester = true;
			
			if (passedthesemester)	
			{
				System.out.println ("You passed the semester! For that you get an allowance of " + (allowance + additionalallowance));
			}
			
			else
			{
				System.out.println ("You failed the semester! For that you still have an allowance of " + allowance);
			}
		}
		
		int allowance = 1000;
		int additionalallowance = 500;
		boolean passedthesemester = false;
			
		if (passedthesemester)	
		{
			System.out.println ("You passed the semester! For that you get an allowance of " + (allowance + additionalallowance));
		}
			
		else
		{
			System.out.println ("You failed the semester! For that you still have an allowance of " + allowance);
		}	
	}
}