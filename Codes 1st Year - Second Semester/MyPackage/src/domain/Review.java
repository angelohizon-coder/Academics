package domain;

public class Review
{
	public String name;
	public int age;
	
	public Review(String n, int a)
	{
		name = n;
		age = a;
	}
	
	public Review(String n)
	{
		this(n, 18);
	}
	
	public Review(int a)
	{
		this("Gelo", a);
	}
	
	public Review()
	{
		this("Angelo", 19);
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public void setAge(int a)
	{
		age = a;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
}