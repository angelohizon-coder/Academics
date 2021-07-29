import java.util.*;
public class MapExample 
{
	public static void main(String args[]) 
	{
		Map map = new HashMap();
		map.put("one", "1st");
		map.put("second", new Integer(2));
		map.put("third","3rd");
		
		// Overwrites the previous assignment
		map.put("third","III");
		map.put("pang3","III");	
		// Returns set view of keys
		Set set1 = map.keySet();
		System.out.println(set1);		

		// Returns Collection view of values
		Collection collection = map.values();
		System.out.println(collection);

		// Returns set view of key value mappings
		Set set2 = map.entrySet();
		System.out.println(set2);

		// System.out.println(set1 + "\n" + collection + "\n" + set2);
		
	}
}
