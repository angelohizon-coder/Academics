class PersonD
{
	//modifier are private so that it will not have direct access to the data member
	private String name1;
	private String name2;
	private int age1;
	private int age2;
	
	//constructor
	PersonD(String n, int a)
	{
		name1 = n;
		age1 = a;
	}
	
	//setter for name
	public void setName(String n)
	{
		name2 = n;
	}
	
	//setter for age
	public void setAge(int a)
	{	
		age2 = a;
	}
	
	public String getName()
	{
		return name2;
	}
	
	public int getAge()
	{
		return age2;
	}
	
	public void showDetails()
	{
		System.out.println ("the name is: " + name1);
		System.out.println ("the age is: " + age1);
	}
}