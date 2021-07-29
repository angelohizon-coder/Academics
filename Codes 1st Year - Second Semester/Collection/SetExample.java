
import java.util.*;

public class SetExample
{
	public static void main(String args[])
	{
		Set set = new HashSet();

		set.add("oracle");
		set.add(new Integer(100));
		set.add(new Boolean(false));
		set.add("JAVA");
		set.add("JAVA");
		set.add("oracle");
		set.add(new Double(3.0));

		System.out.println(set);
	}
}

