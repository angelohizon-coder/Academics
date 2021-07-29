import java.util.Arrays;
import java.util.Scanner;

public class SalesPersonSortD
{
	public static void main (String argsp[])
	{
		Scanner scan = new Scanner(System.in);
		
		SalesPerson[] SPArray = new SalesPerson[10];
		int[] idNum = new int[10];
		int[] salesVal = new int[10];
		
		for(int i = 0;  i < SPArray.length; i++)
		{
			System.out.print("Enter ID Number: ");
			idNum[i] = scan.nextInt();
			
			System.out.print("Enter Salary: ");
			salesVal[i] = scan.nextInt();
		}
		
		/*for(int i = 0; i < SPArray.length; ++i)
		{
			SPArray[i] = new SalesPerson(idNum[i] + i, (salesVal[i] + i * 5000));
		}*/
		
		Arrays.sort(idNum);	
		Arrays.sort(salesVal);	
		
		for(int i = 0; i < SPArray.length; ++i)
		{
			System.out.println(idNum[i] + " " + salesVal[i]);
		}
	}
}