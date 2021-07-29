public abstract class NewspaperSubscription
{
	protected String name;
	protected String address;
	protected int rate;

	public void NewspaperSubscription(String name)
	{
		setName(name);
		setAddress();
	}

	public void setName(String n)
	{
		name = n;
	}

	public abstract void setAddress();

	public String getName()
	{
		return name;
	}

	public String getAddress()
	{
		return address;
	}

	public int getRate()
	{
		return rate;
	}
}