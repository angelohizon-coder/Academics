import java.io.*;
public class ISR
{
	public static void main(String args[]) //throws IOException
	/*{
		System.out.print("Enter some letters: ");
		InputStreamReader isr = new InputStreamReader(System.in);
		int letters = isr.read();
		System.out.println(isr.ready());
		System.out.print("You entered: ");
		while(isr.ready())
		{
			System.out.print((char) letters);
			letters = isr.read();
		}

		isr.close();
		System.out.println("\n----------\n");
	}*/
	{
		try(InputStreamReader isr = new InputStreamReader(System.in))
		{
			System.out.print("Enter some letters: ");
			int letters = isr.read();
			System.out.print("You entered: ");
			while(isr.ready())
			{
				System.out.print((char) letters);
				letters = isr.read();
			}

			isr.close();
			System.out.println("\n----------\n");
		}

		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}