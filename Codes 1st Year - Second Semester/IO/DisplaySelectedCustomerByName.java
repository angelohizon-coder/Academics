import java.util.Scanner;
import java.io.*;

public class DisplaySelectedCustomerByName
{
	public static void main(String args[]) throws IOException
	{
		Scanner scan = new Scanner(System.in);
		BufferedReader reader = new BufferedReader(new FileReader("WriteCustomerList.txt"));

		System.out.print("Enter Last Name: ");
		String lastName = scan.next();	

		int ctr = 0;

		String arrayString[] = new String[100];
		String readLine = reader.readLine();
		
		for(int i = 0; readLine != null; i++)
		{
			arrayString[i] = readLine;

			if(arrayString[i].equals(lastName))
			{
				for(int j = -2; j <= 2; j++)
				{
					
					if(j == 1)
					{
						
						readLine = reader.readLine();
						arrayString[i] = readLine;
						System.out.println(arrayString[i]);
					}

					else if(j <= 0)
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
			System.out.println("\n-----------------\n" + "\n" + "The Last Name you've entered is not within the records");

		reader.close();
		scan.close();
	}
}