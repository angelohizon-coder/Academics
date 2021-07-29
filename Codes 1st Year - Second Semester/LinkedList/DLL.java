public class DLL<T> 
{
    private DLLNode<T> head, tail;

    public DLL()
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
    	String s = " ";

        DLLNode<T> p = head;

        while(p !=null)
        {
            s = s + p.info.toString() + " ";
            p = p.next;
        }

        return s;
    }

    public void addToHead(T el) 
    {
        if (isEmpty())
            head = tail = new DLLNode<>(el, null, null);
        
        else {
            head = new DLLNode<>(el, null, head);
            head.next.prev = head;
        }
    }


    public void addToTail(T el)
    {
        if(isEmpty())
            head = tail = new DLLNode<T>(el, null, null);

        else 
        {
            tail.next = new DLLNode<T>(el, tail, null);
            tail = tail.next;
        }
    }

    public T deleteHead(){
        DLLNode<T> snode1;
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

    public T deleteTail(){
        DLLNode<T> snode1;

        if(isEmpty())
            return null;

        DLLNode<T> d;

        d = tail;
        T el = d.info;
        if(head == tail)
            head = tail = null;
        else {
            tail = tail.prev;
            tail.next = null;
        }
            return el;

    }
}