public class OddEven2
{
	public static void main(String args[])
	{
		int newArray [] = new int [args.length];

		for (int counter = 0; counter<args.length ; counter++ ) 
		{
			newArray[counter]= Integer.parseInt(args[counter]);
		}

		System.out.print("Even: \n");

		for(int counter = 0; counter<args.length; counter++)
		{
			if(newArray[counter]%2==0)
				System.out.println(newArray[counter]);
		}

		System.out.print("Odd: \n");

		for(int counter = 0; counter<args.length; counter++)
		{
			if(newArray[counter]%2==1)
				System.out.println(newArray[counter]);
		}

	}
}