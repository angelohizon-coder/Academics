import java.io.*;
class BR
{
	public static void main(String args[])
	{
		/*
		System.out.print("Enter some text and press Enter: ");
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{
			System.out.print("You typed: " + br.readLine());
			System.out.print("\n----------\n");
		}

		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		*/

		try(BufferedReader br = new BufferedReader(new FileReader("(Example).txt")))
		{
			System.out.println("The contents of (Example).txt ...");
			while(br.ready())
			{
				System.out.println(br.readLine());
			}
		}

		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}