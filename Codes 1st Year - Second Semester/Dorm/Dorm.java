public class Dorm
{
	public static void main(String args[])
	{
		TestDorm dorm = new TestDorm();
		
		dorm.setDN("Thomasian Residence");
		dorm.setDS("Santander");
		
		System.out.println("Dorm Name: " + dorm.getDN() + "\nStreet Name: " + dorm.getDS());
	}
}