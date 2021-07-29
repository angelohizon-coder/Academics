public class CLL<T>
{		
		private CNode<T> cptr;
		
		public CLL()
		{
			cptr = null;
		}
		
		public boolean isEmpty()
		{
			if (cptr == null) return true;
				else return false;
		}
		
		public String toString()
		{	    
				String s = " ";
				
				CNode<T> p = cptr;
				
				while(p != cptr)
				{
					s = s + p.info.toString() + " ";
					p = p.next;
				}
				
				return s;
		}
		
		public void addToHead(T el)
		{
			if(cptr == null)
				cptr = new CNode<T>(el, null);

			else
			{
				cptr = new CNode<T>(el, cptr);
				cptr = cptr.next;
			}
		}		

		/*public void addToTail(T el)
		{
			if(isEmpty())
				head = tail = new CLLNode<T>(el, null);

			else
			{
				tail.next = new CLLNode<T>(el, null);
				tail = tail.next;
			}
		}	

		public T deleteFromHead()
		{
			LLNode<T> snode1;

			if(isEmpty())
				return null;

			snode1 = head;
			T el = snode1.info;

			if(head == tail)
				head = tail = null;

			else
				head = head.next;

			return el;
		}

		public T deleteFromTail()
		{
			SLLNode<T> snode1;

			if(isEmpty())
				return null;

			snode1 = tail;
			T el = snode1.info;

			if(head == tail)
				head = tail = null;

			else
			{
				SLLNode<T> p = head;
				for(p = head; p.next != tail; p = p.next)
					{
						//continue
					}
				tail = p;
				tail.next = null;
			}

			return el;
		}

		public T delete(T el)
		{
			SLLNode<T> snode1;

			if(isEmpty())
				return null;

			if(el == head.info)
				return deleteFromHead();

			if(el == tail.info)
				return deleteFromTail();

			SLLNode<T> pred = head;
			SLLNode<T> t = head.next;

			while(t != null && t.info != el)
			{
				pred = pred.next;
				t = t.next;
			}

			if(t == null)
				return null;

			else
				pred.next = t.next;

			return el;
		}

		/*public SLLNode<T> max()
		{	SLLNode<T> temp, p;
		
			p = head;
			temp.info = p.info;
			
			while(p!=null)
			{
				p = p.next;
				if (temp.info.compareTo(p.info)>0)
					temp.info = p.info;
			}
			return temp.info;
		}*/
}
		
