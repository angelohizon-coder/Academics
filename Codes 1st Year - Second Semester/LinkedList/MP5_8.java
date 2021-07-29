/*Name: Angelo Louis L. Hizon
Section: 1-CSD*/

public class MP5_8
{
		public static void main(String args[])
		{
			SLL<String> slist1 = new SLL<String>();
			
			// Adds a head to the linked list
			slist1.addToHead("Sean");
			slist1.addToHead("Pete");
			slist1.addToHead("Malcolm");

			// Adds a tail before the linked list
			slist1.addToTail("Ari");

			slist1.addToHead("Matthew");
			slist1.addToHead("Kenneth");
			slist1.addToHead("Ivan");

			// Replaces the node before info "Sean" 
			// The one before "Sean" is "Pete" then "Pete" is replaced by "Angelo"
			// Returns true
			slist1.replaceBeforeInfo("Kyle", "Angelo");

			slist1.addToTail("Hannah");

			// Prints out the linked list with replaced node
			System.out.println(slist1.toString());
			
			/*

			// Ivan is the head of the linked list where before it there is nothing
			// Which is why it will print the message "The new information has nothing to replace"
			// Then proceed in printing the original linked list (w/o replacement)
			slist1.replaceBeforeInfo("Ivan", "Angelo");

			slist1.addToTail("Hannah");

			System.out.println(slist1.toString());

			*/
	
		}
}