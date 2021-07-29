import java.util.*;

public class Shoppers
{
	public static void main(String args[])
	{
		int sum = 0;

		Set shoppers = new HashSet();

		shoppers.add(new Person("Jose", 20));
		shoppers.add(new Person("Pedro", 30));
		shoppers.add(new Person("Dante", 26));
		shoppers.add(new Person("Joy", 25));
		
		shoppers.add("Jose Rizal");
		shoppers.add(new Integer (100));
		shoppers.add(new Boolean (false));
		// System.out.println(shoppers);
		Iterator it = shoppers.iterator();

		while (it.hasNext())
		{
			Person p = (Person)it.next();	
			sum += p.getAge();
			System.out.println(p);
		}
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + 
				(double)sum / shoppers.size());

		
	}
}
