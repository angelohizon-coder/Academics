import java.util.*;

public class ShoppersGen
{
	public static void main(String args[])
	{
		int sum = 0;

		// Set<Person> shoppers = new HashSet<>();
		Set<Person> shoppers = new TreeSet<Person>();

		shoppers.add(new Person("Jose", 20));
		shoppers.add(new Person("Pedro", 30));
		shoppers.add(new Person("Dante", 26));
		shoppers.add(new Person("Joy", 25));

		// shoppers.add("Jose Rizal");
		// shoppers.add(new Integer(100));
		// shoppers.add(new Boolean(false));
		
		Iterator<Person> it = shoppers.iterator(); 

		while (it.hasNext())
		{
			Person p = it.next();	
			sum += p.getAge();
			System.out.println(p);
		}
		System.out.println("Sum: " + sum);
		System.out.println("Average: " +
			 (double)sum / shoppers.size()); //
		/*
		
		for (Person p : shoppers)
		{
			sum += p.getAge();
			System.out.println(p);
		}
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + 
			(double)sum / shoppers.size());
	*/	
	}
}
