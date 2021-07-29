public class TestQueue
{
	public static void main(String args[])
	{
		Queue<Character> q1 = new Queue<Character>(4);
		Queue<Integer> q2 = new Queue<Integer>(4);
		Queue<String> q3 = new Queue<String>(4);
		
		System.out.println("Sequence 1: ");
		q1.enqueue('J');
		q1.enqueue('K');
		q1.enqueue('L');
		System.out.println(q1.dequeue());
		q1.enqueue('M');
		System.out.println(q1.dequeue());
		q1.enqueue('N');
		q1.enqueue('P');
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		q1.enqueue('Q');
		System.out.println(q1.dequeue());
		q1.enqueue('R');
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue() + "\n");
		
		System.out.println("Sequence 2: ");
		q2.enqueue(15);
        q2.enqueue(28);
        System.out.println(q2.dequeue());
        q2.enqueue(31);
        System.out.println(q2.peek());
        System.out.println(q2.dequeue());
        System.out.println(q2.dequeue());
        q2.enqueue(47);
        System.out.println(q2.peek());
        q2.enqueue(54);
        System.out.println(q2.dequeue());
        q2.enqueue(66);
        q2.clear();
        q2.enqueue(79);
        System.out.println(q2.dequeue() + "\n");
		
		System.out.println("Sequence 3: ");
		System.out.println(q3.isEmpty());
		q3.enqueue("pawikan");
		q3.enqueue("tarsier");
		System.out.println(q3.peek());
		System.out.println(q3.dequeue());
		System.out.println(q3.isEmpty());
		System.out.println(q3.dequeue());
		System.out.println(q3.dequeue());
		q3.enqueue("tuko");
		q3.enqueue("tamaraw");
		q3.enqueue("dugong");
		System.out.println(q3.dequeue());
		q3.enqueue("haribon");
		q3.enqueue("butanding");
		q3.enqueue("bayawak");
	}
}