public class TestSLL
{
		public static void main(String args[])
		{
			SLL<Integer> slist1 = new SLL<Integer>();
			
			slist1.addToHead(1);
			slist1.addToHead(2);
			slist1.addToHead(3);

			/*slist1.addToTail("Julian");

			slist1.addToHead("Tone");
			slist1.addToHead("Mon");
			slist1.addToHead("Xam");

			slist1.addToTail("Deynuh");*/

			//System.out.println("Deleted: " + slist1.deleteFromHead());
			System.out.println(slist1.maximumString());
			System.out.println(slist1.countNodes());
			slist1.replaceInfo(2, 5);

			slist1.addBeforeInfo(1, 9);

			System.out.println(slist1.toString());
			
			//System.out.println("Deleted: " + slist1.deleteFromTail());
			//System.out.println("Deleted: " + slist1.delete("Malcolm"));
			//System.out.println(slist1.toString());
			//System.out.println(slist1.max());
		}
}