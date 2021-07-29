import java.util.Scanner;

public class UST
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
			
		System.out.print("Enter Name: ");
		String name = scan.next();
		System.out.print("Enter Department: ");
		String department = scan.next();
		System.out.print("Enter Course: ");
		String course = scan.next();
		System.out.print("Enter Specialization: ");
		String specialization = scan.next();
		System.out.println();
		
		Specialization c = new Specialization(name, department, course, specialization);
		c.display();
			
		scan.close();
	}
}