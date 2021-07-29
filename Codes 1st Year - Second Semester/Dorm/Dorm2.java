public class Dorm2
{
	public static void main(String args[])
	{
		TestDormExtension dorm = new TestDormExtension();
		
		dorm.setDN("Thomasian Residence");
		dorm.setDS("Santander");
		dorm.setCost(3500);
		
		System.out.println("Dorm Name: " + dorm.getDN() + "\nStreet Name: " + dorm.getDS() + "\nCost: " + dorm.getCost());
	}
}