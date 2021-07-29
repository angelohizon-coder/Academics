import java.util.Scanner;

public class JosephusProblem3
{ 
	public static void main(String[] args) 
	{  
		Scanner scan = new Scanner(System.in);
			
		char decision = ' ';
		int count = 0;  
		int position = 0; 
			
		do
		{	
			System.out.print("Input number of persons (n): ");
			count = scan.nextInt();
		
			System.out.print("Input value of K: ");
			position = scan.nextInt();	
			
			String[] name = new String[count];
			
			for(int i = 0; i < count; i++)
			{
				System.out.print("Input Name " + (i+1) + ": ");
				name[i] = scan.next();
			}
			
			josephus(count, position, name);
			
			System.out.print("\nAgain? or Quit? ");
			decision = scan.next().charAt(0);
			
		} while(decision != 'Q');
		
		scan.close();
	} 
	
	public static void josephus(int count, int position, String[] name) 
	{
        Queue<String> queue = new Queue<String>(count);
	
		int ctr = 0;
		int killer = 0;
		
        for (int i = 0; i < count; i++)
		{
            queue.enqueue(name[i]);
        }
		
        while(!queue.isEmpty()) 
		{
            for (int i = 1; i <= position; i++) 
			{
				String eliminatedPosition = queue.dequeue();
				
				if(i == position && ctr == 0)
				{
					System.out.println("The first Person Eliminated is: " + (eliminatedPosition));
					ctr = ctr + 1;
					break;
				}
				
                else if (i == position && ctr != 0) 
				{	 				
					if(ctr == 1)
					{
						System.out.print(eliminatedPosition);	
						ctr = ctr + 1;
						break;
					}
					
					else
					{
						System.out.print(" -> " + eliminatedPosition);	
						break;
					}
                }

                queue.enqueue(eliminatedPosition);
            }
        }
    }
}