public class TestDLL
{
		public static void main(String args[])
		{
			DLL<String> slist1 = new DLL<String>();
			
			slist1.addToHead("Sean");
			slist1.addToHead("Pete");
			slist1.addToHead("Malcolm");

			slist1.addToTail("Ari");

			slist1.addToHead("Matthew");
			slist1.addToHead("Kenneth");
			slist1.addToHead("Ivan");

			slist1.addToTail("Hannah");

			System.out.println("Deleted: " + slist1.deleteHead());
			System.out.println(slist1.toString());
			
			System.out.println("Deleted: " + slist1.deleteTail());
			System.out.println(slist1.toString());
		}
}