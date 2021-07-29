import java.util.Scanner;
public class Cartesian
{
	public static void main (String args[])
	{
		Scanner scan = new Scanner (System.in);
		
		System.out.print ("Please enter the x coordinate: ");
		int x = scan.nextInt();
		
		System.out.print ("Please enter the y coordinate: ");
		int y = scan.nextInt ();
		
		if (x > 0 && y > 0)
		{
			System.out.println ("Point lies in Quadrant 1");
		}
		
		else if (x < 0 && y > 0)
		{
			System.out.println ("Point lies in Quadrant 2");
		}
		
		else if (x < 0 && y < 0)
		{
			System.out.println ("Point lies in Quadrant 3");
		}
		
		else if (x > 0 && y < 0)
		{
			System.out.println ("Point lies in Quadrant 4");
		}
		
		else if (x == 0 && y < 0 || y > 0)
		{
			System.out.println ("Point lies in the X-axis");
		}
		
		else if (y == 0 && x < 0 || x > 0)
		{
			System.out.println ("Point lies in the Y-axis");
		}
		
		else 
		{
			System.out.println ("Point is in the Origin");
		}
		scan.close();
	}
}

//removing else in "else if statement" affects the run time 