public abstract class Animal
{
	protected String name;

	public void setName(String n)
	{
		name = n;
	}

	public String getName()
	{
		return name;
	}

	public abstract void speak();
}