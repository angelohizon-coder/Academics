public class SLL<T>
{		
		private SLLNode<T> head, tail;
		
		public SLL()
		{
			head = tail = null;
		}
		
		public boolean isEmpty()
		{
			if (head == null) return true;
				else return false;
		}
		
		public String toString()
		{	    
				String string = "";
				
				SLLNode<T> p = head;
				
				while(p !=null)
				{
					string = string + p.info.toString() + " ";
					p = p.next;
				}
				
				return string;
		}
		
		public void addToHead(T el)
		{
			head = new SLLNode<T>(el, head);
			if (tail == null)
				tail = head;
		}		

		public void addToTail(T el)
		{
			if(isEmpty())
				head = tail = new SLLNode<T>(el, null);

			else
			{
				tail.next = new SLLNode<T>(el, null);
				tail = tail.next;
			}
		}	

		public T deleteFromHead()
		{
			SLLNode<T> snode1;

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

		public int maximumInteger()
		{	
			SLLNode<T> p = head;

			int data = Integer.parseInt(p.info.toString());
			int temp;

			while(p!=null)
			{
				temp = Integer.parseInt(p.info.toString());

				if (temp > data)
					data = temp;
				
				p = p.next;
			}

			return data;
		}

		public String maximumString()
		{
			SLLNode<T> p = head;

			String data = p.info.toString(); 
			String temp;

			while(p!=null)
			{
				temp = p.info.toString();

				if(temp.compareTo(data) > 0)
					data = temp;

				p = p.next;
			}

			return data;
		}

		public int sum()
		{	    
				SLLNode<T> p = head;
				
				int addend;
				int sum = 0;

				while(p !=null)
				{
					addend = Integer.parseInt(p.info.toString());
					sum = sum + addend;
					p = p.next;
				}
				
				return sum;
		}

		public int countNodes()
		{	    
				SLLNode<T> p = head;
				
				int numberOfNodes = 0;

				while(p !=null)
				{
					numberOfNodes++;
					p = p.next;
				}
				
				return numberOfNodes;
		}

		public T replaceInfo(T infoOld, T infoNew)
		{
			SLLNode<T> p = head;

			while(p.info != infoOld)
			{
				p = p.next;
			}

			p.info = infoNew;

			return p.info;
		}

		public void addBeforeInfo(T infoOld, T infoNew)
		{
			SLLNode<T> previous = null;
			SLLNode<T> current = head;

			while(current != null && !current.info.equals(infoOld))
			{
				previous = current;
				current = current.next;
			}

			if(current != null)
				previous.next = new SLLNode<T>(infoNew, current);
		}

		public boolean replaceBeforeInfo(T infoOld, T infoNew)
		{
			try
			{
				if(isEmpty()) return false;

				SLLNode<T> previous = null;
				SLLNode<T> current = head;

				while(current != null && !current.info.equals(infoOld))
				{
					if(infoOld == current.info && previous.info == null)
						return false;

					previous = current;
					current = current.next;
				}

				if(current != null)
				{
					previous.info = infoNew;
					return true;
				}	
			}
			
			catch(NullPointerException mistake)
			{
				System.out.println("The new information has nothing to replace\n");
			}

			return false;
		}
}
		
