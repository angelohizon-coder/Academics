public class Stack<T>
{
	private int maxStkSize = 100;
	private int top = -1;
	private Object[] stk;
	
	public Stack()
	{
		stk = new Object[maxStkSize];		// Container with default value
	}
	
	public Stack(int n)
	{
		if (n > 0) maxStkSize = n;
		
		stk = new Object[maxStkSize];		// Container with updated value
	}
	
	public void clear()
	{
		top = -1;
	}
	
	public boolean isEmpty()
	{
		return (top == -1);		// Returns the value if the its true
	}
	
	public boolean isFull()
	{
		return(top == maxStkSize - 1);
	}
	
	public int push(T el)
	{	
		if (isFull()) return -999;
	
		stk[++top] = el;
		return 1;
	}
	
	public T pop()
	{
		if (isEmpty()) return null;
		
		T el = (T) stk[top--];
		return el;
	}
	
	public T peek()
	{
		if (isEmpty()) return null;
		
		else
		{
			T el = (T) stk[top];
			return el;
		}
	}
}