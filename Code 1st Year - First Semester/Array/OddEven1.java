public class OddEven1
{
	public static void main(String args[])
	{
		System.out.println("Even: ");
		for (String s : args)
		{
			if(Integer.parseInt(s)%2==0)
				System.out.println(s);
		}
		System.out.println("Odd: ");
		for (String s : args)
		{
			if(Integer.parseInt(s)%2==1)
				System.out.println(s);
		}
	}
}
