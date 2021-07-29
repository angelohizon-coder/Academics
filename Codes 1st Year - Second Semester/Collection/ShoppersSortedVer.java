import java.util.*;
public class ShoppersSortedVer
{
	public static void main(String args[])
	{
		int sum = 0;

		Set<Person> shoppers = new TreeSet<Person>();

		shoppers.add(new Person("Jose", 20));
		shoppers.add(new Person("Pedro", 30));
		shoppers.add(new Person("Dante", 26));
		shoppers.add(new Person("Joy", 25));

		Iterator<Person> it = shoppers.iterator();

		while (it.hasNext())
		{
			Person p = it.next();	
			sum += p.getAge();
			System.out.println(p);
		}
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + 
			(double)sum / shoppers.size());


	}
}

