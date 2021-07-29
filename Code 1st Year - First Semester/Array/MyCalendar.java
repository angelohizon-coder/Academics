public class MyCalendar
{
	public static void main(String args[])
	{
		int year = 2013;
		
		int febNoOfDays =  (year % 4 == 0) ? 29 : 28;
		
		int calendar[][] = new int[12][];
		
		calendar[0] = calendar[2] = calendar[4] =
		calendar[6] = calendar[7] = calendar[9] = 
		calendar[11] =  new int[31];
		
		calendar[3] = calendar[5] = calendar[8] = 
		calendar[10] = new int [30];
	
		calendar[1] = new int[febNoOfDays];
		
		// to populate the calendar
		for (int i = 0; i < calendar.length; i++)
		{
			for (int j = 0; j < calendar[i].length; j++)
			{
				calendar[i][j] = (j + 1);
			}
		}

		// used for printing
		for (int i = 0; i < calendar.length; i++)
		{
			System.out.print(getMonth(i) + ": ");
			for (int j = 0; j < calendar[i].length; j++)
			{
				System.out.print(calendar[i][j] + ",");
			}
			System.out.println();
		}
	}
	public static String getMonth(int i)
	{
		String month = "";
		switch(i)
		{
			case 0 : month = "January"; break;
			case 1 : month = "February"; break;
			case 2 : month = "March"; break;
			case 3 : month = "April"; break;
			case 4 : month = "May"; break;
			case 5 : month = "June"; break;
			case 6 : month = "July"; break;
			case 7 : month = "August"; break;
			case 8 : month = "September"; break;
			case 9 : month = "October"; break;
			case 10 : month = "November"; break;
			case 11 : month = "December";
		}
		return month;
	}
}


