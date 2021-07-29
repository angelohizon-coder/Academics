public class CNode<T> 
{
    public T info;
    public CNode<T> next;

    public CNode(T el)
    {
        info = el;
        next = null;
    }

    public CNode(T el, CNode<T> ptr)
    {
        info = el;
       	next = ptr;
    }

    public String toString()
    {
        return info.toString();
    }
}