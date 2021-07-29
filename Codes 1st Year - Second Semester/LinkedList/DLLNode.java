public class DLLNode<T> {
    public T info;
    public DLLNode<T> prev, next;

    public DLLNode(T el)
    {
        info = el;
        next= prev = null;
    }

    public DLLNode(T el, DLLNode<T> p, DLLNode<T> n)
    {
        info = el;
        next = n;
        prev = p;
    }

    public String toString()
    {
        return info.toString();
    }
}