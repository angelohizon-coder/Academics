class Day
{

	private String day;
	private int numDays;

	private int dayIndex;

	private String sun = "Sunday";
	private String mon = "Monday";
	private String tues = "Tuesday";
	private String wed = "Wednesday";
	private String thurs = "Thursday";
	private String fri = "Friday";
	private String sat = "Saturday";
	
	private String week[] = {sun, mon, tues, wed, thurs, fri, sat};

	// Constructor

	Day(String day, int numDays)
	{
		this.day = day;
		this.numDays = numDays;
	}

	// Operations
	public void printDay()
	{
		System.out.println("Today is " + week[dayArrayDetector()]);
	}

	public String returnDay()
	{
		return week[dayArrayDetector()];
	}

	public String returnNextDay()
	{
		int nextDaycounter;
		if (dayArrayDetector() + 1 == week.length)
		{
			return week[0];
		}
		else
		{
			nextDaycounter = dayArrayDetector() + 1;
		}
		return week[nextDaycounter];
	}

	public String returnPrevDay()
	{
		int prevDaycounter;
		if (dayArrayDetector() - 1  == -1)
		{
			return week[week.length -1];
		}
		else
		{
			prevDaycounter = dayArrayDetector() - 1;
		}
		return week[prevDaycounter];
	}

	public String dayCalculator()
	{
		return week[(dayArrayDetector() + numDays) % week.length];
	}

	public int dayArrayDetector()
	{
		for (int i = 0; i < week.length; i++)
		{
			if(day.equalsIgnoreCase(week[i]))
			{
				dayIndex = i;
			}
		}
		return dayIndex;
	}

	public int getNumDays()
	{
		return numDays;
	}
}