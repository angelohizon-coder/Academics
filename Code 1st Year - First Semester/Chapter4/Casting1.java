public class Casting1
{
	public static void main(String args[])
	{
		byte b1 = 10;
		byte b2 = 5;
		byte b3 = (byte)(b1 + b2);
		
		// (byte)(b1 + b2); (byte) is used to store the sum of the given equation
		
		System.out.println("B3 = " + b3);
	}
}
