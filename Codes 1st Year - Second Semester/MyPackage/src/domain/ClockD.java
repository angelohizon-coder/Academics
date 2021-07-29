//Angelo Louis Llarinas Hizon
//Merkiel Bernz Roque Llaneta

package domain;

public class ClockD
{
	public int hr;
	public int min;
	public int sec;
	
	//constructor
	public ClockD (int hour, int minutes, int seconds)
	{
		hr = hour;
		min = minutes;
		sec = seconds;
	}
	
	public void setTime(int hour, int minutes, int seconds)
	{
		//validation
		if (hour >= 0 && hour <= 23)
			hr = hour;
		else
			hr = 0;
		
		min = minutes ;
		sec = seconds; 
	}
	
	public int getHour()
	{
		return hr;
	}
	
	public int getMin()
	{
		return min;
	}
	
	public int getSec()
	{
		return sec;
	}
	
	public void printTime()
	{
		System.out.println (hr + ":" + min + ":" + sec);
	}
	
	public void incHour()
	{
		hr = hr + 1;
		if (hr > 24)
		{
			int extraHour = hr % 24;
			hr = extraHour;
		}
	}
	
	public void incMinutes()
	{
		min = min + 1;
		if (min > 60)
		{
			hr = hr + 1;
			
			int extraMinute = min % 60;
			min = extraMinute;
		}
	}
	
	public void incSeconds()
	{
		sec = sec + 1;
		if (sec > 60)
		{
			min = min + 1;
			
			int extraSecond = sec % 60;
			sec = extraSecond;
		}
	}
	
	public boolean equals(ClockD otherClock)
	{
		if (this.hr == otherClock.getHour() && this.min == otherClock.getMin() && this.sec == otherClock.getSec())
			return true;
		else
			return false;
	}
	
	public void makeCopy(ClockD copy)
	{
		hr = copy.getHour();
		min = copy.getMin();
		sec = copy.getSec();
	}
	
	public void decHours()
	{
		hr = hr - 1;
		
		if (hr < 0)
		{
			hr = hr + 24;
			min = 59;
			sec = 59;
		}
	}
	
	public void decMinutes()
	{
		if (hr == 23 && min == 59)
		{
			hr = hr;
			min = min;
		}

		else
		{
			min = min-1;
		
			if (min < 0)
			{
				hr = hr - 1;
				if (hr < 0)
				{
					hr = hr + 24;
					min = 59;
					sec = 59;
				}
				
				else 
				{
					min = 59;
					sec = 59;
				}
			}
		}
	}
	
	public void decSeconds()
	{
		if ((hr == 0 || hr == 23) && min == 59 && sec == 59)
		{
			hr = hr;
			min = min;
			sec = sec;
		}
		
		else
		{
			sec = sec-1;
		
			if (sec < 0)
			{
				sec = 59;
				min = min - 1;
				if (min < 0)
				{
					hr = hr - 1;
					if (hr < 0)					
					{
						hr = hr + 24;
						min = 59;
						sec = 59;
					}
					
					else
					{
						min = 59;
						sec = 59;
					}
				}
			}
		}
	}
}