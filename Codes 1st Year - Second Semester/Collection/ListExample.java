import java.util.*;

public class ListExample
{
	public static void main(String args[])
	{
		List list = new ArrayList();

		list.add("oracle");
		list.add(new Integer(100));
		list.add(new Boolean(false));
		list.add("JAVA");
		list.add("JAVA");
		list.add("oracle");
		list.add(new Double(3.0));

		System.out.println(list);

	}
}
