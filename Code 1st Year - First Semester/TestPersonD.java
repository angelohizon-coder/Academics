class TestPersonD
{
	public static void main(String args[])
	{
		PersonD a,b;
		
		//the data to be sent to the constructor
		a = new PersonD("Angelo", 19);
		b = new PersonD("Fluffy", 7);
		
		//replaces the data from a = PersonD
		a.setName("Jonathan");
		a.setAge(31);
		
		b.setName("Aldrin");
		b.setAge(16);
		
		System.out.println(a.getName());
		System.out.println(b.getName());
		
		//sends the data to the constructor to be read by the method
		a.showDetails();
		b.showDetails();
	}
}