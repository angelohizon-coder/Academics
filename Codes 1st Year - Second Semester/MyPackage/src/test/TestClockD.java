package test;

import domain.ClockD;

public class TestClockD
{
	public static void main (String args[])
	{
		ClockD myClock, yourClock;
		
		myClock = new ClockD(0, 0, 0);
		yourClock = new ClockD(22, 22, 22);
		
		/*
		myClock.incHour();
		myClock.incMinutes();
		myClock.incSeconds();
		
		yourClock.incHour();
		yourClock.incMinutes();
		yourClock.incSeconds();
		
		if (myClock.equals(yourClock))
			System.out.println("Both the times are equal.");
		else
			System.out.println("Both the times are not equal.");
		
		System.out.println("\nPrint myClock and yourClock");
		
		System.out.println(myClock.getHour() + ":" + myClock.getMin() + ":" + myClock.getSec());
		System.out.println(yourClock.getHour() + ":" + yourClock.getMin() + ":" + yourClock.getSec());
		*/
		
		System.out.println("Before:");
		System.out.print("yourClock - ");
		yourClock.printTime();
		System.out.print("myClock - ");
		myClock.printTime();
		System.out.println("");
		
		System.out.println("After:	");
		System.out.print("yourClock - ");
		yourClock.makeCopy(myClock);
		yourClock.printTime();
		System.out.print("myClock - ");
		myClock.printTime();
		System.out.println("");
		
		System.out.println("Decrement:");
		myClock.decHours();
		myClock.decMinutes();
		myClock.decSeconds();
		
		System.out.println(myClock.getHour() + ":" + myClock.getMin() + ":" + myClock.getSec());
	}
}