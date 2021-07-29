import java.util.Scanner;
import java.io.*;

public class DisplaySelectedCustomerByBalance
{
	public static void main(String args[]) throws IOException
	{
		Scanner scan = new Scanner(System.in);
		BufferedReader reader = new BufferedReader(new FileReader("WriteCustomerList.txt"));

		System.out.print("Enter Balance Owed: ");
		String balanceOwed = scan.next();	

		int ctr = 0;

		String arrayString[] = new String[100];
		String readLine = reader.readLine();
		
		for(int i = 0; readLine != null; i++)
		{
			arrayString[i] = readLine;

			if(arrayString[i].equals(balanceOwed))
			{
				for(int j = -3; j != 1; j++)
				{
					
					if(j == 0)
					{
						System.out.println(arrayString[i]);

						readLine = reader.readLine();
					}

					else if(j <= -1)
					{
						System.out.println(arrayString[i+j]);
					}

					ctr++;
				}
			}

			else
				readLine = reader.readLine();
		}

		if(readLine == null && ctr == 0)
			System.out.println("\n-----------------\n" + "\n" + "The Balance Owed you've entered is not within the records");

		reader.close();
		scan.close();
	}
}