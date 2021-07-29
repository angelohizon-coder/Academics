public class TestAssert{
	public static void main(String args[])
	{
	int hour = Integer.parseInt(args[0]);
	int mins = Integer.parseInt(args[1]);
	
	assert(hour > 0 && hour < 24):"Invalid hour value";
	assert(mins > 0 &&  mins < 60): "Invalid min value";

	System.out.println(hour + ":" + mins);
	}
}
