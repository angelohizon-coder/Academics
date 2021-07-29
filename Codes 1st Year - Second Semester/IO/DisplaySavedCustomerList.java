import java.io.*;

public class DisplaySavedCustomerList
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader reader = new BufferedReader(new FileReader("WriteCustomerList.txt"));

		String readLine = reader.readLine();

		while(readLine != null)
		{	
			System.out.println(readLine);
			readLine = reader.readLine();
		}

		reader.close();
	}
}