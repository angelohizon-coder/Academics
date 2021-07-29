import java.util.Scanner;
import java.io.*;

public class WriteCustomerList 
{
	public static void main(String[] args) throws IOException
	{
		Scanner scan = new Scanner(System.in);
		BufferedWriter writer =  new BufferedWriter(new FileWriter("WriteCustomerList.txt"));

		System.out.print("Enter number of Records: ");
		int numberRecords = scan.nextInt();

		String idNUmber[] = new String[numberRecords];
		String firstName[] = new String[numberRecords];
		String lastName[] = new String[numberRecords];
		String balanceOwed[] = new String[numberRecords];

		System.out.println("\n----------------\n");

		for(int i = 0; i < numberRecords; i++)
		{
			System.out.print("Enter ID Number: ");
			idNUmber[i] = scan.next();
			writer.write(idNUmber[i]);
			writer.newLine();

			System.out.print("Enter First Name: ");
			firstName[i] = scan.next();
			writer.write(firstName[i]);
			writer.newLine();

			System.out.print("Enter Last Name: ");
			lastName[i] = scan.next();
			writer.write(lastName[i]);
			writer.newLine();

			System.out.print("Enter Balance Owed: ");
			balanceOwed[i] = scan.next();
			writer.write(balanceOwed[i]);
			writer.newLine();
			
			System.out.println("\n----------------\n");
		}

		writer.close();
		scan.close();
	}
}