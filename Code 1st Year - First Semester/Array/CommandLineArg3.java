public class CommandLineArg3
{
	public static void main(String args[])
	{
		int sum = 0;
		double ave = 0.0;

		// enhanced for loop version
		for (String a : args)
		{
			sum += Integer.parseInt(a);
		}
		ave = (double)sum / args.length;
		System.out.println("Sum: " + sum);
		System.out.println("Ave: " + ave);
	}
}
