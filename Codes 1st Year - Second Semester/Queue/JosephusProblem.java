import java.util.Scanner;

public class JosephusProblem
{ 
	public static void main(String[] args) 
	{  
		Scanner scan = new Scanner(System.in);
			
		char decision = ' ';
		int count = 0;  
		int position = 0; 
			
		do
		{	
			System.out.print("Enter count: ");
			count = scan.nextInt();
		
			System.out.print("Enter position: ");
			position = scan.nextInt();	
			
			josephus(count, position);
			
			//System.out.println(checker(count, position)); 
			
			System.out.print("\nAgain? or Quit? ");
			decision = scan.next().charAt(0);
			
		} while(decision != 'Q');
		
		scan.close();
	}
	
	/*public static void josephus(int count, int position) 
	{
        Queue<Integer> queue = new Queue<Integer>(count);
		
		int ctr = 0;
		
        for (int i = 1; i <= count; i++)
		{
            queue.enqueue(i);
        }
		
        while(!queue.isEmpty()) 
		{
            for (int i = 1; i <= position; i++) 
			{
				int eliminatedPosition = queue.dequeue();
				
				if(ctr == count-1)
				{
					System.out.println("Survivor: " + (eliminatedPosition));
					break;
				}
				
                else if (i == position) 
				{	 
					System.out.println("Eliminated: " + (eliminatedPosition));
                    ctr = ctr + 1;	
					break;
                }

                queue.enqueue(eliminatedPosition);
            }
        }
    }*/
	
	/*public static int checker(int count, int position)
	{
		Stack<Integer> stack = new Stack<Integer>(count);
		
		int[] array = new int[count];
		int killer = 0;
		
		for(int i = 1; i <= count; i++)
			stack.push(i);
		
		for(int j = 1; j <= position; j++)
		{
			array[j] = stack.pop();
			
			if(j == position)
			{
				killer = array[j];
				
				for(int k = position; k > 0; k--)
					stack.push(array[k]);
			}
		}
		
		return killer;
	}*/
	
	/*public static int checker(int n, int k)  
    { 
        int sum = 0; 
  
        // For finding out the removed  
        // chairs in each iteration  
        for(int i = 2; i <= n; i++)  
        { 
            sum = (sum + k) % i; 
        } 
  
        return sum+1; 
    } */
	
	public static void josephus(int n, int k)
	{
		Queue<Integer> q = new Queue<Integer>(n);
		for(int i = 1; i <= n; i++)
			q.enqueue(i);

		System.out.println("There are " + n + " players");
		System.out.println("Eliminated by order: ");

		while(!q.isEmpty()) {

            for (int i = 1; i <= k; i++) {
                int eliminatedPosition = q.dequeue();

                if (i == k) {
                    System.out.print(eliminatedPosition + " ");
                    break;
                }

                q.enqueue(eliminatedPosition);
            }
        }
	}
}
