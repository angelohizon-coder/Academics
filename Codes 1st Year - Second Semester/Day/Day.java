class Day
{
	private int previousDay;
	private int currentDay;
	private int nextDay;
	private String previousDate;
	private String currentDate;
	private String nextDate;
	
	Day(int n, String d)
	{
		currentDay = n;
		currentDate = d;
	}
	
	public void setPD(int n)
	{
		previousDay = currentDay - 1;
		
		if (previousDay <= 0)
			previousDay = 28;
	}
	
	public void setND(int n)
	{
		nextDay = currentDay + 1; 
		
		if (nextDay >= 29)
			nextDay = 1;
	}
	
	public int getPD()
	{
		return previousDay;
	}
	
	public int getND()
	{
		return nextDay;
	}
	
	public void setPD1(int n)
	{
		n = n-1;
		
		switch(n)
		{
			case 1: previousDate = "Monday";break;
			case 2: previousDate = "Tuesday";break;
			case 3: previousDate = "Wednesday";break;
			case 4: previousDate = "Thursday";break;
			case 5: previousDate = "Friday";break;
			case 6: previousDate = "Saturday";break;
			case 7: previousDate = "Sunday";break;
		}
	}
	
	public void setPD2(int n)
	{
		n = n+1;
		
		switch(n)
		{
			case 1: nextDate = "Monday";break;
			case 2: nextDate = "Tuesday";break;
			case 3: nextDate = "Wednesday";break;
			case 4: nextDate = "Thursday";break;
			case 5: nextDate = "Friday";break;
			case 6: nextDate = "Saturday";break;
			case 7: nextDate = "Sunday";break;
		}
	}
	
	public String getPD1()
	{
		return previousDate;
	}
	
	public String getPD2()
	{
		return nextDate;
	}
	
	public void showDetails()
	{
		System.out.println("Current Day: " + currentDay + " - " + currentDate);
		System.out.println("Next Day: " + nextDay + " - " + nextDate);
		System.out.println("Previous Day: " + previousDay + " - " + previousDate);
	}
}