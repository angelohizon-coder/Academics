public class Person extends Object implements Comparable<Person>
{
	private String name;
	private int age;
	
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	// getters
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	// override the equals method
	public boolean equals(Object obj)
	{
		boolean result = false;
		if (obj != null && obj instanceof Person)
		{
			Person p = (Person)obj;
			if ( getName().equals(p.getName()) 
			  && getAge() == p.getAge() )
			{
				result = true;
			}
		}
		return result;
	}
	
	// override the hashCode method
	public int hashCode()
	{
		return getName().hashCode() ^ getAge();
	}
	
	// override the toString method
	public String toString()
	{
		return getName() + ", at age " + getAge();
	}

	//  override the compareTo() method, sorting by name
	public int compareTo(Person obj)
	{
		// Person p = (Person)obj;
		int val = this.getName().compareTo(obj.getName());
		
		if (val == 0)
			return 0;		// equals
		else if(val < 0)
			return 1;		// less than or before
		else
			return -1;		// more than or after
	} 
/*	
	// override the compareTo() method, sorting by age
	public int compareTo(Person obj)
	{
		int val = this.getAge() - obj.getAge();
		
		if (val == 0)
			return 0;		// equals
		else if(val < 0)
			return -1;		
		else
			return 1;		
	}*/
}
