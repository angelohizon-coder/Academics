public class Casting5
{
	public static void main(String args[])
	{
		byte b = 10;
		short s = 20;
		int i = 30;
		long l = 40L;	// long l = (long)40;	// long l = 40l;
		
		float f = 1.1f;
		double d = 2.2;
		
		char ch = 97;
		
	 	double total = b + s + i + l + f + ch;
		
		System.out.println("Total = " + total);
		total = total %.3;
		System.out.printf("Total = " + total);

	}
}
