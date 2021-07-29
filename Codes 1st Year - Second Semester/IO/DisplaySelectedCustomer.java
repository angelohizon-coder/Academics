import java.util.Scanner;
import java.io.*;

public class DisplaySelectedCustomer
{
	public static void main(String args[]) throws IOException
	{
		Scanner scan = new Scanner(System.in);
		BufferedReader reader = new BufferedReader(new FileReader("WriteCustomerList.txt"));

		System.out.print("Enter ID Number: ");
		String idNumber = scan.next();

		String readLine = reader.readLine();

		int ctr = 0;

		while(readLine != null)
		{	
			if(readLine.equals(idNumber))
			{
				while(ctr != 4)
				{
					System.out.println(readLine);
					readLine = reader.readLine();
					ctr++;
				}
			}

			else
				readLine = reader.readLine();
		}

		if(readLine == null && ctr == 0)
			System.out.println("\n-----------------\n" + "\n" + "The ID Number you've entered is not within the records");

		reader.close();
		scan.close();
	}
}